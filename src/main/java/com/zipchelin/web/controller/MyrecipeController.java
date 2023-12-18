package com.zipchelin.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/myrecipe/*")
public class MyrecipeController {
	
	@GetMapping("/")
    public String admin() {
		return "content/recipe/recipe_list";
	}
	
	@GetMapping("/recipe_detail")
    public String delMem() {
		return "content/recipe/recipe_detail";
	}
	
}
