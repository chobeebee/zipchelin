package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.zipchelin.domain.Notice;
import com.zipchelin.model.service.NoticeService;

@SpringBootTest
public class NoticeMapperTest {

	@Autowired
	NoticeMapper noticeMapper;	
	@Autowired
	NoticeService noticeService;
	
	private static final Logger log=LoggerFactory.getLogger(NoticeMapperTest.class);
	
    @Test
    void selectAll() {
        noticeService.selectAll().forEach(notice -> log.info(""+notice));
    }

	
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
