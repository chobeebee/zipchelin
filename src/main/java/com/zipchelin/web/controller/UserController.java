package com.zipchelin.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user/*")
public class UserController {

    @GetMapping("/login")
    public String viewLogin() {
        return "user/login";
    }

    @GetMapping("/sign-up")
    public String viewSignUp() {
        return "user/sign_up";
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
}
