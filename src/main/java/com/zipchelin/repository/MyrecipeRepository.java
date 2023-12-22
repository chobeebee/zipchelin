package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.page.Criteria;

public interface MyrecipeRepository {
	
	List<Myrecipe> getMyrecipe();

	String addMyrecipe(Myrecipe Myrecipe);
	
	void updateMyrecipe(Myrecipe myrecipe);
	
	void delMyrecipe(Integer newArr);
	
	List<Myrecipe> getListPaging(Criteria cri);

	int getTotal();
	
}