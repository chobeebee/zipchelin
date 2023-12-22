package com.zipchelin.model.dto.community.qna;

import com.zipchelin.domain.community.Qna;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class QnaRequestDto {
	
	private Long qnaNum;
    private String userId;
    private String qnaTitle;
    private String qnaContent;

    public Qna toEntity() {
        return Qna.builder()
        		.qnaNum(qnaNum)
                .userId(userId)
                .qnaTitle(qnaTitle)
                .qnaContent(qnaContent)
                .build();
    }
}
