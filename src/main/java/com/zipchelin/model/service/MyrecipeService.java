package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.common.Pagination;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponseDto;
import com.zipchelin.repository.MyrecipeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyrecipeService {

	private final MyrecipeRepository myrecipeRepository;
	
	@Transactional
	public long saveMyrecipe(final MyrecipeRequestDto params) {
		return myrecipeRepository.save(params);
	}

	public MyrecipeResponseDto findMyrecipeById(final Long id) {
		return myrecipeRepository.findById(id);
	}

	@Transactional
    public long updateMyrecipe(final MyrecipeRequestDto params) {
    	Myrecipe myrecipe = params.toEntity();
    	long myreNum = myrecipeRepository.update(myrecipe);
        return myreNum;
    }

    public Long deleteMyrecipe(final Long id) {
    	myrecipeRepository.deleteById(id);
        return id;
    }

    public List<MyrecipeResponseDto> findAllMyrecipe(final MyrecipeDto params) {
    	
    	int totalCount = myrecipeRepository.count();
    	Pagination pagination = new Pagination(totalCount, params);
    	
    	params.setPagination(pagination);
    	
        return myrecipeRepository.findAll(params);
    }


	

}
