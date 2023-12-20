package com.zipchelin.web.controller;

import com.zipchelin.global.auth.CustomUserDetails;
import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.model.service.MypageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String mypage(Model model, @AuthenticationPrincipal CustomUserDetails userDetails) {
        String id = userDetails.getMember().getMemberId();
        model.addAttribute("count", mypageService.selectCount(id));
        //model.addAttribute("myPostList",mypageService.selectMyPostList2(id));
        return "mypage/mypage";
    }

    @GetMapping("/pwdConfirm")
    public String pwdConfirm() {
        return "mypage/mypwdConfirm";
    }

    @PostMapping("/myedit")
    public String mypageEdit(@AuthenticationPrincipal CustomUserDetails userDetails, @RequestParam("pwdCheck") String pwd, Model model) {
        //DB의 비밀번호가 암호화 되어있어 비교 불가.
		/*String next=null;
		
		//1. 입력된 비밀번호를 가지고 DAO로 가서 비밀번호 일치 여부 확인
		String id=userDetails.getMember().getMemberId();
		String result=mypageService.checkPwd(id, pwd);
		System.out.println("result="+result);
		
		if(result.equals("true")) {
			next="mypage/myedit";
			//2. 세션에서 가져온 아이디로 유저를 검색해 유저정보를 jsp에 넘김
			MemberResponseDto member=mypageService.selectMemberById(id);
			model.addAttribute("member", member);
			int i=member.getMemberEmail().indexOf("@");
			model.addAttribute("preEmail", member.getMemberEmail().substring(0,i));
			model.addAttribute("subEmail", member.getMemberEmail().substring(i+1,member.getMemberEmail().length()));
		}else {
			next="mypage/mypage";
		}
		return next;
		*/
        //테스트 이한비객체
        MemberResponseDto hanbi = new MemberResponseDto("hanbi0411", "이한비", "hanbi5849@gmail.com", null, null, null, null);
        model.addAttribute("member", hanbi);
        int gol = hanbi.getMemberEmail().indexOf("@");
        model.addAttribute("preEmail", hanbi.getMemberEmail().substring(0, gol));
        model.addAttribute("subEmail", hanbi.getMemberEmail().substring(gol + 1, hanbi.getMemberEmail().length()));
        return "mypage/myedit";
    }

    @GetMapping("/mypost")
    public String mypost(Model model, @AuthenticationPrincipal CustomUserDetails userDetails) {
        //String id=userDetails.getMember().getMemberId();
        //model.addAttribute("myPostList",mypageService.selectMyPostList(id));
        return "mypage/mypost";
    }

    @GetMapping("/myheart")
    public String myheart(Model model, @AuthenticationPrincipal CustomUserDetails userDetails) {
        String id = userDetails.getMember().getMemberId();
        //model.addAttribute("heartList", mypageService.selectHeartList(id));
        return "mypage/myheart";
    }

    @GetMapping("/myreply")
    public String myreply() {
        return "mypage/myreply";
    }

}
