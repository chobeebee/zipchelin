package com.zipchelin.model.dto.qna;

import java.sql.Date;

import com.zipchelin.domain.Qna;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class QnaResponseDto {
	private int qnaNum;
	private String userId;
	private String qnaTitle;
	private String qnaContent;
	private Date qnaDate;
	private int qnaUp;
	
	public Qna toEntity() {
		return Qna.builder()
				.qnaNum(qnaNum)
				.userId(userId)
				.qnaTitle(qnaTitle)
				.qnaContent(qnaContent)
				.qnaDate(qnaDate)
				.qnaUp(qnaUp)
				.build();
	}
}
