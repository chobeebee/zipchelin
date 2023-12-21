package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Recipe;

@Mapper
public interface RecipeMapper {

	public List<Recipe> selectRecipeAll();

	public List<Recipe> selectEachCategory(int cateNum);

	public long selectMaxNum();

	public void addRecipe(Recipe recipe);

	public void updateRecipe(Recipe recipe);

	public void delRecipe(long recNum);
}
