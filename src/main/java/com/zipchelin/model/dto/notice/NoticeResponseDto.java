package com.zipchelin.model.dto.notice;

import java.sql.Date;

import com.zipchelin.domain.Notice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class NoticeResponseDto {
	private int noticeNum;
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
