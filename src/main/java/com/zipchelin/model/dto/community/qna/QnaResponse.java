package com.zipchelin.model.dto.community.qna;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class QnaResponse {

    private Long qnaNum;
    private String userId;
    private String qnaTitle;
    private String qnaContent;
    private LocalDate qnaDate;
    private int qnaUp;
    private int qnaReCount;
}
