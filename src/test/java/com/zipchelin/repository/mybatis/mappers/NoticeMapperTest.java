package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.model.service.NoticeService;

@SpringBootTest
public class NoticeMapperTest {

	@Autowired
	NoticeMapper noticeMapper;	
	@Autowired
	NoticeService noticeService;
	
	private static final Logger log=LoggerFactory.getLogger(NoticeMapperTest.class);
	
    @Test
    @Disabled
    void selectAll() {
        noticeService.selectAll().forEach(notice -> log.info(""+notice));
    }

	
	@Test
	@Disabled
	void selectNotice() {
		List<Notice> list = noticeMapper.selectAll();
		System.out.println(list);
	}
	
	@Test
	public void testGetListPaging() {
		Criteria cri = new Criteria();
		List list = noticeService.getListPaging(cri);
		list.forEach(notice -> log.info(""+notice));
	}

}
