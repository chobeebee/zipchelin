package com.zipchelin.web.controller;

import com.zipchelin.global.provider.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    public String Home() {
        return "index";
    }

    @GetMapping("/test")
    @ResponseBody
    public String getMember(@AuthenticationPrincipal CustomUserDetails userDetails) {
        log.info("로그인 회원 정보 = {}", userDetails.getMember());
        return "회원 정보 확인하기";
    }
}