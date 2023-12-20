package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.model.service.NoticeService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class NoticeMapperTest {

    @Autowired
    NoticeMapper noticeMapper;
    @Autowired
    NoticeService noticeService;

    private static final Logger log = LoggerFactory.getLogger(NoticeMapperTest.class);

    @Test
    @Disabled
    void selectAll() {
        noticeService.selectAll().forEach(notice -> log.info("" + notice));
    }
    
    /*@Test
    void addNotice() {
       for(int i=0; i<99; i++) {
          Notice notice = Notice.builder()
                .noticeTitle("테스트"+i)
                .noticeCont("xptmxm")
                .build();
                noticeService.addNotice(notice);
       }
    }*/

    @Test
    @Disabled
    void selectNotice() {
        List<Notice> list = noticeMapper.selectAll();
        System.out.println(list);
    }

    @Test
    @Disabled
    public void testGetListPaging() {
        Criteria cri = new Criteria();
        List list = noticeService.getListPaging(cri);
        list.forEach(notice -> log.info("" + notice));
    }

}
