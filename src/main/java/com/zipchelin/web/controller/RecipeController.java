package com.zipchelin.web.controller;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.dto.admin.recipe.RecipeListRequestDto;
import com.zipchelin.model.dto.admin.recipe.RecipeListResponseDto;
import com.zipchelin.model.dto.common.Pagination;
import com.zipchelin.model.dto.common.SearchDto;
import com.zipchelin.model.service.RecipeService;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String recipe(@ModelAttribute("params") final SearchDto params,Model model) {
		//log.info("레시피 목록 페이지 진입");
		List<RecipeListResponseDto> recipeList = recipeService.selectRecipeAll(params);
		model.addAttribute("recipeList", recipeList);
		model.addAttribute("params", params);
		return "content/recipe/recipe_list";
	}
	
	@GetMapping("/list/{cateNum}")
    public @ResponseBody List<RecipeListResponseDto> selectEachCategory(@PathVariable(required = false) Integer cateNum){
        List<RecipeListResponseDto> recipeList=recipeService.selectEachCategory(cateNum);
        return recipeList;
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
