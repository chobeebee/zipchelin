package com.zipchelin.model.dto.guide;

import com.zipchelin.domain.Guide;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class GuideResponseDto {
    private String guiTitle;
    private String guiSubt;
    private String guiThumb;

    @Builder
    public GuideResponseDto(String guiTitle, String guiSubt, String guiThumb) {
        super();
        this.guiTitle = guiTitle;
        this.guiSubt = guiSubt;
        this.guiThumb = guiThumb;
    }

    public Guide toEntity() {
        return Guide.builder()
                .guiTitle(guiTitle)
                .guiSubt(guiSubt)
                .guiThumb(guiThumb)
                .build();
    }
}
