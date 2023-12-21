package com.zipchelin.repository;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;

import java.util.List;

public interface NoticeRepository {

    String addNotice(Notice notice);

    List<Notice> selectAll();

    void delNotice(Integer newArr);

    void updateNotice(Notice notice);

    public Notice getPage(Integer noticeNum);

    public List<Notice> getListPaging(Criteria cri);

    public int getTotal();
}
