package com.zipchelin.web.controller;

import com.zipchelin.global.security.provider.CustomAuthenticationProvider;
import com.zipchelin.global.security.provider.CustomUserDetails;
import com.zipchelin.model.dto.member.EmailDto;
import com.zipchelin.model.dto.member.FindIdDto;
import com.zipchelin.model.dto.member.FindPwdDto;
import com.zipchelin.model.dto.member.MemberSaveDto;
import com.zipchelin.model.service.MemberService;
import com.zipchelin.web.exception.BusinessLogicException;
import com.zipchelin.web.exception.DuplicateException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {

    private final MemberService memberService;
    private final CustomAuthenticationProvider provider;

    @GetMapping("/login")
    public String viewLogin(@AuthenticationPrincipal CustomUserDetails loginMember,
                            HttpServletRequest request) {

        if (loginMember != null) {
            return "redirect:/";
        }
        String prevPage = request.getHeader("Referer");
        if (prevPage != null && !prevPage.contains("/login") && !prevPage.contains("/sign-up") && !prevPage.contains("/find")) {
            request.getSession().setAttribute("prevPage", prevPage);
        }

        return "member/login";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null) {
            new SecurityContextLogoutHandler().logout(request, response, authentication);
        }

        return "redirect:/";
    }

    @GetMapping("/sign-up")
    public String viewSignUp(@ModelAttribute("params") MemberSaveDto params, HttpServletRequest request) {

        // 이메일 인증 쿠키가 남아있을 경우 인증 로직을 건너뜀
        Optional<Cookie> emailAuthCookie = Arrays.stream(request.getCookies())
                .filter(cookie -> "emailAuth".equals(cookie.getName()))
                .findFirst();
        emailAuthCookie.ifPresent(cookie -> params.setEmailAuth(Boolean.parseBoolean(cookie.getValue())));

        return "member/sign_up";
    }

    @PostMapping("/sign-up")
    public String signUp(@Validated @ModelAttribute("params") MemberSaveDto params,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {

        if (!params.getMemberPwd().equals(params.getPwdConfirm())) {
            bindingResult.rejectValue("pwdConfirm", "errorCode", "입력한 비밀번호와 일치해야 합니다.");
            return "member/sign_up";
        }

        if (bindingResult.hasErrors()) {
            return "member/sign_up";
        }

        // 서비스에서 발생시킨 커스텀 에러를 캐치해서 특정 검증 메시지로 반환
        try {
            String memberName = memberService.saveMember(params);
            redirectAttributes.addFlashAttribute("welcomeMsg", memberName + "님 가입을 환영합니다!");
        } catch (DuplicateException e) {
            bindingResult.rejectValue("idAuth", "errorCode", e.getMessage());
            return "member/sign_up";
        } catch (BusinessLogicException e) {
            bindingResult.rejectValue("emailAuth", "errorCode", e.getMessage());
            return "member/sign_up";
        }

        return "redirect:/member/login";
    }

    @ResponseBody
    @PostMapping("/sendMail")
    public ResponseEntity<String> sendEmail(@Validated @RequestBody EmailDto params) {
        String email = params.getEmail();
        try {
            memberService.mailForm(email);
        } catch (BusinessLogicException e) {
            return ResponseEntity.ok(e.getMessage());
        }
        return ResponseEntity.ok("success");
    }

    @ResponseBody
    @PostMapping("/confirmMail")
    public ResponseEntity<Boolean> confirmMail(@RequestBody EmailDto params, HttpServletResponse response) {

        if (memberService.confirmEmail(params)) {
            Cookie cookie = new Cookie("emailAuth", "true");
            cookie.setMaxAge(60 * 5); // 이메일 인증 여부는 5분 동안 유효
            response.addCookie(cookie);
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.ok(false);
    }

    @ResponseBody
    @PostMapping("/confirmId")
    public ResponseEntity<Boolean> confirmId(@RequestBody Map<String, String> params) {

        String id = params.get("id");
        if (memberService.countId(id)) {
            return ResponseEntity.ok(true);
        }
        return ResponseEntity.ok(false);
    }

    @GetMapping("/find")
    public String viewFind(@ModelAttribute("findIdDto") FindIdDto findIdDto,
                           @ModelAttribute("findPwdDto")FindPwdDto findPwdDto) {
        return "member/find";
    }

    @PostMapping("/find/id")
    public String findId(@Validated @ModelAttribute("findIdDto") FindIdDto findIdDto,
                         BindingResult bindingResult,
                         @ModelAttribute("findPwdDto") FindPwdDto findPwdDto,
                         RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "member/find";
        }

        try {
            String memberId = memberService.findId(findIdDto);
            redirectAttributes.addFlashAttribute("memberId", memberId);
        } catch (BusinessLogicException e) {
            log.info("글로벌 에러 발생 = {}", e.getMessage());
            bindingResult.reject("exception", e.getMessage());
            return "member/find";
        }

        return "redirect:/member/finding";
    }

    @PostMapping("/find/pwd")
    public String findPwd(@Validated @ModelAttribute FindPwdDto findPwdDto,
                          BindingResult bindingResult,
                          @ModelAttribute FindIdDto findIdDto,
                          Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("pwdError", "pwdError");
            return "member/find";
        }

        try {
            memberService.pwdReset(findPwdDto);
        } catch (BusinessLogicException e) {
            log.info("글로벌 에러 발생 = {}", e.getMessage());
            model.addAttribute("pwdError", "pwdError");
            bindingResult.reject("exception", e.getMessage());
            return "member/find";
        }

        return "redirect:/member/login";
    }

    @GetMapping("/finding")
    public String viewFinding() {
        return "member/finding";
    }

    @GetMapping("/leave-check")
    public String viewLeaveCheck() {
        return "member/leave_check";
    }

    @GetMapping("/leave-done")
    public String viewLeaveDone() {
        return "member/leave_done";
    }
}
