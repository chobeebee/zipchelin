package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.Guide;

public interface GuideMapper {
	void addGuide(Guide guide);
	
	void selectGuideAll();
	
	void updateGuide(Guide guide);
	
	void delGuide(int guiNum);
}
