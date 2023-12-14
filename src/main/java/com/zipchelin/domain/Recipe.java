package com.zipchelin.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Recipe {
	//1. 데이터 객체 필드
	private int recNum;
	private int catNum;
	private Date recDate; //데이트타입을??
	private int recView;
	//private int recTen  카테고리랑 합칠 수 있나?
	private int recTitle;
	private String recSubt;
	private String recDesc;
	private String recIngreMain;
	private String recIngreSub;
	private String recTool;
}
