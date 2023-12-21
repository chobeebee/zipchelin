package com.zipchelin.repository;

import com.zipchelin.domain.*;

import java.util.List;
import java.util.Map;

public interface MypageRepository {

    public Member selectMemberById(String id);

    public String checkPwd(Map<String, String> map);

    public void updateMember(Member member);

    public Map<String, Integer> selectCount(String id);

    public List<Qna> selectQnaById(String id);

    public List<Myrecipe> selectMyreById(String id);

    public List<Guide> selectGuiHeart(String id);

    public List<Recipe> selectRecHeart(String id);
    
    public List<QnaReply> selectQnaReply(String id);
    
    public List<RecipeReply> selectRecipeReply(String id);
}
