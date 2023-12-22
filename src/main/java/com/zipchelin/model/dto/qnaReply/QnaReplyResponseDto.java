package com.zipchelin.model.dto.qnaReply;

import com.zipchelin.domain.QnaReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class QnaReplyResponseDto {

    @NotBlank
    private long qReNum;

    @NotBlank
    private long qnaNum;

    @NotBlank
    private int Order;

    @NotBlank
    private String reId;

    @NotBlank
    private String reContent;

    @NotBlank
    private int reUp;

    public QnaReply toEntity() {
        return QnaReply.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .Order(Order)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }
}
