package com.zipchelin.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.dto.admin.recipe.RecipeListResponseDto;
import com.zipchelin.repository.RecipeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class RecipeService {

	private final RecipeRepository recipeRepository;

	public List<RecipeListResponseDto> selectRecipeAll(){
		List<Recipe> recipeList=recipeRepository.selectRecipeAll();
		List<RecipeListResponseDto> dtoList=new ArrayList<RecipeListResponseDto>();
		for(Recipe rec:recipeList) {
			dtoList.add(rec.toDto());
		}
		return dtoList;
	};

	public List<Recipe> selectEachCategory(int cateNum){
		return recipeRepository.selectEachCategory(cateNum);
	};

	public int selectMaxNum() {
		int maxRecNum ;

		return 0;

	};

	public void addRecipe(Recipe recipe) {

	};

	public void updateRecipe(Recipe recipe) {

	};

	public void delRecipe(int recNum) {

	};
}
