package com.zipchelin.model.dto.notice;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class NoticeResponseDto {
	private String noticeNum;
	private String noticeTitle;
	private String noticeCont;
	private LocalDateTime noticeDate;
}
