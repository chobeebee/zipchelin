package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.model.dto.admin.page.Criteria;

@Mapper
public interface MyrecipeMapper {
	
	public List<Myrecipe> getMyrecipe();
	
	public void addMyrecipe(Myrecipe myrecipe);
	
	public void updateMyrecipe(Myrecipe myrecipe);
	
	public void delMyrecipe(Integer newArr);
	
	public List<Myrecipe> getListPaging(Criteria cri);

	public int getTotal();

}