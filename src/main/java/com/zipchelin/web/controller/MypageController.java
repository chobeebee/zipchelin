package com.zipchelin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zipchelin.model.service.MypageService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage/*")
public class MypageController {
	
	@Autowired
	private final MypageService mypageService;
	
	@GetMapping("/test")
	@ResponseBody
	public String test(@AuthenticationPrincipal UserDetails userDetails) {
		
		System.out.println(userDetails.getUsername());
		
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
	public String mypageEdit(@RequestParam("pwdCheck") String pwd, Model model) {
		String next=null;
		//수정할 것
		//1. 입력된 비밀번호를 가지고 DAO로 가서 비밀번호 일치 여부 확인
		//2. 세션에서 가져온 아이디로 유저를 검색해 유저정보를 jsp에 넘김
		if(pwd.equals("1234")) {
			next="mypage/myedit";
			//mypageService.selectMemberById("id");
		}else {
			next="mypage/mypage";
		}
		return next;
	}

}
