package com.zipchelin.model.dto.recipe;

import com.zipchelin.domain.Recipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class RecipeListResponseDto {

	private long recNum;
	private int cateNum;
	private String recTitle;
	private String recSubt;
	private String recImg0;
	//private (String/int) userId; 하트 띄우기??, if 세션없으면 빈하트만 구현
	//db 두테이블 띄우기

	public Recipe toEntity() {
		return Recipe.builder()
				.recNum(recNum)
				.cateNum(cateNum)
				.recTitle(recTitle)
				.recSubt(recSubt)
				.recImg0(recImg0)
				.build();
	}
}
