package com.zipchelin.model.dto.recipe;

import java.sql.Date;

import com.zipchelin.domain.Recipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class RecipeDetailResponseDto {

	private int recNum;
	private int cateNum;
	private String recTitle;
	private String recSubt;
	private String recImg0;
	private String recDesc0;
	private String recIngreMain;
	private String recIngreSub;
	private String recTool;
	private String recImg1;
	private String recDesc1;
	private String recImg2;
	private String recDesc2;
	private String recImg3;
	private String recDesc3;
	private Date recDate;
	private int recView;
	private int recTen;

	//private int recTen;

	//도메인 객체로 보낼
	public Recipe toEntity()
	{
		return Recipe.builder()
				.recNum(recNum)
				.cateNum(cateNum)
				.recTitle(recTitle)
				.recSubt(recSubt)
				.recImg0(recImg0)
				.recDesc0(recDesc0)
				.recIngreMain(recIngreMain)
				.recIngreSub(recIngreSub)
				.recTool(recTool)
				.recImg1(recImg1)
				.recDesc1(recDesc1)
				.recImg2(recImg2)
				.recDesc2(recDesc2)
				.recImg3(recImg3)
				.recDesc3(recDesc3)
				.recTen(recTen)
				.build();
	}
}
