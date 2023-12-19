package com.zipchelin.web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//@Controller
@RequestMapping("smarteditor")
public class EditorController {

//	@Autowired
//	MyrecipeService myrecipeService;
	
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
