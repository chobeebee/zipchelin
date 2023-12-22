package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.community.Qna;
import com.zipchelin.model.dto.community.qna.QnaDto;
import com.zipchelin.model.dto.community.qna.QnaRequestDto;
import com.zipchelin.model.dto.community.qna.QnaResponseDto;

public interface QnaRepository {

    long save(QnaRequestDto params);

    QnaResponseDto findById(Long id);

    long update(Qna params);

    void deleteById(Long id);

    List<QnaResponseDto> findAll(final QnaDto params);

    int count();
}
