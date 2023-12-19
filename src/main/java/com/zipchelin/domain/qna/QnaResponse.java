package com.zipchelin.domain.qna;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class QnaResponse {
	
	private Long qnaNum;
	private String userId;
	private String qnaTitle;
	private String qnaContent;
	private LocalDate qnaDate;
	private int qnaUp;
	private int qnaReCount;
	private String userImg;
}
