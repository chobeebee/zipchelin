package com.zipchelin.domain.qna;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaRequest {
	
	private Long qna_num;
	private String user_id;
	private String qna_title;
	private String qna_content;
	private String user_img;
}
