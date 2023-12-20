package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.Recipe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecipeMapper {

    public List<Recipe> selectRecipeAll();

    public List<Recipe> selectEachCategory(int cateNum);

    public int selectMaxNum();

    public void addRecipe(Recipe recipe);

    public void updateRecipe(Recipe recipe);

    public void delRecipe(int recNum);
}
