package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Recipe;

@Mapper
public interface RecipeMapper {

	//리스트 목록
	List<Recipe> selectRecipeAll();

	List<Recipe> selectEachCategory(int cateNum);

	void addRecipe(Recipe recipe);

	void addRecipeImg(Recipe recipe);

	void addRecipeDesc(Recipe recipe);

	void updateRecipe(Recipe recipe);

	void delRecipe(int recNum);
}
