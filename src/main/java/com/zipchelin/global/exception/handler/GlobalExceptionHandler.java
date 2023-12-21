package com.zipchelin.global.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UsernameNotFoundException.class)
    String userNameNotFoundHandle(UsernameNotFoundException e, Model model) {
        log.info("가입되지 않은 아이디로 로그인 시도 = {}", e.getMessage());
        model.addAttribute("error", e.getMessage());
        return "/member/login";
    }

    @ExceptionHandler(BadCredentialsException.class)
    String badCredentialsHandle(BadCredentialsException e, Model model) {
        log.info("잘못된 비밀번호로 로그인 시도 = {}", e.getMessage());
        model.addAttribute("error", e.getMessage());
        return "/member/login";
    }
}
