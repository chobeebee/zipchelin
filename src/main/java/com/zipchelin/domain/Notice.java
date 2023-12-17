package com.zipchelin.domain;

import java.sql.Date;

import com.zipchelin.model.dto.notice.NoticeRequestDto;
import com.zipchelin.model.dto.notice.NoticeResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Notice {
	private int noticeNum;
    private String noticeTitle;
    private String noticeCont;
    private Date noticeDate;
    
    public NoticeResponseDto toDto() {
        return NoticeResponseDto.builder()
                .noticeNum(noticeNum)
                .noticeTitle(noticeTitle)
                .noticeCont(noticeCont)
                .noticeDate(noticeDate)
                .build();
    }
    
    public NoticeRequestDto fromDto() {
    	return NoticeRequestDto.builder()
                .noticeNum(noticeNum)
                .noticeTitle(noticeTitle)
                .noticeCont(noticeCont)
                .build();
    }
    
}
