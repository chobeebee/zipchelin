package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyResponseDto;
import com.zipchelin.repository.QnaReplyRepository;
import com.zipchelin.repository.mybatis.mappers.QnaReplyMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class QnaReplyRepositoryMybatis implements QnaReplyRepository{
	
	private final QnaReplyMapper mapper;

	@Override
	public Long save(QnaReplyRequestDto params) {
		
		mapper.save(params);
		return params.getQnaNum();
	}

	@Override
	public QnaReplyResponseDto findById(Long id) {
		return mapper.findById(id);
	}

	@Override
	public Long update(QnaReply params) {
		mapper.update(params);
		return params.getQnaNum();
	}

	@Override
	public void deleteById(Long id) {
		mapper.deleteById(id);
	}

	@Override
	public List<QnaReplyResponseDto> findAll(Long qnaNum) {
		return mapper.findAll(qnaNum);
	}
	
//	@Override
//	public List<QnaReplyResponseDto> findAll(QnaReplyDto params) {
//		return mapper.findAll(params);
//	}

	@Override
	public int count() {
		return mapper.count();
	}
}
