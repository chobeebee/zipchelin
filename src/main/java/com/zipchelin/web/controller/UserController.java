package com.zipchelin.web.controller;

import com.zipchelin.model.dto.common.MessageDto;
import com.zipchelin.model.dto.user.UserLoginDto;
import com.zipchelin.model.dto.user.UserRequestDto;
import com.zipchelin.model.dto.user.UserResponseDto;
import com.zipchelin.model.service.UserService;
import com.zipchelin.web.ConstField;
import com.zipchelin.web.exception.DuplicateException;
import com.zipchelin.web.resolver.Login;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/user/*")
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String viewLogin(@ModelAttribute("params") UserLoginDto params, @Login UserResponseDto loginUser) {
        if (loginUser != null) {
            return "redirect:/";
        }
        return "user/login";
    }

    @PostMapping("/login")
    public String userLogin(@Validated @ModelAttribute("params") UserLoginDto params, BindingResult bindingResult, HttpServletRequest request) {

        // NullPointer 에러가 발생하면 캐치해서 글로벌 검증 메시지로 반환
        try {
            UserResponseDto loginUser = userService.login(params);

            HttpSession session = request.getSession();
            session.setAttribute(ConstField.LOGIN_USER, loginUser);
            session.setMaxInactiveInterval(60 * 30);    // 30분

        } catch (NullPointerException e) {
            bindingResult.reject("loginError", e.getMessage());
            return "user/login";
        }

        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/";
    }

    @GetMapping("/sign-up")
    public String viewSignUp(@Login UserResponseDto loginUser, @ModelAttribute("params") UserRequestDto params) {
        if (loginUser != null) {
            return "redirect:/";
        }
        return "user/sign_up";
    }

    @PostMapping("/sign-up")
    public String signUp(@Validated @ModelAttribute("params") UserRequestDto params, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "user/sign_up";
        }

        // Duplicate 에러가 발생하면 캐치해서 글로벌 검증 메시지로 반환
        try {
            String userName = userService.saveUser(params);
        } catch (DuplicateException e) {
            bindingResult.reject("duplicate", e.getMessage());
            return "user/sign_up";
        }

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
