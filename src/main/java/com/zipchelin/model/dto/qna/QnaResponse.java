package com.zipchelin.model.dto.qna;

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
}
