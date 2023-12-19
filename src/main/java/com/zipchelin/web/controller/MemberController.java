package com.zipchelin.web.controller;

import com.zipchelin.global.auth.CustomUserDetails;
import com.zipchelin.model.dto.member.EmailDto;
import com.zipchelin.model.dto.member.MemberLoginDto;
import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.model.dto.member.MemberSaveDto;
import com.zipchelin.model.service.MemberService;
import com.zipchelin.web.exception.BusinessLogicException;
import com.zipchelin.web.exception.DuplicateException;
import com.zipchelin.web.resolver.Login;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String viewLogin(@ModelAttribute("params") MemberLoginDto params,
                            @AuthenticationPrincipal CustomUserDetails loginMember,
                            @RequestParam(required = false) String error,
                            Model model) {

        if (loginMember != null) {
            return "redirect:/";
        }
        model.addAttribute("error", error);

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
    public String viewSignUp(@Login MemberResponseDto loginMember, @ModelAttribute("params") MemberSaveDto params) {
        if (loginMember != null) {
            return "redirect:/";
        }
        return "member/sign_up";
    }

    @PostMapping("/sign-up")
    public String signUp(@Validated @ModelAttribute("params") MemberSaveDto params, BindingResult bindingResult) {

        if (!params.getMemberPwd().equals(params.getPwdConfirm())) {
            bindingResult.reject("pwdCheck");
        }

        if (bindingResult.hasErrors()) {
            return "member/sign_up";
        }

        // Duplicate 에러가 발생하면 캐치해서 글로벌 검증 메시지로 반환
        try {
            String memberName = memberService.saveMember(params);
        } catch (DuplicateException e) {
            bindingResult.reject("duplicate", e.getMessage());
            return "member/sign_up";
        }

        return "redirect:/member/login";
    }

    @ResponseBody
    @PostMapping("/sendMail")
    public ResponseEntity<EmailDto> sendEmail(@RequestBody EmailDto params) {
        String email = params.getEmail();
        log.info("이메일 받음! = {}", email);

        try {
            memberService.mailForm(email);
        } catch (BusinessLogicException e) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.noContent().build();
    }

    @ResponseBody
    @PostMapping("/confirmMail")
    public ResponseEntity<Boolean> confirmMail(@RequestBody EmailDto params) {
        return ResponseEntity.ok(memberService.confirmEmail(params));
    }

    @GetMapping("/find")
    public String viewFind() {
        return "member/find";
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

    @GetMapping("/email-auth")
    public String viewEmailAuth() {
        return "member/email_auth";
    }
}
