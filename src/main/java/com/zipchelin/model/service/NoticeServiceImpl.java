package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zipchelin.domain.Notice;
import com.zipchelin.repository.NoticeRepository;
import com.zipchelin.repository.mybatis.mappers.NoticeMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService{
	private final NoticeRepository noticeRepository;
	private final NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> selectAll(){
		return noticeRepository.selectAll();
	}

	@Override
	public void addNotice(Notice notice) {
		noticeMapper.addNotice(notice);		
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

	
}
