package com.zipchelin.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.admin.page.Criteria;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponse;
import com.zipchelin.repository.MyrecipeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MyrecipeService {

	@Autowired
	private final MyrecipeRepository myrecipeRepository;

	public List<Myrecipe> getMyrecipe() {
		return myrecipeRepository.getMyrecipe();
	}

	public void addMyrecipe(Myrecipe Myrecipe) {
		myrecipeRepository.addMyrecipe(Myrecipe);
	}

	public void updateMyrecipe(Myrecipe Myrecipe) {
		myrecipeRepository.updateMyrecipe(Myrecipe);
	}

	public void delMyrecipe(Integer newArr) {
		myrecipeRepository.delMyrecipe(newArr);
	}

	public List<Myrecipe> getListPaging(Criteria cri) {
		return myrecipeRepository.getListPaging(cri);
	}

	public int getTotal() { 
		return myrecipeRepository.getTotal(); 
	}

	public MyrecipeResponse findMyrecipeById(final Long id) {
		return myrecipeRepository.findById(id);
	}

}
