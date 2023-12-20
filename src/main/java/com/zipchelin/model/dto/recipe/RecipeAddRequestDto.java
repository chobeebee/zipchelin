package com.zipchelin.model.dto.recipe;

import javax.validation.constraints.NotBlank;

import com.zipchelin.domain.Recipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class RecipeAddRequestDto {

	@NotBlank
	private int recNum;

	@NotBlank
	private int cateNum;

	//(recten 은 0 아님 1로!)
	@NotBlank
	private int recTen;

	@NotBlank
	private String recTitle;

	@NotBlank
	private String recSubt;

	@NotBlank
	private String recIngreMain;

	@NotBlank
	private String recIngreSub;

	@NotBlank
	private String recTool;
	//만약 첫 요청이라면?(또는 오는 =값이 null이면) 전체보기 보여주게

	//도메인 객체로 보낼
	public Recipe toEntity()
	{
		return Recipe.builder()
				.recNum(recNum)
				.cateNum(cateNum)
				.recTen(recTen)
				.recTitle(recTitle)
				.recSubt(recSubt)
				.recIngreMain(recIngreMain)
				.recIngreSub(recIngreSub)
				.recTool(recTool)
				.build();
	}
}
