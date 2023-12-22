package com.zipchelin.model.dto.notice;

import com.zipchelin.domain.Notice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class NoticeRequestDto {

    @NotBlank
    private Integer noticeNum;

    @NotBlank
    private String noticeTitle;

    @NotBlank
    private String noticeCont;

    public Notice toEntity() {
        return Notice.builder()
                .noticeNum(noticeNum)
                .noticeTitle(noticeTitle)
                .noticeCont(noticeCont)
                .build();
    }
}
