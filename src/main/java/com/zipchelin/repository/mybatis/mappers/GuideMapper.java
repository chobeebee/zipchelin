package com.zipchelin.repository.mybatis.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Guide;

@Mapper
public interface GuideMapper {
	void addGuide(Guide guide);
	
	void selectGuideAll();
	
	void updateGuide(Guide guide);
	
	void delGuide(int guiNum);
}
