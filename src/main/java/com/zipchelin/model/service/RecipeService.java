package com.zipchelin.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.dto.admin.recipe.RecipeListResponseDto;
import com.zipchelin.model.dto.common.PagingDto;
import com.zipchelin.model.dto.common.SearchDto;
import com.zipchelin.repository.RecipeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class RecipeService {

	private final RecipeRepository recipeRepository;

	public List<RecipeListResponseDto> selectRecipeAll(final SearchDto params){
		int totalCount = recipeRepository.count(params);
		if(totalCount < 1) {
			return null;
		}
		
		PagingDto paging = new PagingDto(totalCount, params);
		params.setPaging(paging);
		
		List<Recipe> recipeList=recipeRepository.selectRecipeAll(params);
		List<RecipeListResponseDto> dtoList=new ArrayList<RecipeListResponseDto>();
		for(Recipe rec:recipeList) {
			dtoList.add(rec.toDto());
		}
		
		return dtoList;
	};

	public List<RecipeListResponseDto> selectEachCategory(int cateNum){
		List<Recipe> recipeList=recipeRepository.selectEachCategory(cateNum);
		List<RecipeListResponseDto> dtoList=new ArrayList<RecipeListResponseDto>();
		for(Recipe rec:recipeList) {
			dtoList.add(rec.toDto());
		}
		
		return dtoList;
	};

	public int selectMaxNum() {
		int maxRecNum ;

		return 0;

	};

	public long addRecipe(Recipe recipe) {
		return recipeRepository.addRecipe(recipe);
	};

	public void updateRecipe(Recipe recipe) {

	};

	public void delRecipe(int recNum) {

	};
}
