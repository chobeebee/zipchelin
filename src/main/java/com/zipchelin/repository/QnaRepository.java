package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.model.dto.qna.QnaDto;
import com.zipchelin.model.dto.qna.QnaRequest;
import com.zipchelin.model.dto.qna.QnaResponse;

public interface QnaRepository {

    void save(QnaRequest params);

    QnaResponse findById(Long id);

    void update(QnaRequest params);

    void deleteById(Long id);

    List<QnaResponse> findAll(final QnaDto params);

    int count();
}
