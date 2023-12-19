package com.zipchelin.model.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zipchelin.domain.Member;
import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.repository.MypageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageService {
	
	@Autowired
	private final MypageRepository mypageRepository;
	
	public MemberResponseDto selectMemberById(String id) {
		Member member=mypageRepository.selectById(id);
		return member.toDto();
	}
	
	public String checkPwd(String id, String pwd) {
		Map<String, String> checkMap=new HashMap<String,String>();
		checkMap.put("id", id);
		checkMap.put("pwd", pwd);
		return mypageRepository.checkPwd(checkMap);
	}
	
	/*public Map<String, Integer> selectCount(String id){
		return mypageRepository.selectCount(id);
	}/*
	
	/*public List<MyrecipeResponseDto> selectMyreById(){
		
	}*/
	
	/*public List<QnaResponseDto> selectQnaById(){
		
	}*/
}
