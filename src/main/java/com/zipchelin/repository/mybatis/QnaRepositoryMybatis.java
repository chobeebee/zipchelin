package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.model.dto.qna.QnaDto;
import com.zipchelin.model.dto.qna.QnaRequest;
import com.zipchelin.model.dto.qna.QnaResponse;
import com.zipchelin.repository.QnaRepository;
import com.zipchelin.repository.mybatis.mappers.QnaMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class QnaRepositoryMybatis implements QnaRepository {
	
	private final QnaMapper mapper;

	@Override
	public void save(QnaRequest params) {
		mapper.save(params);
	}

	@Override
	public QnaResponse findById(Long id) {
		return mapper.findById(id);
	}

	@Override
	public void update(QnaRequest params) {
		
	}

	@Override
	public void deleteById(Long id) {
		
	}

	@Override
	public List<QnaResponse> findAll(QnaDto params) {
		return mapper.findAll(params);
	}

	@Override
	public int count() {
		return mapper.count();
	}

}
