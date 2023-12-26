package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.admin.page.Criteria;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponse;

@Mapper
public interface MyrecipeMapper {
	
	void save(MyrecipeRequestDto params);
	
	public List<Myrecipe> getMyrecipe();
	
	MyrecipeResponse findById(Long id);
	
	public void addMyrecipe(Myrecipe myrecipe);
	
	public void updateMyrecipe(Myrecipe myrecipe);
	
	public void delMyrecipe(Integer newArr);
	
	public List<Myrecipe> getListPaging(Criteria cri);

	public int getTotal();

}