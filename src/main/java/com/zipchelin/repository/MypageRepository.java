package com.zipchelin.repository;

import com.zipchelin.domain.admin.RecipeReply;
import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.domain.community.Qna;
import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.domain.member.Member;

import java.util.List;
import java.util.Map;

public interface MypageRepository {

    public Member selectMemberById(String id);

    public String checkPwd(Map<String, String> map);

    public void updateMember(Member member);

    public Map<String, Integer> selectCount(String id);

    public List<Qna> selectQnaById(String id);

    public List<Myrecipe> selectMyreById(String id);

    //public List<Guide> selectGuiHeart(String id);

    //public List<Recipe> selectRecHeart(String id);
    
    public List<QnaReply> selectQnaReply(String id);
    
    public List<RecipeReply> selectRecipeReply(String id);
    
    //public List<Myheart> getListPaging(Criteria cri);
}
