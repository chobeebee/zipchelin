package com.zipchelin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MypageController {
	
	@GetMapping("/")
    public String mypage() {
		return "mypage/mypage";
	}

	@GetMapping("/myedit")
	public String myedit() {
		return "mypage/myedit";
	}

	@GetMapping("/myheart")
	public String myheart() {
		return "mypage/myheart";
	}

	@GetMapping("/mypost")
	public String mypost() {
		return "mypage/mypost";
	}

	@GetMapping("/myreply")
	public String myreply() {
		return "mypage/myreply";
	}

	@GetMapping("/pwdConfirm")
	public String pwdConfirm() {
		return "mypage/mypwdConfirm";
	}
}
