package com.zipchelin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MypageController {
	
	@GetMapping("/home")
    public String myPage() {
		return "mypage/mypage";
	}

	@GetMapping("/myedit")
	public String myEdit() {
		return "mypage/myedit";
	}

	@GetMapping("/myheart")
	public String myHeart() {
		return "mypage/myheart";
	}

	@GetMapping("/mypost")
	public String myPost() {
		return "mypage/mypost";
	}

	@GetMapping("/myreply")
	public String myReply() {
		return "mypage/myreply";
	}

	@GetMapping("/pwdConfirm")
	public String pwdConfirm() {
		return "mypage/mypwdConfirm";
	}
}
