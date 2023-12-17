package com.zipchelin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("/community/*")
@Controller
@RequiredArgsConstructor
public class CommunityController {

	@GetMapping("/myrecipe")
	public String myRecipe() {
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
