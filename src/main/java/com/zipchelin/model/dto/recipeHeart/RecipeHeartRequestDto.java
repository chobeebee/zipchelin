package com.zipchelin.model.dto.recipeHeart;

import javax.validation.constraints.NotBlank;

import com.zipchelin.domain.Myrecipe;
import com.zipchelin.domain.RecipeHeart;
import com.zipchelin.model.dto.myrecipe.MyrecipeRequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

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
