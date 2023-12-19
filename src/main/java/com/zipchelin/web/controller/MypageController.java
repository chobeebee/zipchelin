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

import com.zipchelin.config.auth.CustomUserDetails;
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
	public String mypage(Model model,@AuthenticationPrincipal CustomUserDetails userDetails) {
		/*
		String id=userDetails.getMember().getMemberId();
		model.addAttribute("count", mypageService.selectCount(id));
		model.addAttribute("myPostList",mypageService.selectMyPostList2(id));
		*/
		return "mypage/mypage";
	}
	
	@GetMapping("/pwdConfirm")
	public String pwdConfirm() {
		return "mypage/mypwdConfirm";
	}
	
	@GetMapping("/myedit")
	public String mypageEdit(@AuthenticationPrincipal CustomUserDetails userDetails,@RequestParam("pwdCheck") String pwd, Model model) {
		/*String next=null;
		
		//1. 입력된 비밀번호를 가지고 DAO로 가서 비밀번호 일치 여부 확인
		String id=userDetails.getMember().getMemberId();
		String result=mypageService.checkPwd(id, pwd);
		if(result.equals("true")) {
			next="mypage/myedit";
			//2. 세션에서 가져온 아이디로 유저를 검색해 유저정보를 jsp에 넘김
			model.addAttribute("member", mypageService.selectMemberById(id)) ;
		}else {
			next="mypage/mypage";
		}
		return next;*/
		return "mypage/myedit";
	}
	
	@GetMapping("/mypost")
	public String mypost(Model model, @AuthenticationPrincipal CustomUserDetails userDetails) {
		//String id=userDetails.getMember().getMemberId();
		//model.addAttribute("myPostList",mypageService.selectMyPostList(id));
		return "mypage/mypost";
	}
	
	@GetMapping("/myheart")
	public String myheart() {
		return "mypage/myheart";
	}
	
	@GetMapping("/myreply")
	public String myreply() {
		return "mypage/myreply";
	}

}
