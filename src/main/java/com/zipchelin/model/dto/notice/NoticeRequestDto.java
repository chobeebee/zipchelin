package com.zipchelin.model.dto.notice;

import javax.validation.constraints.NotBlank;
import com.zipchelin.domain.Notice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class NoticeRequestDto {
	@NotBlank
	private int noticeNum;
	
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
