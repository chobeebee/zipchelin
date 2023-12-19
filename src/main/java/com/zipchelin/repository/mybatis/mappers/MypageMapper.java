package com.zipchelin.repository.mybatis.mappers;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Member;

@Mapper
public interface MypageMapper {
	public Member selectMemberById(String id);
	
	public String checkPwd(Map<String, String> map);
	
	public void updateMember(Member member);
	
	public int countMyGuiPick(String id);

	public int countMyRecPick(String id);

	public int countMyQna(String id);

	public int countMyMyre(String id);

	public int countMyMyreReply(String id);

	public int countMyQnaReply(String id);
}
