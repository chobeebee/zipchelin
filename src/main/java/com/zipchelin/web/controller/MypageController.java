package com.zipchelin.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartRequest;

import com.zipchelin.model.dto.member.MemberRequestDto;

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
	
	//수정 하기 전 비밀번호 체크
	@PostMapping("/pwdCheck")
	public String pwdCheck(@RequestParam("pwdCheck") String pwd, HttpServletRequest request) {
		String next=null;
		//cn후 수정(유저정보 위치불명)
		String userPwd=(String) request.getSession().getAttribute("user_pwd");
		if(userPwd==pwd) {
			next="mypage/myedit";
		}else if(userPwd!=pwd) {
			//추후 수정(비밀번호 불일치 에러구현)
			next="mypage/mypwdConfirm";
		}
		return next;
	}
	
	//기존 정보 출력
	
	//정보 수정
	@PostMapping("/edit")
	public String edit(
			@RequestParam("id") String memberId,
			@RequestParam("pwd") String memberPwd,
			@RequestParam("pwdCheck") String memberPwdCheck,
			@RequestParam("name") String memberName,
			@RequestParam("email") String memberEmail,
			@RequestParam("tel") String memberPhone,
			MultipartRequest multipartRequest) {
		
		//추후 수정(multipartRequest로 이미지를 저장 후 이미지 이름을 반환)
		String memberImg=null;
		
		if(memberPwd!=memberPwdCheck) {
			//추후 수정(비밀번호와 비밀번호 확인이 일치하지 않는 오류처리)
		}else if(memberPwd==memberPwdCheck){
			MemberRequestDto dto=new MemberRequestDto(memberId,memberPwd,memberName,memberEmail,memberPhone, memberImg);
			//추후 수정(dto를 가져가 DB에 업데이트)
		}
		return "mypage/mypage";
	}
	
}
