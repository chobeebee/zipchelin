package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.qna.QnaRequest;
import com.zipchelin.domain.qna.QnaResponse;

@Mapper
public interface QnaMapper {
	
	void save(QnaRequest params);
	
	QnaResponse findById(String id);
	
	void update(QnaRequest params);
	
	void deleteById(String id);
	
	List<QnaResponse> findAll();
	
	int count();
}
