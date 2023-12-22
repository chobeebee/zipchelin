package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.dto.admin.recipe.RecipeListResponseDto;

public interface RecipeRepository {

	public List<Recipe> selectRecipeAll();

	public List<Recipe> selectEachCategory(int cateNum);

	public long selectMaxNum();

	public void addRecipe(Recipe recipe);

	public void updateRecipe(Recipe recipe);

	public void delRecipe(long recNum);
}
