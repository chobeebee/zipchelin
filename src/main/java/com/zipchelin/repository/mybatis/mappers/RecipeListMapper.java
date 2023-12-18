package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Recipe;

@Mapper
public interface RecipeListMapper {


	//리스트 목록
	List<Recipe> selectAllList()
}
