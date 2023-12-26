package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.dto.admin.recipe.RecipeListRequestDto;
import com.zipchelin.model.dto.admin.recipe.RecipeListResponseDto;
import com.zipchelin.model.dto.common.SearchDto;

@Mapper
public interface RecipeMapper {

	public List<Recipe> selectRecipeAll(final SearchDto params);

	public List<Recipe> selectEachCategory(int cateNum);
	
	int count(final SearchDto params);

	public long selectMaxNum();

	public void addRecipe(Recipe recipe);

	public void updateRecipe(Recipe recipe);

	public void delRecipe(long recNum);
}
