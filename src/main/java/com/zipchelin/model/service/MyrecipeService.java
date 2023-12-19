package com.zipchelin.model.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zipchelin.model.dto.myrecipe.MyrecipeRequestDto;
import com.zipchelin.repository.MyrecipeRepository;

import oracle.jdbc.proxy.annotation.Post;

@Service
public class MyrecipeService {
	//private final MyrecipeRepository myrecipeRepository;
	
	public void savePost(Post post) throws SQLException {
		
	}
	
	@Transactional
	public int selectMyrecipe(MyrecipeRequestDto params) {
		return params.getMyreNum();
	}
	
	/*public String addMyrecipe(MyrecipeRequestDto params) {
		return MyrecipeRepository.addMyrecipe(params.toEntity());
	}*/
}
