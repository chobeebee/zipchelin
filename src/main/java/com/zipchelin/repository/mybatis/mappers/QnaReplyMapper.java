package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyResponseDto;

@Mapper
public interface QnaReplyMapper {
	
	void save(QnaReplyRequestDto params);
	
	QnaReplyResponseDto findById(Long id);
	
	Long update(QnaReply params);
	
	void deleteById(Long id);
	
	List<QnaReplyResponseDto> findAll(Long qnaNum);
	
//	List<QnaReplyResponseDto> findAll(QnaReplyDto params);
	
	int count();
}
