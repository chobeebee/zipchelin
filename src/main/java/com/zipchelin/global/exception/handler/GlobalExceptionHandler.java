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

//    @ExceptionHandler(UsernameNotFoundException.class)
//    String userNameNotFoundHandle(UsernameNotFoundException e, Model model) {
//        model.addAttribute("error", e.getMessage());
//        return "/member/login";
//    }
//
//    @ExceptionHandler(BadCredentialsException.class)
//    String badCredentialsHandle(BadCredentialsException e, Model model) {
//        model.addAttribute("error", e.getMessage());
//        return "/member/login";
//    }
}
