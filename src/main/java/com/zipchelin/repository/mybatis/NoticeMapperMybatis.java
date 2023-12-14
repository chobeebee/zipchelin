package com.zipchelin.repository.mybatis;

import com.zipchelin.domain.Notice;
import com.zipchelin.repository.NoticeRepository;
import com.zipchelin.repository.mybatis.mappers.NoticeMapper;

public class NoticeMapperMybatis implements NoticeRepository{
	
	private final NoticeMapper noticeMapper;
	
	@Override
	public String addNotice(Notice notice) {
		noticeMapper.addNotice(notice);
		return notice.getNoticeTitle();
	}

	@Override
	public void selectNotice(Notice notice) {
			
	}

	@Override
	public void delNotice(int noticeNum) {
		
	}

	@Override
	public void updateNotice(Notice notice) {
		
	}
	
}
