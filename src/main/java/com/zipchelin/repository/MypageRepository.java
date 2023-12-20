package com.zipchelin.repository;

import java.util.List;
import java.util.Map;

import com.zipchelin.domain.Guide;
import com.zipchelin.domain.Member;
import com.zipchelin.domain.Myrecipe;
import com.zipchelin.domain.Qna;
import com.zipchelin.domain.Recipe;

public interface MypageRepository {
	
	public Member selectMemberById(String id);
	
	public String checkPwd(Map<String, String> map);
	
	public void updateMember(Member member);
	
	public Map<String, Integer> selectCount(String id);
	
	public List<Qna> selectQnaById(String id);
	
	public List<Myrecipe> selectMyreById(String id);
	
	public List<Guide> selectGuiHeart(String id);
	
	public List<Recipe> selectRecHeart(String id);
}
