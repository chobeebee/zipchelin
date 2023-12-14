package com.zipchelin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/qna/*")
public class QnaController {
	
	@GetMapping
    public String viewQna() {
        return "content/qna/qna";
    }
	
	@GetMapping("/post")
    public String postQna() {
        return "content/qna/qna_post";
    }
	
	@GetMapping("/form")
    public String formQna() {
        return "content/qna/qna_form";
    }
}
