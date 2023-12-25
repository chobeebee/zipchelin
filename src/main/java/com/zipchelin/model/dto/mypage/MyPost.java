package com.zipchelin.model.dto.mypage;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.domain.community.Qna;
import lombok.Builder;
import lombok.Getter;

import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Builder
public class MyPost {
    private String myreOrQna;
    private LocalDateTime postDate;
    private Myrecipe myrecipe;
    private Qna qna;
}
