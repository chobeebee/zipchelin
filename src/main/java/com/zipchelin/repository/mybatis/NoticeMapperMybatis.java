package com.zipchelin.repository.mybatis;

import com.zipchelin.domain.Notice;
import com.zipchelin.repository.NoticeRepository;
import com.zipchelin.repository.mybatis.mappers.NoticeMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class NoticeMapperMybatis implements NoticeRepository{
	
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
	public void delNotice(int noticeNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateNotice(Notice notice) {
		// TODO Auto-generated method stub
		
	}
	
}
