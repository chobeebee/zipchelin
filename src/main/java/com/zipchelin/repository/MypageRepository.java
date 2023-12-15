package com.zipchelin.repository;

import java.util.List;

import com.zipchelin.model.dto.member.MemberRequestDto;

public interface MypageRepository {
	
	List selectMyPost(String id);
	
	String checkPass(String id,String pwd);
	
	void updateMember(MemberRequestDto dto);
}
