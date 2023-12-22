package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.community.Qna;
import com.zipchelin.model.dto.community.qna.QnaDto;
import com.zipchelin.model.dto.community.qna.QnaRequest;
import com.zipchelin.model.dto.community.qna.QnaResponse;

public interface QnaRepository {

    void save(QnaRequest params);

    QnaResponse findById(Long id);

    long update(Qna params);

    void deleteById(Long id);

    List<QnaResponse> findAll(final QnaDto params);

    int count();
}
