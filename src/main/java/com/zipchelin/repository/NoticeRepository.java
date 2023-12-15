package com.zipchelin.repository;

import com.zipchelin.domain.Notice;

public interface NoticeRepository {
	
	String addNotice(Notice notice);

    int selectNotice(Notice notice);

    void delNotice(int noticeNum);

    void updateNotice(Notice notice);
}
