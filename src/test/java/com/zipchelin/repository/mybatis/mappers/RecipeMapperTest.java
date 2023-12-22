package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.admin.Recipe;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RecipeMapperTest {

    @Autowired
    RecipeMapper recipeMapper;

    @Test
    @Disabled
    void selectAllRecipe() {
        List<Recipe> list = recipeMapper.selectRecipeAll();
        System.out.println(list);
    }

    //	@Test
    //	void addRecipe() {
    //		RecipeAddRequestDto addValue = RecipeAddRequestDto.builder()
    //				.recNum(133)
    //				.cateNum(2)
    //				.recTitle("안녕하세여")
    //				.recSubt("안녕하세여")
    //				.recImg0("안녕하세여")
    //				.recDesc0("안녕하세여")
    //				.recIngreMain("안녕하세여")
    //				.recIngreSub("안녕하세여")
    //				.recTool("안녕하세여")
    //				.recImg1("안녕하세여")
    //				.recDesc1("안녕하세여")
    //				.recImg2("안녕하세여")
    //				.recDesc2("안녕하세여")
    //				.recImg3("안녕하세여")
    //				.recDesc3("안녕하세여")
    //				.recTen(1)
    //				.build();
    //	}

}