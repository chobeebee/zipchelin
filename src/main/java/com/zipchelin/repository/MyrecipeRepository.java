package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponseDto;

public interface MyrecipeRepository {
	
	long save(MyrecipeRequestDto params);
	
	MyrecipeResponseDto findById(Long id);

    long update(Myrecipe params);

    void deleteById(Long id);

    List<MyrecipeResponseDto> findAll(final MyrecipeDto params);

    int count();
	
}