package com.zipchelin.model.dto.community.myrecipe;

import java.time.LocalDateTime;

import com.zipchelin.domain.community.Myrecipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyrecipeResponseDto {
    private long myreNum;
    private String memberId;
    private String myreTitle;
    private String myreContent;
    private LocalDateTime myreDate;
    private int myreUp;
    

    public Myrecipe toEntity() {
        return Myrecipe.builder()
                .myreNum(myreNum)
                .memberId(memberId)
                .myreTitle(myreTitle)
                .myreContent(myreContent)
                .myreDate(myreDate)
                .myreUp(myreUp)
                .build();
    }
}
