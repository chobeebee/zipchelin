package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.dto.notice.NoticeResponseDto;

@SpringBootTest
public class NoticeMapperTest {
	
	@Autowired
	NoticeMapper noticeMapper;
	
	@Test
	void addNotice() {
		Notice notice = new Notice(0, null, null, null);
		notice.setNoticeNum(0);
		notice.setNoticeTitle("공지사항입니다.");
		notice.setNoticeCont("본문입니다.");
		noticeMapper.addNotice(notice);
	}
	
	@Test
	void selectNotice() {
		List<Notice> list = noticeMapper.selectAll();
		System.out.println(list);
	}
}
