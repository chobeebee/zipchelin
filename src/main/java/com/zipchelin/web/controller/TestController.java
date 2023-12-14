//package com.zipchelin.web.controller;
//
//import java.util.HashMap;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.zipchelin.model.dto.QnaListDto;
//
//import lombok.RequiredArgsConstructor;
//
//@Controller
//
//public class TestController {
//	
//	@Autowired
//	BoardServiceImpl boardservice;
//	
//	@GetMapping("/getBoardList")
//	@ResponseBody
//	private List<QnaListDto> getBoardList(Model model) throws Exception {
//		
//		List<QnaListDto> results = QnaListService.getBoardList();
//		
//		return results;
//		
//	}
//	
//	
//}
