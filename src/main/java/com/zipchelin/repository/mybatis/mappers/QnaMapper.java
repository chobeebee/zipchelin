package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.community.Qna;
import com.zipchelin.model.dto.community.qna.QnaDto;
import com.zipchelin.model.dto.community.qna.QnaRequestDto;
import com.zipchelin.model.dto.community.qna.QnaResponseDto;

@Mapper
public interface QnaMapper {

    void save(QnaRequestDto params);

    QnaResponseDto findById(Long id);

    Long update(Qna params);

    void deleteById(Long id);

    List<QnaResponseDto> findAll(final QnaDto params);

    int count();
}
