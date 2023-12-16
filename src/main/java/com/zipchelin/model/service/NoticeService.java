package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.dto.notice.NoticeRequestDto;
import com.zipchelin.model.dto.notice.NoticeResponseDto;
import com.zipchelin.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeService {
	
	private final NoticeRepository noticeRepository;
	
	public String addNotice(NoticeRequestDto params) {
		return noticeRepository.addNotice(params.toEntity());
	}
}
