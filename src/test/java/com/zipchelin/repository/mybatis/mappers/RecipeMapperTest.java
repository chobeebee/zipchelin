package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.admin.Recipe;
import com.zipchelin.model.service.RecipeService;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RecipeMapperTest {

    @Autowired
    RecipeMapper recipeMapper;
    
    @Autowired
    RecipeService recipeService;

    /* @Test
    @Disabled
    void selectAllRecipe() {
        List<Recipe> list = recipeMapper.selectRecipeAll();
        System.out.println(list);
    }*/
    
    @Test
    void addRecipe() {
    	for(int i=1; i<9; i++) {
    		Recipe recipe=Recipe.builder()
    				.recNum(i)
    				.cateNum(i)
    				.recView(i)
    				.recTen(0)
    				.recTitle("손이가요 손이가"+i)
    				.recSubt("없어서 못 먹는 탕수육")
    				.recDesc("여태까지 이런 맛은 없었다 이것은 돼지고기인가 소고기인가")
    				.recIngreMain("돼지고기소고기")
    				.recIngreSub("닭고기양고기")
    				.recTool("웍")
    				.recImg0("sample.jpg")
    				.build();
    		recipeService.addRecipe(recipe);
    	}
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