package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zipchelin.model.dto.qna.QnaDto;
import com.zipchelin.model.dto.qna.QnaRequest;
import com.zipchelin.model.dto.qna.QnaResponse;
import com.zipchelin.repository.mybatis.mappers.QnaMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QnaService {
	
	private final QnaMapper qnaMapper;
	
	@Transactional
	public String saveQna(final QnaRequest params) {
		qnaMapper.save(params);
		return params.getUserId();
	}
	
	public QnaResponse findQnaById(final Long id) {
		return qnaMapper.findById(id);
	}
	
	@Transactional
	public String updateQna(final QnaRequest params) {
		qnaMapper.update(params);
		return params.getUserId();
	}
	
	public Long deleteQna(final Long id) {
		qnaMapper.deleteById(id);
		return id;
	}
	
	public List<QnaResponse> findAllQna(final QnaDto params) {
		return qnaMapper.findAll(params);
	}
	
	
}
