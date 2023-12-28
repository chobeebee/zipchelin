package com.zipchelin.model.dto.community.qnaReply;

import com.zipchelin.domain.community.QnaReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QnaReplyRequestDto {

    @NotBlank
    private Long qReNum;

    @NotBlank
    private Long qnaNum;

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
