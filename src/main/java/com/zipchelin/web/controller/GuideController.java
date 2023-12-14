package com.zipchelin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/guide/*")
public class GuideController {
	
	@GetMapping("/list")
    public String guide() {
		return "content/guide/guide_list";
	}
	@GetMapping("/detail")
	public String viewGuide() {
		return "content/guide/guide_detail";
	}
}
