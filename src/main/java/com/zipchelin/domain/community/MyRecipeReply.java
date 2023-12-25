package com.zipchelin.domain.community;

import com.zipchelin.model.dto.mypage.Myreply;
import com.zipchelin.model.dto.community.myrecipeReply.MyRecipeReplyRequestDto;
import com.zipchelin.model.dto.community.myrecipeReply.MyRecipeReplyResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MyRecipeReply {
    private int mReNum;
    private int myReNum;
    private String userImg;
    private String postId;
    private String reId;
    private String reContent;
    private int reUp;
    private LocalDateTime replyDate;

    public MyRecipeReplyResponseDto toDto() {
        return MyRecipeReplyResponseDto.builder()
                .mReNum(mReNum)
                .myReNum(myReNum)
                .userImg(userImg)
                .postId(postId)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }

    public MyRecipeReplyRequestDto fromDto() {
        return MyRecipeReplyRequestDto.builder()
                .mReNum(mReNum)
                .myReNum(myReNum)
                .userImg(userImg)
                .postId(postId)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }
    
    public Myreply toMyreply() {
    	return Myreply.builder()
    			.qnaOrRec("rec")
    			.replyDate(replyDate)
    			.qnaReply(null)
    			.myRecipeReply(this)
    			.build();
    }
}
