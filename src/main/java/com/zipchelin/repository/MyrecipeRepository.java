package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.admin.page.Criteria;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponse;

public interface MyrecipeRepository {
	
	List<Myrecipe> getMyrecipe();

	String addMyrecipe(Myrecipe Myrecipe);
	
	MyrecipeResponse findById(Long id);
	
	void updateMyrecipe(Myrecipe myrecipe);
	
	void delMyrecipe(Integer newArr);
	
	List<Myrecipe> getListPaging(Criteria cri);

	int getTotal();
	
}