package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.Recipe;

public interface RecipeRepository {

	void addRecipe(Recipe recipe);

	//리스트 목록
	List<Recipe> selectRecipeAll();

	void updateRecipe(Recipe recipe);

	void delRecipe(int recNum);
}
