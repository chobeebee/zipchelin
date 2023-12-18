package com.zipchelin.repository;

import com.zipchelin.domain.Guide;

public interface GuideRepository {
	void addGuide(Guide guide);
	
	void selectGuideAll();
	
	void updateGuide(Guide guide);
	
	void delGuide(int guiNum);
}
