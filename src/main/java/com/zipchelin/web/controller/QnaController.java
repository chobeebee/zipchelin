package com.zipchelin.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zipchelin.model.dto.community.qna.QnaDto;
import com.zipchelin.model.dto.community.qna.QnaRequestDto;
import com.zipchelin.model.dto.community.qna.QnaResponseDto;
import com.zipchelin.model.service.QnaService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequiredArgsConstructor
@RequestMapping("/community/qna*")
public class QnaController {
	
	private final QnaService qnaService;
	
	@GetMapping("")
    public String viewQna(@ModelAttribute("params") final QnaDto params, Model model) {

		List<QnaResponseDto> qna= qnaService.findAllQna(params);
		
		model.addAttribute("qna",qna);
		model.addAttribute("params", params);
        return "content/qna/qna";
    }
	
	@PostMapping("/upload")
    public String postQna() {
        return "content/qna/upload";
    }
	
	@GetMapping("/post/{num}")  // /qna/post/id값
    public String postQna(@PathVariable("num") Long id, Model model) {
		QnaResponseDto qna= qnaService.findQnaById(id);
		model.addAttribute("qna",qna);
        return "content/qna/qna_post";
    }
	
	@GetMapping("/form")
    public String saveFormQna(@RequestParam(value="id",required = false) final Long id,Model model) {
			if(id!=null) {
				QnaResponseDto qna = qnaService.findQnaById(id);
				model.addAttribute("qna",qna);
			}
        return "content/qna/qna_form";
    }
	
	@PostMapping("/save")
	public String saveQna(final QnaRequestDto params) {
		Long qnaNum = qnaService.saveQna(params);
		return "redirect:/community/qna/post/" + qnaNum;
	}
	
	@GetMapping("/delete/{num}")
	public String deleteQna(@PathVariable("num") final Long id) {
		qnaService.deleteQna(id);
		return "redirect:/community/qna/";
	}
	
	@GetMapping("/update/{num}")
	public String updateFormQna(@PathVariable("num") final Long id,Model model) {
		if(id!=null) {
			QnaResponseDto qna = qnaService.findQnaById(id);
			model.addAttribute("qna",qna);
		}
		return "content/qna/qna_update";
	}
	
	@PostMapping("/update/{num}")
	public String updateQna(@PathVariable("num") Long qnaNum, @ModelAttribute QnaRequestDto params, HttpServletRequest request) throws IOException {
		
		long num = params.getQnaNum();
		System.out.println(num);
		
		qnaService.updateQna(params);
		
		return "redirect:/community/qna/post/" + qnaNum;
	}
	
}
