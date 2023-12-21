package com.zipchelin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zipchelin.model.dto.notice.PageMakerDTO;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.model.service.MyrecipeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/community/*")
@Controller
@RequiredArgsConstructor
public class CommunityController {

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
	
	
	
}
