package com.zipchelin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zipchelin.model.dto.admin.notice.PageMakerDTO;
import com.zipchelin.model.dto.admin.page.Criteria;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponse;
import com.zipchelin.model.service.MyrecipeService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/community/myrecipe*")
@Controller
@RequiredArgsConstructor
public class MyrecipeController {

	@Autowired
	private final MyrecipeService myrecipeService;
	
	@GetMapping("")
	public String getMyrecipe(Model model, Criteria cri) {
		model.addAttribute("myrecipeList", myrecipeService.getListPaging(cri));
		
		int total = myrecipeService.getTotal();
		PageMakerDTO pageMake = new PageMakerDTO(cri, total);
		model.addAttribute("pageMaker", pageMake);
		return "content/myrecipe/myrecipe";
	}
	
	@GetMapping("/form")
	public String myRecipeForm(@RequestParam(value="id",required = false) final Long id,Model model) {
		if(id!=null) {
			MyrecipeResponse myrecipe = myrecipeService.findMyrecipeById(id);
			model.addAttribute("myrecipe", myrecipe);
		}
		return "content/myrecipe/myrecipe_form";
	}
	
	@GetMapping("/post/{num}")
	public String myRecipePost(@PathVariable("num") Long id, Model model) {
		MyrecipeResponse myrecipe= myrecipeService.findMyrecipeById(id);
		model.addAttribute("myrecipe", myrecipe);
		return "content/myrecipe/myrecipe_post";
	}
	
	
}
