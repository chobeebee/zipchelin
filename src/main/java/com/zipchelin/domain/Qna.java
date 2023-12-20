package com.zipchelin.domain;

import com.zipchelin.model.dto.MyPost;
import com.zipchelin.model.dto.qna.QnaRequestDto;
import com.zipchelin.model.dto.qna.QnaResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Qna {
    private int qnaNum;
    private String userId;
    private String qnaTitle;
    private String qnaContent;
    private LocalDateTime qnaDate;
    private int qnaUp;

    public QnaResponseDto toDto() {
        return QnaResponseDto.builder()
                .qnaNum(qnaNum)
                .userId(userId)
                .qnaTitle(qnaTitle)
                .qnaContent(qnaContent)
                .qnaDate(qnaDate)
                .qnaUp(qnaUp)
                .build();
    }

    public QnaRequestDto fromDto() {
        return QnaRequestDto.builder()
                .userId(userId)
                .qnaTitle(qnaTitle)
                .qnaContent(qnaContent)
                .build();
    }

    public MyPost toMyPost() {
        return MyPost
                .builder()
                .myrecipe(null)
                .myreOrQna("qna")
                .postDate(qnaDate)
                .qna(this)
                .build();
    }
}
