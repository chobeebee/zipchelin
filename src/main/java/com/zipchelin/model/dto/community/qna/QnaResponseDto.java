package com.zipchelin.model.dto.community.qna;

import com.zipchelin.domain.community.Qna;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class QnaResponseDto {
    private long qnaNum;
    private String memberId;
    private String qnaTitle;
    private String qnaContent;
    private LocalDateTime qnaDate;
    private int qnaReCount;
    private int qnaUp;

    public Qna toEntity() {
        return Qna.builder()
                .qnaNum(qnaNum)
                .memberId(memberId)
                .qnaTitle(qnaTitle)
                .qnaContent(qnaContent)
                .qnaDate(qnaDate)
                .qnaUp(qnaUp)
                .qnaReCount(qnaReCount)
                .build();
    }
}
