package com.zipchelin.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zipchelin.model.dto.community.myrecipe.MyrecipeDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponseDto;
import com.zipchelin.model.dto.community.qna.QnaRequestDto;
import com.zipchelin.model.dto.community.qna.QnaResponseDto;
import com.zipchelin.model.service.MyrecipeService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/community/myrecipe*")
@Controller
@RequiredArgsConstructor
public class MyrecipeController {

	@Autowired
	private final MyrecipeService myrecipeService;
	
	@GetMapping("")
	public String viewMyrecipe(@ModelAttribute("params") final MyrecipeDto params, Model model) {
		List<MyrecipeResponseDto> myrecipe = myrecipeService.findAllMyrecipe(params);
		model.addAttribute("myrecipe", myrecipe);
		model.addAttribute("params", params);
		return "content/myrecipe/myrecipe";
	}
	
	@GetMapping("/form")
	public String myRecipeForm(@RequestParam(value="id",required = false) final Long id,Model model) {
		if(id!=null) {
			MyrecipeResponseDto myrecipe = myrecipeService.findMyrecipeById(id);
			model.addAttribute("myrecipe", myrecipe);
		}
		return "content/myrecipe/myrecipe_form";
	}
	
	@PostMapping("/save")
	public String saveMyrecipe(final MyrecipeRequestDto params) {
		long myreNum = myrecipeService.saveMyrecipe(params);
		return "redirect:/community/myrecipe/post/" + myreNum;
	}
	
	@GetMapping("/post/{num}")
	public String myRecipePost(@PathVariable("num") Long id, Model model) {
		MyrecipeResponseDto myrecipe= myrecipeService.findMyrecipeById(id);
		model.addAttribute("myrecipe", myrecipe);
		return "content/myrecipe/myrecipe_post";
	}
	
	@GetMapping("/delete/{num}")
	public String deleteMyrecipe(@PathVariable("num") final Long id) {
		myrecipeService.deleteMyrecipe(id);
		return "redirect:/community/myrecipe/";
	}
	
	@GetMapping("/update/{num}")
	public String updateFormMyrecipe(@PathVariable("num") final Long id,Model model) {
		if(id!=null) {
			MyrecipeResponseDto myrecipe = myrecipeService.findMyrecipeById(id);
			model.addAttribute("myrecipe",myrecipe);
		}
		return "content/myrecipe/myrecipe_update";
	}
	
	@PostMapping("/update/{num}")
	public String updateMyrecipe(@PathVariable("num") Long myreNum, @ModelAttribute MyrecipeRequestDto params, HttpServletRequest request) throws IOException {
		
		long num = params.getMyreNum();
		System.out.println(num);
		
		myrecipeService.updateMyrecipe(params);
		
		return "redirect:/community/qna/post/" + myreNum;
	}
}
