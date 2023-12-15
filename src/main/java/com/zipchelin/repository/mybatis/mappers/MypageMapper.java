package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Member;

@Mapper
public interface MypageMapper {
	
	List selectPostWithID(String id);
	
	String checkPass(String id,String pwd);
	
	void updateMember(Member member);
}
