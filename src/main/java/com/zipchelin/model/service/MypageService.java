package com.zipchelin.model.service;

import com.zipchelin.domain.Member;
import com.zipchelin.domain.Myrecipe;
import com.zipchelin.domain.Qna;
import com.zipchelin.model.dto.MyPost;
import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.model.dto.myrecipe.MyrecipeResponseDto;
import com.zipchelin.model.dto.qna.QnaResponseDto;
import com.zipchelin.repository.MypageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MypageService {
	
	@Autowired
	private final MypageRepository mypageRepository;
	
	public MemberResponseDto selectMemberById(String id) {
		Member member=mypageRepository.selectMemberById(id);
		return member.toDto();
	}
	
	public String checkPwd(String id, String pwd) {
		Map<String, String> checkMap=new HashMap<String,String>();
		checkMap.put("id", id);
		checkMap.put("pwd", pwd);
		return mypageRepository.checkPwd(checkMap);
	}
	
	public Map<String, Integer> selectCount(String id){
		return mypageRepository.selectCount(id);
	}
	
	public List<MyrecipeResponseDto> selectMyreById(String id){
		List<Myrecipe> myreList=mypageRepository.selectMyreById(id);
		List<MyrecipeResponseDto> myreDtoList=new ArrayList<MyrecipeResponseDto>();
		
		for(Myrecipe myre:myreList) {
			myreDtoList.add(myre.toDto());
		}
		
		return myreDtoList;
	}
	
	public List<QnaResponseDto> selectQnaById(String id){
		List<Qna> qnaList=mypageRepository.selectQnaById(id);
		List<QnaResponseDto> qnaDtoList=new ArrayList<QnaResponseDto>();
		
		for(Qna qna:qnaList) {
			qnaDtoList.add(qna.toDto());
		}
		
		return qnaDtoList;
	}
	
	public List<MyPost> selectMyPostList(String id){
		List<MyPost> postList=new ArrayList<MyPost>();
		
		List<Qna> qnaList=mypageRepository.selectQnaById(id);
		for(Qna qna:qnaList) {
			postList.add(qna.toMyPost());
		}
		
		List<Myrecipe> myreList=mypageRepository.selectMyreById(id);
		for(Myrecipe myre:myreList) {
			postList.add(myre.toMyPost());
		}
		
		for(int i=0;i<(postList.size()-1);i++) {
			for(int j=i+1;j<postList.size();j++) {
				if(postList.get(i).getPostDate().isBefore(postList.get(j).getPostDate())) {
					MyPost iPost=postList.get(i);
					MyPost jPost=postList.get(j);
					postList.remove(i);
					postList.add(i, jPost);
					postList.remove(j);
					postList.add(j, iPost);
				}
			}
		}
		return postList;
	}
	
	public List<MyPost> selectMyPostList2(String id){
		List<MyPost> postList=selectMyPostList(id);
		while(postList.get(4)!=null) {
			postList.remove(4);
		}
		return postList;
	}
}
