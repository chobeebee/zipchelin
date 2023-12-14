package com.zipchelin.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {
	
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
	
	@GetMapping("/notice")
    public String notice() {
		return "admin/content/notice";
	}
	
	@GetMapping("/editnotice")
    public String editNotice() {
		return "admin/content/editNotice";
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
