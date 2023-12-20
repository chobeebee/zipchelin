package com.zipchelin.domain;

import java.time.LocalDateTime;

import com.zipchelin.model.dto.guideHeart.GuideHeartRequestDto;
import com.zipchelin.model.dto.recipeHeart.RecipeHeartRequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class RecipeHeart {
	private int pickId;
	private int recNum;
	private String userId;
	private LocalDateTime recPickDatetime;
	
	public RecipeHeartRequestDto fromDto() {
		return RecipeHeartRequestDto.builder()
				.pickId(pickId)
				.recNum(recNum)
				.userId(userId)
				.build();
	}
}
