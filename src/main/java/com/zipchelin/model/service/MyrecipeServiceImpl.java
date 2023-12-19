package com.zipchelin.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zipchelin.repository.MyrecipeRepository;

@Service
public class MyrecipeServiceImpl {

	@Autowired
	MyrecipeRepository myrecipeRepository;
	
	
}
