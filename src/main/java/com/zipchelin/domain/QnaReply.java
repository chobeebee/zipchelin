package com.zipchelin.domain;

import com.zipchelin.model.dto.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.qnaReply.QnaReplyResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class QnaReply {
    private long qReNum;
    private long qnaNum;
    private int Order;
    private String reId;
    private String reContent;
    private int reUp;
    private LocalDateTime reDate;

    public QnaReplyResponseDto toDto() {
        return QnaReplyResponseDto.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .Order(Order)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }

    public QnaReplyRequestDto fromDto() {
        return QnaReplyRequestDto.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .Order(Order)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }
}
