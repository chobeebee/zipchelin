package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.dto.common.Pagination;
import com.zipchelin.model.dto.common.SearchDto;

public interface RecipeRepository {

	public List<Recipe> selectRecipeAll(final SearchDto params);

	public List<Recipe> selectEachCategory(int cateNum);

	public long selectMaxNum();

	public long addRecipe(Recipe recipe);

	public void updateRecipe(Recipe recipe);

	public void delRecipe(long recNum);
	
	int count(final SearchDto params);
}
