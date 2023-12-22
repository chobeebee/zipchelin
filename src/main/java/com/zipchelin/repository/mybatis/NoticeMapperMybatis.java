package com.zipchelin.repository.mybatis;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.repository.NoticeRepository;
import com.zipchelin.repository.mybatis.mappers.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeMapperMybatis implements NoticeRepository {

    private final NoticeMapper noticeMapper;

    @Override
    public String addNotice(Notice notice) {
        noticeMapper.addNotice(notice);
        return notice.getNoticeTitle();
    }

    @Override
    public List<Notice> selectAll() {
        return noticeMapper.selectAll();
    }

    @Override
    public void updateNotice(Notice notice) {
        noticeMapper.updateNotice(notice);

    }

    @Override
    public void delNotice(Integer newArr) {
        noticeMapper.delNotice(newArr);

    }

    @Override
    public Notice getPage(Integer noticeNum) {
        return noticeMapper.getPage(noticeNum);
    }

    @Override
    public List<Notice> getListPaging(Criteria cri) {
        return noticeMapper.getListPaging(cri);
    }

    @Override
    public int getTotal() {
        return noticeMapper.getTotal();
    }


}
