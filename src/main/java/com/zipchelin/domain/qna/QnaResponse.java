package com.zipchelin.domain.qna;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class QnaResponse {
	
	private Long qna_num;
	private String user_id;
	private String qna_title;
	private String qna_content;
	private LocalDate qna_date;
	private int qna_up;
	private int qna_re_count;
	private String user_img;
}
