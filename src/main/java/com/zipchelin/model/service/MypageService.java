package com.zipchelin.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zipchelin.domain.community.MyPick;
import com.zipchelin.domain.community.MyRecipeReply;
import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.domain.community.Qna;
import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.domain.member.Member;
import com.zipchelin.model.dto.member.MemberResponseDto;
import com.zipchelin.model.dto.mypage.MyPost;
import com.zipchelin.model.dto.mypage.Myreply;
import com.zipchelin.repository.MypageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageService {

    @Autowired
    private final MypageRepository mypageRepository;

    public MemberResponseDto selectMemberById(String id) {
        Member member = mypageRepository.selectMemberById(id);
        return member.toDto();
    }

    public String checkPwd(String id, String pwd) {
        Map<String, String> checkMap = new HashMap<String, String>();
        checkMap.put("id", id);
        checkMap.put("pwd", pwd);
        return mypageRepository.checkPwd(checkMap);
    }

    public Map<String, Integer> selectCount(String id) {
        return mypageRepository.selectCount(id);
    }

    public List<MyPost> selectMyreById(String id) {
        List<Myrecipe> myreList = mypageRepository.selectMyreById(id);
        List<MyPost> myPostList = new ArrayList<MyPost>();

        for (Myrecipe myre : myreList) {
        	myPostList.add(myre.toMyPost());
        }

        return myPostList;
    }

    public List<MyPost> selectQnaById(String id) {
        List<Qna> qnaList = mypageRepository.selectQnaById(id);
        List<MyPost> myPostList = new ArrayList<MyPost>();

        for (Qna qna : qnaList) {
        	myPostList.add(qna.toMyPost());
        }

        return myPostList;
    }

    public List<MyPost> selectMyPostList(String id) {
        List<MyPost> postList = new ArrayList<MyPost>();

        List<Qna> qnaList = mypageRepository.selectQnaById(id);
        for (Qna qna : qnaList) {
            postList.add(qna.toMyPost());
        }

        List<Myrecipe> myreList = mypageRepository.selectMyreById(id);
        for (Myrecipe myre : myreList) {
            postList.add(myre.toMyPost());
        }

        for (int i = 0; i < (postList.size() - 1); i++) {
            for (int j = i + 1; j < postList.size(); j++) {
                if (postList.get(i).getPostDate().isBefore(postList.get(j).getPostDate())) {
                    MyPost iPost = postList.get(i);
                    MyPost jPost = postList.get(j);
                    postList.remove(i);
                    postList.add(i, jPost);
                    postList.remove(j);
                    postList.add(j, iPost);
                }
            }
        }
        return postList;
    }

    public List<MyPost> selectMyPostList2(String id) {
        List<MyPost> postList = selectMyPostList(id);
        while(postList.size() >= 5) {
            postList.remove(4);
        }
        return postList;
    }
    
    public List<MyPick> selectPickList(String id) {
        List<MyPick> pickList = new ArrayList<MyPick>();
        for(MyPick pick : pickList) {
        	pickList.add(pick);
        }

        for (int i = 0; i < pickList.size() - 1; i++) {
            for (int j = i + 1; j < pickList.size(); j++) {
                //i번쨰에 있는 애가 j번째 보다 예전 것일때 true
                if (pickList.get(i).getGuiPickDatetime().isBefore(pickList.get(j).getRecPickDatetime())) {
                    MyPick ipick = pickList.get(i);
                    MyPick jpick = pickList.get(j);
                    pickList.remove(i);
                    pickList.add(i, jpick);
                    pickList.remove(j);
                    pickList.add(j, ipick);
                }
            }
        }
        return pickList;
    }
    
    public List<Myreply> selectReplyList(String id){
    	List<Myreply> replyList=new ArrayList<Myreply>();
    	
    	List<QnaReply> qnaReplyList = mypageRepository.selectQnaReply(id);
        for (QnaReply qna : qnaReplyList) {
        	replyList.add(qna.toMyreply());
        }

        List<MyRecipeReply> myRecipeReplyList = mypageRepository.selectRecipeReply(id);
        for (MyRecipeReply rec : myRecipeReplyList) {
        	replyList.add(rec.toMyreply());
        }

        for (int i = 0; i < replyList.size() - 1; i++) {
            for (int j = i + 1; j < replyList.size(); j++) {
                if (replyList.get(i).getReplyDate().isBefore(myRecipeReplyList.get(j).getReplyDate())) {
                	Myreply ireply = replyList.get(i);
                	Myreply jreply = replyList.get(j);
                    replyList.remove(i);
                    replyList.add(i, jreply);
                    replyList.remove(j);
                    replyList.add(j, ireply);
                }
            }
        }
        return replyList;
    }
    
   /* public List<Myheart> getListPaging(Criteria cri) {
        return mypageRepository.getListPaging(cri);
    }*/
}
