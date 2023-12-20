package com.zipchelin.domain;

import java.sql.Date;

import com.zipchelin.model.dto.Myheart;
import com.zipchelin.model.dto.recipe.RecipeListResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor //mvc 모델 필드 만들어주는 놈?
public class Recipe {

	//recipe_tbl
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
	//private (String/int) userId; //리스트에서 하트?

	//
	public RecipeListResponseDto toDto() {
		return RecipeListResponseDto.builder()
				.recNum(recNum)
				.cateNum(cateNum)
				.recTitle(recTitle)
				.recSubt(recSubt)
				.build();
	}
	
	public Myheart toMyheart() {
		return Myheart.builder()
				.guiOrRec("rec")
				.heartDate(recDate)
				.recipe(this)
				.guide(null)
				.build();
	}
}
