package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.model.dto.common.PaginationReply;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyResponseDto;
import com.zipchelin.repository.QnaReplyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QnaReplyService {
	
	private final QnaReplyRepository repository;

    @Transactional
    public Long saveQna(final QnaReplyRequestDto params) {
    	return repository.save(params);
    }

    public QnaReplyResponseDto findQnaById(final Long id) {
        return repository.findById(id);
    }

    @Transactional
    public Long updateQna(final QnaReplyRequestDto params) {
    	QnaReply qna = params.toEntity();
    	long qnaNum = repository.update(qna);
        return qnaNum;
    }

    public Long deleteQna(final Long id) {
    	repository.deleteById(id);
        return id;
    }

    public List<QnaReplyResponseDto> findAllQna(final Long qnaNum) {
    	return repository.findAll(qnaNum);
    }
    
//    public List<QnaReplyResponseDto> findAllQna(final QnaReplyDto params) {
//    	
//    	int totalCount = repository.count();
//    	PaginationReply pagination = new PaginationReply(totalCount, params);
//    	
//    	params.setPagination(pagination);
//    	
//        return repository.findAll(params);
//    }
}
