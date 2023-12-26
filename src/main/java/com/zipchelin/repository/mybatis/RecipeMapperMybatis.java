package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.dto.admin.recipe.RecipeListRequestDto;
import com.zipchelin.model.dto.admin.recipe.RecipeListResponseDto;
import com.zipchelin.model.dto.common.SearchDto;
import com.zipchelin.repository.RecipeRepository;
import com.zipchelin.repository.mybatis.mappers.RecipeMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor //파이널인 녀석들만 필드 만들어줌
public class RecipeMapperMybatis implements RecipeRepository {

	private final RecipeMapper recipeMapper;

	@Override
	public List<Recipe> selectRecipeAll(final SearchDto params) {
		return recipeMapper.selectRecipeAll(params);
	}

	@Override
	public List<Recipe> selectEachCategory(int cateNum) {
		return recipeMapper.selectEachCategory(cateNum);
		//return null;
	}

	@Override
	public int count(final SearchDto params) {
		return recipeMapper.count(params);
	}

	@Override
	public long selectMaxNum() {
		return 0;
	}

	@Override
	public long addRecipe(Recipe recipe) {
		recipeMapper.addRecipe(recipe);
		return recipe.getRecNum();
	}

	@Override
	public void updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delRecipe(long recNum) {
		// TODO Auto-generated method stub

	}

}
