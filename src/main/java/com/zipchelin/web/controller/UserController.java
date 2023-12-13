package com.zipchelin.web.controller;

import com.zipchelin.model.dto.common.MessageDto;
import com.zipchelin.model.dto.user.UserLoginDto;
import com.zipchelin.model.dto.user.UserRequestDto;
import com.zipchelin.model.dto.user.UserResponseDto;
import com.zipchelin.model.service.UserService;
import com.zipchelin.web.ConstField;
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
    public String viewLogin(@Login UserResponseDto loginUser) {
        if (loginUser != null) {
            return "redirect:/";
        }
        return "user/login";
    }

    @PostMapping("/login")
    public String userLogin(@ModelAttribute("params") UserLoginDto params, HttpServletRequest request, Model model) {

        UserResponseDto loginUser = userService.login(params);

        if (loginUser == null) {
            MessageDto message = new MessageDto("아이디 또는 비밀번호 오류입니다.", "/user/login");
            model.addAttribute("message", message);
            return "alert";
        }

        HttpSession session = request.getSession();
        session.setAttribute(ConstField.LOGIN_USER, loginUser);
        session.setMaxInactiveInterval(60 * 30);    // 30분

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
