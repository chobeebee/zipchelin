package com.zipchelin.web.controller;

import com.zipchelin.model.dto.member.MemberLoginDto;
import com.zipchelin.model.dto.member.MemberRequestDto;
import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.model.service.MemberService;
import com.zipchelin.web.exception.DuplicateException;
import com.zipchelin.web.resolver.Login;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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
                            @Login MemberResponseDto loginMember,
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

    @GetMapping("/auth/kakao")
    @ResponseBody
    public String kakaoLogin(@RequestParam("code") String code) {

        // Http header 생성
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");

        // Http body 생성
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "authorization_code");
        params.add("client_id", "240ed63fb7fd0d14c407e95cfcc365f0");
        params.add("redirect_uri", "http://localhost:8090/member/auth/kakao");
        params.add("code", code);

        // 생성된 header와 body를 하나의 오브젝트에 담기
        HttpEntity<MultiValueMap<String, String>> kakaoTokenRequest = new HttpEntity<>(params, headers);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(
                "https://kauth.kakao.com/oauth/token",
                HttpMethod.POST,
                kakaoTokenRequest,
                String.class
        );

        return response.getBody();
    }

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
