package com.zipchelin.model.dto.community.qnaReply;

import com.zipchelin.domain.community.QnaReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class QnaReplyRequestDto {

    @NotBlank
    private long qReNum;

    @NotBlank
    private long qnaNum;

    @NotBlank
    private String userImg;

    @NotBlank
    private String memberId;

    @NotBlank
    private String reContent;

    @NotBlank
    private int reUp;

    public QnaReply toEntity() {
        return QnaReply.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .userImg(userImg)
                .memberId(memberId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }
}
