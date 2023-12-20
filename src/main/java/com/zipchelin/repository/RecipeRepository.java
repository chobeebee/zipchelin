package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.Recipe;

public interface RecipeRepository {

	public List<Recipe> selectRecipeAll();

	public List<Recipe> selectEachCategory(int cateNum);

	public int selectMaxNum();

	public void addRecipe(Recipe recipe);

	public void updateRecipe(Recipe recipe);

	public void delRecipe(int recNum);
}
