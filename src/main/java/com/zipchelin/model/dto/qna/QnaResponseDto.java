package com.zipchelin.model.dto.qna;

import com.zipchelin.domain.Qna;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class QnaResponseDto {
    private long qnaNum;
    private String userId;
    private String qnaTitle;
    private String qnaContent;
    private LocalDateTime qnaDate;
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
