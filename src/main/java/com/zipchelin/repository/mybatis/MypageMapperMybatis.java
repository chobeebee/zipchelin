package com.zipchelin.repository.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zipchelin.model.dto.member.MemberRequestDto;
import com.zipchelin.repository.MypageRepository;
import com.zipchelin.repository.mybatis.mappers.MypageMapper;
import com.zipchelin.repository.mybatis.mappers.NoticeMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MypageMapperMybatis implements MypageRepository{

	private final MypageMapper mypageMapper;

	@Override
	public List selectMyPost(String id) {
		List list;
		list = mypageMapper.selectPostWithID(id);
		return list;
	}

	@Override
	public String checkPass(String id, String pwd) {
		String result=null;
		result=mypageMapper.checkPass(id,pwd);
		return result;
	}

	@Override
	public void updateMember(MemberRequestDto dto) {
		mypageMapper.updateMember(dto.toEntity());
	}
	
	
}
