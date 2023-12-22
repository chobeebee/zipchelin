package com.zipchelin.model.dto.community.qnaReply;

import com.zipchelin.domain.community.QnaReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class QnaReplyResponseDto {

    @NotBlank
    private int qReNum;

    @NotBlank
    private int qnaNum;

    @NotBlank
    private String userImg;

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
                .userImg(userImg)
                .Order(Order)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }
}
