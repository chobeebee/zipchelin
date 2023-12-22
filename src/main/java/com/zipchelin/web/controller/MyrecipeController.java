package com.zipchelin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zipchelin.model.dto.admin.notice.PageMakerDTO;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.model.service.MyrecipeService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/myrecipe/*")
@Controller
@RequiredArgsConstructor
public class MyrecipeController {

	@Autowired
	private final MyrecipeService myrecipeService;
	
	@GetMapping("/myrecipe")
	public String getMyrecipe(Model model, Criteria cri) {
		model.addAttribute("myrecipeList", myrecipeService.getListPaging(cri));
		
		int total = myrecipeService.getTotal();
		PageMakerDTO pageMake = new PageMakerDTO(cri, total);
		model.addAttribute("pageMaker", pageMake);
		return "content/myrecipe/myrecipe";
	}
	
	@GetMapping("/myrecipeform")
	public String myRecipeForm() {
		return "content/myrecipe/myrecipe_form";
	}
	
	@GetMapping("/myrecipepost")
	public String myRecipePost() {
		return "content/myrecipe/myrecipe_post";
	}
	
	
	//요리상담소 이동
	@GetMapping("/qna")
	public String qna() {
		return "content/qna/qna";
	}
	
	@GetMapping("/qnaform")
	public String qnaForm() {
		return "content/qna/qna_form";
	}
	
	@GetMapping("/qnapost")
	public String qnaPost() {
		return "content/qna/qna_post";
	}
	
}
