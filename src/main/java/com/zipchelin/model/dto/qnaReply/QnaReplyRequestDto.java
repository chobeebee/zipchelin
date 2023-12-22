package com.zipchelin.model.dto.qnaReply;

import javax.validation.constraints.NotBlank;

import com.zipchelin.domain.community.QnaReply;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class QnaReplyRequestDto {

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

    public com.zipchelin.domain.community.QnaReply toEntity() {
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
