package com.zipchelin.model.dto.notice;

import com.zipchelin.domain.Notice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Getter
@Builder
@AllArgsConstructor
public class NoticeResponseDto {
    private Integer noticeNum;
    private String noticeTitle;
    private String noticeCont;
    private Date noticeDate;

    public Notice toEntity() {
        return Notice.builder()
                .noticeNum(noticeNum)
                .noticeTitle(noticeTitle)
                .noticeCont(noticeCont)
                .noticeDate(noticeDate)
                .build();
    }
}
