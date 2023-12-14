package com.zipchelin.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QnaListDto {
	
	private int qna_num;
	private String user_id;
	private String qna_title;
	private String qna_content;
	private Date qna_date;
	private int qna_up;
	private int qna_re_count;
	private String user_img;
	
}
