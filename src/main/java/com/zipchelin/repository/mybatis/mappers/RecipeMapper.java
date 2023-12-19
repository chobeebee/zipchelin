package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Recipe;

@Mapper
public interface RecipeMapper {

	void addRecipe(Recipe recipe);

	//리스트 목록
	List<Recipe> selectRecipeAll();

	void updateRecipe(Recipe recipe);

	void delRecipe(int recNum);
}
