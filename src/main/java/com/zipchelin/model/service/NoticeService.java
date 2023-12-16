package com.zipchelin.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.zipchelin.domain.Notice;
import com.zipchelin.model.dto.notice.NoticeRequestDto;
import com.zipchelin.model.dto.notice.NoticeResponseDto;
import com.zipchelin.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeService {
	private final NoticeRepository noticeRepository;
	
	@Transactional
	public int selectNotice(NoticeRequestDto params) {
		return params.getNoticeNum();
	}
	
	public String addNotice(NoticeRequestDto params) {
		return noticeRepository.addNotice(params.toEntity());
	}
}
