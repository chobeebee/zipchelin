package com.zipchelin.model.dto.recipe;

import com.zipchelin.domain.Recipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class RecipeListRequestDto {

    @NotBlank
    private int cateNum;
    //만약 첫 요청이라면?(또는 오는 =값이 null이면) 전체보기 보여주게


    //도메인 객체로 보낼
    public Recipe toEntity() {
        return Recipe.builder()
                .cateNum(cateNum)
                .build();
    }
}
