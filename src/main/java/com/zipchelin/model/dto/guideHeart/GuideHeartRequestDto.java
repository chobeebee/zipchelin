package com.zipchelin.model.dto.guideHeart;

import com.zipchelin.domain.GuideHeart;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class GuideHeartRequestDto {
    @NotBlank
    private int pickId;

    @NotBlank
    private int guiNum;

    @NotBlank
    private String userId;

    public GuideHeart toEntity() {
        return GuideHeart.builder()
                .pickId(pickId)
                .guiNum(guiNum)
                .userId(userId)
                .build();
    }
}
