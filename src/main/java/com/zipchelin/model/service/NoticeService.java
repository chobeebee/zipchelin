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
public interface NoticeService {

	public List<Notice> selectAll();
	
}
