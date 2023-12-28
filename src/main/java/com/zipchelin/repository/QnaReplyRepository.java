package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyResponseDto;

public interface QnaReplyRepository {
	
	Long save(QnaReplyRequestDto params);

    QnaReplyResponseDto findById(Long id);

    Long update(QnaReply params);

    void deleteById(Long id);

    List<QnaReplyResponseDto> findAll(Long qnaNum);

//    List<QnaReplyResponseDto> findAll(final QnaReplyDto params);

    int count();
}
