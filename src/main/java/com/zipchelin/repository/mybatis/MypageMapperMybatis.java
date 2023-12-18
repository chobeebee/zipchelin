package com.zipchelin.repository.mybatis;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zipchelin.domain.Member;
import com.zipchelin.repository.MypageRepository;
import com.zipchelin.repository.mybatis.mappers.MypageMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MypageMapperMybatis implements MypageRepository{

	private final MypageMapper mypageMapper;

	@Override
	public Member selectById(String id) {
		return mypageMapper.selectById(id);
	}

	@Override
	public String checkPwd(Map<String, String> map) {
		return mypageMapper.checkPwd(map);
	}

	@Override
	public void updateMember(Member member) {
		mypageMapper.updateMember(member);
	}
}
