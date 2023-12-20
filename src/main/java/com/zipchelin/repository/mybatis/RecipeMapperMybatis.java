package com.zipchelin.repository.mybatis;

import com.zipchelin.domain.Recipe;
import com.zipchelin.repository.mybatis.mappers.RecipeMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@RequiredArgsConstructor //파이널인 녀석들만 필드 만들어줌
public class RecipeMapperMybatis implements RecipeMapper {

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
    public int selectMaxNum() {
        return 0;
    }

    @Override
    public void addRecipe(Recipe recipe) {
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
