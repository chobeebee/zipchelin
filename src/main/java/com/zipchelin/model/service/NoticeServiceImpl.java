package com.zipchelin.model.service;

import org.springframework.stereotype.Service;

import com.zipchelin.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl {
	private final NoticeRepository noticeRepository;
	
	
}
