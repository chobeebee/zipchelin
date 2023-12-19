package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.Notice;

public interface NoticeRepository {
	
	String addNotice(Notice notice);

	List<Notice> selectAll();

    void delNotice(Integer noticeNum);

    void updateNotice(Notice notice);

	void delNotice(int noticeNum);

	
}
