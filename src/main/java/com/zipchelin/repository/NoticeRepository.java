package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.Notice;

public interface NoticeRepository {
	
	String addNotice(Notice notice);

	List<Notice> selectAll();

    void delNotice(String noticeNum);

    void updateNotice(Notice notice);

	public Notice getPage(Integer noticeNum);
}
