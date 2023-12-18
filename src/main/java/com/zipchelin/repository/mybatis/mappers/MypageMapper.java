package com.zipchelin.repository.mybatis.mappers;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Member;

@Mapper
public interface MypageMapper {
	public Member selectById(String id);
	
	public String checkPwd(Map<String, String> map);
	
	public void updateMember(Member member);
}
