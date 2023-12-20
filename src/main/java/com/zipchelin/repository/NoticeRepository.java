package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;

public interface NoticeRepository {
	
	String addNotice(Notice notice);

	List<Notice> selectAll();

    void delNotice(Integer newArr);

    void updateNotice(Notice notice);

	public Notice getPage(Integer noticeNum);

	public List<Notice> getListPaging(Criteria cri);

	public int getTotal();
}
