package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponseDto;
import com.zipchelin.repository.MyrecipeRepository;
import com.zipchelin.repository.mybatis.mappers.MyrecipeMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyrecipeMapperMybatis implements MyrecipeRepository {

	private final MyrecipeMapper myrecipeMapper;
	
	@Override
	public long save(MyrecipeRequestDto params) {
		myrecipeMapper.save(params);
		return params.getMyreNum();
	}
	
	@Override
	public MyrecipeResponseDto findById(Long id) {
		return myrecipeMapper.findById(id);
	}

	@Override
	public long update(Myrecipe params) {
		myrecipeMapper.update(params);
		return params.getMyreNum();
	}

	@Override
	public void deleteById(Long id) {
		myrecipeMapper.deleteById(id);		
	}

	@Override
	public List<MyrecipeResponseDto> findAll(MyrecipeDto params) {
		return myrecipeMapper.findAll(params);
	}

	@Override
	public int count() {
		return myrecipeMapper.count();
	}

}
