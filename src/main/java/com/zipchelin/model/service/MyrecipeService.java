package com.zipchelin.model.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zipchelin.model.dto.myrecipe.MyrecipeRequestDto;

@Service
public class MyrecipeService {
	//private final MyrecipeRepository myrecipeRepository;
	
	@Transactional
	public int selectMyrecipe(MyrecipeRequestDto params) {
		return params.getMyreNum();
	}
	
}
