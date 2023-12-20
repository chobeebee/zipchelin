package com.zipchelin.domain;

import java.sql.Date;

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
	private Date recDate;
	private int recTen;
	private String recTitle;
	private String recSubt;
	private String recIngreMain;
	private String recIngreSub;
	private String recTool;
	//private (String/int) userId; //리스트에서 하트?

	//recipe_page_img
	private int recImgId;
	private String recImgFileName;
	private int RecImgNo;

	//recipe_page_desc
	private int recTextId;
	private String recText;
	private int recTextNo;



	public RecipeListResponseDto toDto() {
		return RecipeListResponseDto.builder()
				.recNum(recNum)
				.cateNum(cateNum)
				.recTitle(recTitle)
				.recSubt(recSubt)
				.build();
	}
}
