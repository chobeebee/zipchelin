package com.zipchelin.model.dto.guide;

import com.zipchelin.domain.Guide;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GuideRequestDto {
    @NotBlank
    private int guiNum;
    @NotBlank
    private int cateNum;
    @NotBlank
    private String guiTitle;
    @NotBlank
    private String guiSubt;
    @NotBlank
    private String guiThumb;

    @Builder
    public GuideRequestDto(int guiNum, int cateNum, String guiTitle,
                           String guiSubt, String guiThumb) {
        this.guiNum = guiNum;
        this.cateNum = cateNum;
        this.guiTitle = guiTitle;
        this.guiSubt = guiSubt;
        this.guiThumb = guiThumb;
    }


    public Guide toEntity() {
        return Guide.builder()
                .guiNum(guiNum)
                .cateNum(cateNum)
                .guiTitle(guiTitle)
                .guiSubt(guiSubt)
                .guiThumb(guiThumb)
                .build();
    }
}
