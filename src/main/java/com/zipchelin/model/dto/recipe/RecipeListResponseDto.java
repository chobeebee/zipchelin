package com.zipchelin.model.dto.recipe;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class RecipeListResponseDto {
	private int recNum;
	private int catNum;
	private Date recDate; //데이트타입을??히잉
	private int recView;
	//private int recTen  카테고리랑 합칠 수 있나?흠
	private int recTitle;
	private String recSubt;
	private String recDesc;
	private String recIngreMain;
	private String recIngreSub;
	private String recTool;

}
