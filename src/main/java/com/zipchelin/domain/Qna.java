package com.zipchelin.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Qna {
	private int qna_num;
	private String user_id;
	private String qna_title;
	private String qna_content;
	private Date qna_date;
	private int qna_up;
	private String user_img;
}
