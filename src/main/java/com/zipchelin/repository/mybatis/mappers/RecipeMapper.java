package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Recipe;

@Mapper
public interface RecipeMapper {

	//리스트 전체목록 보기 구현
	List<Recipe> selectAllList();

	List<Recipe> selectEachCategory(int cateNum);


}
