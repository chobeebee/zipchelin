package com.zipchelin.model.dto.community.qna;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaRequest {

    private Long qnaNum;
    private String userId;
    private String qnaTitle;
    private String qnaContent;
}
