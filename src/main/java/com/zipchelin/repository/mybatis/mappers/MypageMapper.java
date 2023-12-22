package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.community.RecipeReply;

import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.domain.community.Qna;
import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.domain.member.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

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

    public List<Qna> selectQnaById(String id);

    public List<Myrecipe> selectMyreById(String id);

    //public List<Guide> selectGuiHeart(String id);

    //public List<Recipe> selectRecHeart(String id);
    
    public List<QnaReply> selectQnaReply(String id);
    
    public List<RecipeReply> selectRecipeReply(String id);
    
    //public List<Myheart> getListPaging(Criteria cri);
}
