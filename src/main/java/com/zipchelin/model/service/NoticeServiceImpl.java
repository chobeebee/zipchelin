package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.dto.notice.NoticeRequestDto;
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
	
	public String addNotice(NoticeRequestDto params) {
		return noticeRepository.addNotice(params.toEntity());
	}
}
