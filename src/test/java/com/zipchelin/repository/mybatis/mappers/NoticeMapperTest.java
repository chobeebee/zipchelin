package com.zipchelin.repository.mybatis.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.dto.member.MemberRequestDto;
import com.zipchelin.model.dto.notice.NoticeRequestDto;
import com.zipchelin.model.service.NoticeService;

@SpringBootTest
public class NoticeMapperTest {
	@Autowired
	NoticeMapper noticeMapper;	
	@Autowired
	NoticeService noticeService;
	
	@Test
	void encodingSelect() {
		NoticeRequestDto noticeSelect = NoticeRequestDto.builder()
				.noticeNum(1)
				.noticeTitle("공지사항입니다.")
				.noticeCont("공지를 공지합니다.")
				.build();
		noticeService.selectNotice(noticeSelect);
	}
}
