package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.Notice;

public interface NoticeRepository {
	
	String addNotice(Notice notice);

	List<Notice> selectAll();
	
	int selectNotice(Notice notice);

    void delNotice(int noticeNum);

    void updateNotice(Notice notice);
}
