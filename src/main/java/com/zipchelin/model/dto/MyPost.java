package com.zipchelin.model.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import com.zipchelin.domain.Myrecipe;
import com.zipchelin.domain.Qna;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MyPost {
	private String myreOrQna;
	private LocalDateTime postDate;
	private Myrecipe myrecipe;
	private Qna qna;
}
