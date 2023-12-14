package com.zipchelin.web.controller;

import com.zipchelin.model.dto.UserLoginDto;
import com.zipchelin.model.dto.UserRequestDto;
import com.zipchelin.model.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/user/*")
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String viewLogin() {
    	
        return "user/login";
    }

    @GetMapping("/sign-up")
    public String viewSignUp(@ModelAttribute("params") UserRequestDto params) {
        return "user/sign_up";
    }

    @PostMapping("/sign-up")
    public String signUp(@Validated @ModelAttribute("params") UserRequestDto params, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.info("에러 발생 = {}", bindingResult);
            return "user/sign_up";
        }

        String userName = userService.saveUser(params);
        return "redirect:/user/login";
    }

    @GetMapping("/find")
    public String viewfind() {
        return "user/find";
    }

    @GetMapping("/finding")
    public String viewfinding() {
        return "user/finding";
    }

    @GetMapping("/leave-check")
    public String viewleaveCheck() {
        return "user/leave_check";
    }

    @GetMapping("/leave-done")
    public String viewleaveDong() {
        return "user/leave_done";
    }

    @GetMapping("/email-auth")
    public String viewEmailAuth() {
        return "user/email_auth";
    }
}
