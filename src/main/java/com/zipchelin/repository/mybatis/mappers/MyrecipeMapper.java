package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponseDto;

@Mapper
public interface MyrecipeMapper {
	
	void save(MyrecipeRequestDto params);
	
	MyrecipeResponseDto findById(Long id);
	
	long update(Myrecipe params);
	
	void deleteById(Long id);
	
	List<MyrecipeResponseDto> findAll(final MyrecipeDto params);
	
	int count();

}