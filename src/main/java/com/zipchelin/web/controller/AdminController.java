package com.zipchelin.web.controller;

import lombok.RequiredArgsConstructor;

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
	
	// 공지사항 CURD
	@GetMapping("/notice")
    public String notice(Model model) {
		model.addAttribute("noticeList", noticeService.selectAll());
		return "admin/content/notice";
	}
	
	@GetMapping("/addnotice")
    public String viewAddNotice() {
		return "admin/content/addNotice";
	}
	
	@PostMapping("/addnotice")
    public String addNotice(Notice notice) {
		noticeService.addNotice(notice);
		return "redirect:/admin/notice";
	}
	
	@GetMapping("/updatenotice")
    public String viewUpdateNotice() {
		return "admin/content/updateNotice";
	}
	
	@PostMapping("/updatenotice")
    public String updateNotice(Notice notice) {
		noticeService.updateNotice(notice);
		return "redirect:/admin/notice";
	}
	
	@GetMapping("/delNotice")
    public String delNotice() {
		return "redirect:/admin/notice";
	}
	
	
	// 
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
