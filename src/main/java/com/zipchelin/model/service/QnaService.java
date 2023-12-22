package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zipchelin.domain.community.Qna;
import com.zipchelin.model.dto.common.Pagination;
import com.zipchelin.model.dto.community.qna.QnaDto;
import com.zipchelin.model.dto.community.qna.QnaRequestDto;
import com.zipchelin.model.dto.community.qna.QnaResponseDto;
import com.zipchelin.repository.QnaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QnaService {

    private final QnaRepository repository;

    @Transactional
    public String saveQna(final QnaRequestDto params) {
    	repository.save(params);
        return params.getUserId();
    }

    public QnaResponseDto findQnaById(final Long id) {
        return repository.findById(id);
    }

    @Transactional
    public long updateQna(final QnaRequestDto params) {
    	Qna qna = params.toEntity();
    	long qnaNum = repository.update(qna);
        return qnaNum;
    }

    public Long deleteQna(final Long id) {
    	repository.deleteById(id);
        return id;
    }

    public List<QnaResponseDto> findAllQna(final QnaDto params) {
    	
    	int totalCount = repository.count();
    	Pagination pagination = new Pagination(totalCount, params);
    	
    	params.setPagination(pagination);
    	
        return repository.findAll(params);
    }
    
    
}
