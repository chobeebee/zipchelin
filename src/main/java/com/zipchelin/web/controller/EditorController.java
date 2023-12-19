package com.zipchelin.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.zipchelin.model.service.MyrecipeService;

@Controller
@RequestMapping("smarteditor")
public class EditorController {

	@Autowired
	MyrecipeService myrecipeService;
	
	@RequestMapping("/")
	public ModelAndView insertEditor(HttpServletRequest req, ModelMap model) throws Exception {
		ModelAndView mav = new ModelAndView("smarteditor/newPost");
		
		return mav;
	}
	
	/*@RequestMapping("/savePost")
	public View savePost(HttpServletRequest req, ModelMap model) throws Exception {
		ModelMap model = new ModelMap();
		model.addAttribute("result", HttpStatus.OK);
		
		myrecipeService.savePost(Post);
		
		return new MappingJackson2JsonView();
	}
	*/
}
