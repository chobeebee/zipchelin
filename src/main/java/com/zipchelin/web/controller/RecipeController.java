package com.zipchelin.web.controller;

import com.zipchelin.model.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/recipe/*")
public class RecipeController {

	private static final Logger log=LoggerFactory.getLogger(RecipeController.class);

	//private final RecipeService recipeService;
	@Autowired
	private RecipeService recipeService;

	//모델객체가 request.get,setattribute를 대신하는것이라 생각하면 편함
	@GetMapping("/list")
	public String recipe(Model model) {
		log.info("레시피 목록 페이지 진입");
		model.addAttribute("recipeList", recipeService.selectRecipeAll());
		return "content/recipe/recipe_list";
	}

	// ajax 못하면... 혹시
	//	@GetMapping("/list/{catNum}") //<요청>list에서 cate별로 요청이 오는 첫번째 게이트
	//	public String recipeCategory(@PathVariable("catNum") int catNum, Model model) {
	//		RecipeListRequestDto cateNum = RecipeService.selectAllCate(catNum);
	//		model.addAttribute("recipeCategory", cateNum);
	//		return "content/recipe/recipe_list";
	//	}

	@GetMapping("/detail")
	public String viewRecipe() {
		return "content/recipe/recipe_detail";
	}

}
