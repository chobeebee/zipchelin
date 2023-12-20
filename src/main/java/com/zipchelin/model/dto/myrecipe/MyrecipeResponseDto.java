package com.zipchelin.model.dto.myrecipe;

import com.zipchelin.domain.Myrecipe;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class MyrecipeResponseDto {
    private String userId;
    private int myreNum;
    private String myreTitle;
    private String myreContent;
    private int myreUp;
    private LocalDateTime myreDate;

    public Myrecipe toEntity() {
        return Myrecipe.builder()
                .userId(userId)
                .myreNum(myreNum)
                .myreTitle(myreTitle)
                .myreContent(myreContent)
                .myreUp(myreUp)
                .myreDate(myreDate)
                .build();
    }
}
