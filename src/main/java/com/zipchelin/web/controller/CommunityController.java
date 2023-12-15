package com.zipchelin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("/community/*")
@Controller
@RequiredArgsConstructor
public class CommunityController {

	@GetMapping("/myrecipeform")
	public String myRecipeForm() {
		return "content/myrecipe/myrecipe_form";
	}
}
