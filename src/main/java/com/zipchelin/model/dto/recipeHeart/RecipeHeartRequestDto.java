package com.zipchelin.model.dto.recipeHeart;

import com.zipchelin.domain.RecipeHeart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class RecipeHeartRequestDto {
    @NotBlank
    private int pickId;

    @NotBlank
    private int recNum;

    @NotBlank
    private String userId;

    public RecipeHeart toEntity() {
        return RecipeHeart.builder()
                .pickId(pickId)
                .recNum(recNum)
                .userId(userId)
                .build();
    }
}
