package com.zipchelin.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class Notice {
	private String noticeNum;
	private String noticeTitle;
	private String noticeCont;
	private LocalDateTime noticeDate;
	
}
