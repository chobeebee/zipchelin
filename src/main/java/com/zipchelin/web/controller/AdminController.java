package com.zipchelin.web.controller;

import lombok.RequiredArgsConstructor;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.service.NoticeService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {
	
	@Autowired
	private NoticeService noticeService;
	
	// 관리자 페이지 이동
	@GetMapping
    public String admin() {
		return "admin/admin";
	}
	
	@GetMapping("/delmem")
    public String delMem() {
		return "admin/content/delMem";
	}
	
	@GetMapping("/editmem")
    public String editMem() {
		return "admin/content/editMem";
	}
	
	// 공지사항 CRUD
	// 공지사항 조회
	@GetMapping("/notice")
    public String notice(Model model) {
		model.addAttribute("noticeList", noticeService.selectAll());
		return "admin/content/notice";
	}
	
	// 공지사항 추가 페이지 이동
	@GetMapping("/addnotice")
    public String viewAddNotice() {
		return "admin/content/addNotice";
	}
	
	// 공지사항 추가 실행
	@PostMapping("/addnotice")
    public String addNotice(Notice notice) {
		noticeService.addNotice(notice);
		return "redirect:/admin/notice";
	}
	
	// 공지사항 수정 페이지 이동
	@GetMapping("/updatenotice")
    public String viewUpdateNotice(Integer noticeNum, Model model) {
		model.addAttribute("noticeInfo", noticeService.getPage(noticeNum));
		return "admin/content/updatenotice";
	}
	
	// 공지사항 수정 실행
	@PostMapping("/updatenotice")
    public String updateNotice(Notice notice) {
		noticeService.updateNotice(notice);
		return "redirect:/admin/notice";
	}
	
	// 공지사항 삭제
	@PostMapping("/delnotice")
    public String delNotice(Integer noticeNum, HttpServletRequest request) {
		String [] ajaxMsg = request.getParameterValues("valueArr");
		int size = ajaxMsg.length;
		for(int i=0; i<size; i++) {
			noticeService.delNotice(ajaxMsg[i]);
		}
		return "redirect:/admin/notice";
	}
	
	
	@GetMapping("/guide")
    public String guide() {
		return "admin/content/guide";
	}
	
	@GetMapping("/recipe")
    public String recipe() {
		return "admin/content/recipe";
	}
	
	@GetMapping("/editrecipe")
    public String editRecipe() {
		return "admin/content/editrecipe";
	}
	
	@GetMapping("/community")
    public String community() {
		return "admin/content/community";
	}
}
