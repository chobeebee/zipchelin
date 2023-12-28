package com.zipchelin.model.dto.community.qna;

import java.time.LocalDateTime;

import com.zipchelin.domain.community.Qna;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class QnaRequestDto {
	
	private Long qnaNum;
    private String memberId;
    private String qnaTitle;
    private String qnaContent;
    private LocalDateTime qnaDate;

    public Qna toEntity() {
        return Qna.builder()
        		.qnaNum(qnaNum)
                .memberId(memberId)
                .qnaTitle(qnaTitle)
                .qnaContent(qnaContent)
                .qnaDate(qnaDate)
                .build();
    }
}
