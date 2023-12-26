package com.zipchelin.repository.mybatis;

import com.zipchelin.domain.community.MyPick;
import com.zipchelin.domain.community.MyRecipeReply;
import com.zipchelin.domain.community.Myrecipe;
import com.zipchelin.domain.community.Qna;
import com.zipchelin.domain.community.QnaReply;
import com.zipchelin.domain.member.Member;
import com.zipchelin.repository.MypageRepository;
import com.zipchelin.repository.mybatis.mappers.MypageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class MypageMapperMybatis implements MypageRepository {

    private final MypageMapper mypageMapper;

    @Override
    public Member selectMemberById(String id) {
        return mypageMapper.selectMemberById(id);
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
        int pickCnt = 0;
        pickCnt += mypageMapper.countMyGuiPick(id);
        pickCnt += mypageMapper.countMyRecPick(id);
        System.out.println("pickCnt=" + pickCnt);
        //내 글
        int postCnt = 0;
        postCnt += mypageMapper.countMyQna(id);
        postCnt += mypageMapper.countMyMyre(id);
        System.out.println("postCnt=" + postCnt);
        //내 댓글
        int replyCnt = 0;
        replyCnt += mypageMapper.countMyMyreReply(id);
        replyCnt += mypageMapper.countMyQnaReply(id);

        Map<String, Integer> countMap = new HashMap<String, Integer>();
        countMap.put("pickCnt", pickCnt);
        countMap.put("postCnt", postCnt);
        countMap.put("replyCnt", replyCnt);

        return countMap;
    }

    @Override
    public List<Qna> selectQnaById(String id) {
        return mypageMapper.selectQnaById(id);
    }

    @Override
    public List<Myrecipe> selectMyreById(String id) {
        return mypageMapper.selectMyreById(id);
    }
    
    @Override
    public List<QnaReply> selectQnaReply(String id){
    	return mypageMapper.selectQnaReply(id);
    }
    
    @Override
    public List<MyRecipeReply> selectRecipeReply(String id){
    	return mypageMapper.selectRecipeReply(id);
    }

    @Override
    public List<MyPick> selectMyPick(String id) {
       return mypageMapper.selectMyPick(id);
    }

	@Override
	public void deleteMyre(List<String> deleteList) {
		for(String deletePost:deleteList) {
			mypageMapper.deleteMyre(deletePost);
		}
	}

	@Override
	public void deleteQna(List<String> deleteList) {
		for(String deletePost:deleteList) {
			mypageMapper.deleteQna(deletePost);
		}
	}

    /*
	@Override
	public List<Myheart> getListPaging(Criteria cri) {
		return mypageMapper.getListPaging(cri);
	}
	*/

}
