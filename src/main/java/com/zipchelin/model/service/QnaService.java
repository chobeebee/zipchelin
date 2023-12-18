package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zipchelin.domain.qna.QnaRequest;
import com.zipchelin.domain.qna.QnaResponse;
import com.zipchelin.repository.mybatis.mappers.QnaMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QnaService {
	
	private final QnaMapper qnaMapper;
	
	@Transactional
	public String saveQna(final QnaRequest params) {
		qnaMapper.save(params);
		return params.getUser_id();
	}
	
	public QnaResponse findQnaById(final String id) {
		return qnaMapper.findById(id);
	}
	
	@Transactional
	public String updateQna(final QnaRequest params) {
		qnaMapper.update(params);
		return params.getUser_id();
	}
	
	public String deleteQna(final String id) {
		qnaMapper.deleteById(id);
		return id;
	}
	
	public List<QnaResponse> findAllQna() {
		return qnaMapper.findAll();
	}
}
