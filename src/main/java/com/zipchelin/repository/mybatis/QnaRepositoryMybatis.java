package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.community.Qna;
import com.zipchelin.model.dto.community.qna.QnaDto;
import com.zipchelin.model.dto.community.qna.QnaRequestDto;
import com.zipchelin.model.dto.community.qna.QnaResponseDto;
import com.zipchelin.repository.QnaRepository;
import com.zipchelin.repository.mybatis.mappers.QnaMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class QnaRepositoryMybatis implements QnaRepository {
	
	private final QnaMapper mapper;

	@Override
	public void save(QnaRequestDto params) {
		mapper.save(params);
	}

	@Override
	public QnaResponseDto findById(Long id) {
		return mapper.findById(id);
	}

	@Override
	public long update(Qna params) {
		mapper.update(params);
		return params.getQnaNum();
	}

	@Override
	public void deleteById(Long id) {
		mapper.deleteById(id);
	}

	@Override
	public List<QnaResponseDto> findAll(QnaDto params) {
		return mapper.findAll(params);
	}

	@Override
	public int count() {
		return mapper.count();
	}

}
