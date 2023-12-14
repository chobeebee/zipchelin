package com.zipchelin.web.controller;

import com.zipchelin.model.dto.member.MemberLoginDto;
import com.zipchelin.model.dto.member.MemberRequestDto;
import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.model.service.MemberService;
import com.zipchelin.web.exception.DuplicateException;
import com.zipchelin.web.resolver.Login;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String viewLogin(@ModelAttribute("params") MemberLoginDto params, @Login MemberResponseDto loginMember) {
        if (loginMember != null) {
            return "redirect:/";
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

//    @PostMapping("/login")
//    public String memberLogin(@Validated @ModelAttribute("params") MemberLoginDto params, BindingResult bindingResult, HttpServletRequest request) {
//
//        // NullPointer 에러가 발생하면 캐치해서 글로벌 검증 메시지로 반환
//        try {
//            MemberResponseDto loginmember = memberService.login(params);
//
//            HttpSession session = request.getSession();
//            session.setAttribute(ConstField.LOGIN_MEMBER, loginmember);
//            session.setMaxInactiveInterval(60 * 30);    // 30분
//
//        } catch (UsernameNotFoundException e) {
//            bindingResult.reject("loginError", e.getMessage());
//            return "member/login";
//        }
//
//        return "redirect:/";
//    }

    @GetMapping("/sign-up")
    public String viewSignUp(@Login MemberResponseDto loginMember, @ModelAttribute("params") MemberRequestDto params) {
        if (loginMember != null) {
            return "redirect:/";
        }
        return "member/sign_up";
    }

    @PostMapping("/sign-up")
    public String signUp(@Validated @ModelAttribute("params") MemberRequestDto params, BindingResult bindingResult) {

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

    @GetMapping("/find")
    public String viewfind() {
        return "member/find";
    }

    @GetMapping("/finding")
    public String viewfinding() {
        return "member/finding";
    }

    @GetMapping("/leave-check")
    public String viewleaveCheck() {
        return "member/leave_check";
    }

    @GetMapping("/leave-done")
    public String viewleaveDong() {
        return "member/leave_done";
    }

    @GetMapping("/email-auth")
    public String viewEmailAuth() {
        return "member/email_auth";
    }
}
