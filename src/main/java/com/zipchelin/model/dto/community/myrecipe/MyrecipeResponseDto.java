package com.zipchelin.model.dto.community.myrecipe;

import java.time.LocalDateTime;

import com.zipchelin.domain.community.Myrecipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MyrecipeResponseDto {
    private String memberId;
    private long myreNum;
    private String myreTitle;
    private String myreContent;
    private int myreUp;
    private LocalDateTime myreDate;

    public Myrecipe toEntity() {
        return Myrecipe.builder()
                .memberId(memberId)
                .myreNum(myreNum)
                .myreTitle(myreTitle)
                .myreContent(myreContent)
                .myreUp(myreUp)
                .myreDate(myreDate)
                .build();
    }
}
