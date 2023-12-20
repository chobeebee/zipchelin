package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.Recipe;
import com.zipchelin.repository.mybatis.mappers.RecipeMapper;

@Repository
//@RequiredArgsConstructor //파이널인 녀석들만 필드 만들어줌
public class RecipeMapperMybatis implements RecipeMapper{

	@Override
	public List<Recipe> selectRecipeAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recipe> selectEachCategory(int cateNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRecipeImg(Recipe recipe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRecipeDesc(Recipe recipe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRecipe(Recipe recipe) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delRecipe(int recNum) {
		// TODO Auto-generated method stub

	}

}
