package com.zipchelin.model.dto.user;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class NoticeRequestDto {
	private String noticeNum;
	private String noticeTitle;
	private String noticeCont;
	
	
}
