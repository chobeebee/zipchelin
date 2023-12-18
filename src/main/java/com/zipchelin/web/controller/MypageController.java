package com.zipchelin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.model.service.MypageService;
import com.zipchelin.web.resolver.Login;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MypageController {
	
	@Autowired
	private final MypageService mypageService;
	
	@GetMapping("/test")
	@ResponseBody
	public String test(@Login MemberResponseDto loginMember) {
		
		System.out.println(loginMember.getMemberEmail());
		System.out.println(loginMember.getMemberName());
		
		return "세션확인";
	}
	
	@GetMapping("/mypage")
	public String mypage() {
		return "mypage/mypage";
	}
	
	@GetMapping("/pwdConfirm")
	public String pwdConfirm() {
		return "mypage/mypwdConfirm";
	}
	
	@PostMapping("/myedit")
	public String mypageEdit(@RequestParam("pwdCheck") String pwd) {
		String next=null;
		if(pwd.equals("1234")) {
			next="mypage/myedit";
		}else {
			next="mypage/mypage";
		}
		return next;
	}

}
