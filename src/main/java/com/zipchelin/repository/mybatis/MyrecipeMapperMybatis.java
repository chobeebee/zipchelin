package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.repository.MyrecipeRepository;
import com.zipchelin.repository.mybatis.mappers.MyrecipeMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyrecipeMapperMybatis implements MyrecipeRepository {

	private final MyrecipeMapper myrecipeMapper;
	
	@Override
	public List<Myrecipe> getMyrecipe() {
		return myrecipeMapper.getMyrecipe();
	}
	
	@Override
	public String addMyrecipe(Myrecipe myrecipe) {
		myrecipeMapper.addMyrecipe(myrecipe);
		return myrecipe.getMyreTitle();
	}
	
	@Override
	public void updateMyrecipe(Myrecipe myrecipe) {
		myrecipeMapper.updateMyrecipe(myrecipe);
		
	}
	
	@Override
	public void delMyrecipe(Integer newArr) {
		myrecipeMapper.delMyrecipe(newArr);
	}
	
	@Override
	public List<Myrecipe> getListPaging(Criteria cri) {
		return myrecipeMapper.getListPaging(cri);
	}
	
	 @Override
	 public int getTotal() {
		return myrecipeMapper.getTotal();
	}
	
}
