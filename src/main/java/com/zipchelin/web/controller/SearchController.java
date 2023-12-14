package com.zipchelin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

public class SearchController {

	@Controller
	@RequiredArgsConstructor
	@RequestMapping("/search/*")
	public class RecipeController {

		@GetMapping("/list")
		public String guide() {
			return "content/search/search_list";
		}// 서치 요청, 서치 탭 구현 이해하기...
	}
}
