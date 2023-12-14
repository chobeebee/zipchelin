package com.zipchelin.repository;

import com.zipchelin.domain.Notice;

public interface NoticeRepository {
	
	String addNotice(Notice notice);

    void selectNotice(Notice notice);

    void delNotice(int noticeNum);

    void updateNotice(Notice notice);
}
