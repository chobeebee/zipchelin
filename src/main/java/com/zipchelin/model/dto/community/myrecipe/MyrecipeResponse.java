package com.zipchelin.model.dto.community.myrecipe;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class MyrecipeResponse {
	private Long myreNum;
    private String userId;
    private String myreTitle;
    private String myreContent;
    private LocalDate myreDate;
    private int myreUp;
    private int myreReCount;
}
