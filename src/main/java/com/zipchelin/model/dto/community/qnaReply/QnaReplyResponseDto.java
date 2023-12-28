package com.zipchelin.model.dto.community.qnaReply;

import com.zipchelin.domain.community.QnaReply;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class QnaReplyResponseDto {

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
    
    @NotBlank
    private LocalDateTime reDate;

    public QnaReply toEntity() {
        return QnaReply.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .userImg(userImg)
                .memberId(memberId)
                .reContent(reContent)
                .reUp(reUp)
                .reDate(reDate)
                .build();
    }
}
