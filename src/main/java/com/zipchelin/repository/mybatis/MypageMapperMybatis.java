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

	
	@Override
	public Map<String, Integer> selectCount(String id) {
		//찜
		mypageMapper.countMyGuiPick(id);
		mypageMapper.countMyRecPick(id);
		//내 글
		mypageMapper.countMyQna(id);
		mypageMapper.countMyMyre(id);
		//내 댓글
		mypageMapper.countMyMyreReply(id);
		mypageMapper.countMyQnaReply(id);
		
		return null;
	}
}
