package com.zipchelin.domain;

import com.zipchelin.model.dto.guideHeart.GuideHeartRequestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GuideHeart {
    private int pickId;
    private int guiNum;
    private String userId;
    private LocalDateTime guiPickDatetime;

    public GuideHeartRequestDto fromDto() {
        return GuideHeartRequestDto.builder()
                .pickId(pickId)
                .guiNum(guiNum)
                .userId(userId)
                .build();
    }
}
