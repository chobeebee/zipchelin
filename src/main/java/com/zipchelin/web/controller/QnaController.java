package com.zipchelin.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zipchelin.domain.qna.QnaRequest;
import com.zipchelin.domain.qna.QnaResponse;
import com.zipchelin.model.service.QnaService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/qna/*")
public class QnaController {
	
	private final QnaService qnaService;
	
	@GetMapping("")
    public String viewQna(Model model) {
		List<QnaResponse> qna= qnaService.findAllQna();
		model.addAttribute("qna",qna);
        return "content/qna/qna";
    }
	
//	@GetMapping("/qna_post")
//    public String postQna() {
//        return "content/qna/qna_post";
//    }
	
	@GetMapping("/qna_post")
    public String postQna(@RequestParam final String id, Model model) {
		QnaResponse qna= qnaService.findQnaById(id);
		model.addAttribute("qna",qna);
        return "content/qna/qna_post";
    }
	
	@GetMapping("/qna_form")
    public String formQna(@RequestParam(value="id",required = false) final String id,Model model) {
			if(id!=null) {
				QnaResponse qna = qnaService.findQnaById(id);
				model.addAttribute("qna",qna);
			}
        return "content/qna/qna_form";
    }
	
	@PostMapping("/qna/save")
	public String saveQna(final QnaRequest params) {
		qnaService.saveQna(params);
		System.out.println("아이디:" +params);
		return "redirect:/qna/qna";
	}
	
	@GetMapping("/qna/delete")
	public String deleteQna(@RequestParam final String id) {
		qnaService.deleteQna(id);
		return "redirect:/qna/qna";
	}
	
}
