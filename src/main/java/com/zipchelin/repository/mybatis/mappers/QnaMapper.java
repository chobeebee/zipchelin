package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.model.dto.qna.QnaDto;
import com.zipchelin.model.dto.qna.QnaRequest;
import com.zipchelin.model.dto.qna.QnaResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QnaMapper {

    void save(QnaRequest params);

    QnaResponse findById(Long id);

    void update(QnaRequest params);

    void deleteById(Long id);

    List<QnaResponse> findAll(final QnaDto params);

    int count(final QnaDto params);
}
