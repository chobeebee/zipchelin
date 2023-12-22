package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Qna;
import com.zipchelin.model.dto.qna.QnaDto;
import com.zipchelin.model.dto.qna.QnaRequest;
import com.zipchelin.model.dto.qna.QnaResponse;

@Mapper
public interface QnaMapper {

    void save(QnaRequest params);

    QnaResponse findById(Long id);

    long update(Qna params);

    void deleteById(Long id);

    List<QnaResponse> findAll(final QnaDto params);

    int count();
}
