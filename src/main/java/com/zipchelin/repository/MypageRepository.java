package com.zipchelin.repository;

import java.util.Map;

import com.zipchelin.domain.Member;

public interface MypageRepository {
	
	public Member selectMemberById(String id);
	
	public String checkPwd(Map<String, String> map);
	
	public void updateMember(Member member);
	
	public Map<String, Integer> selectCount(String id);
}
