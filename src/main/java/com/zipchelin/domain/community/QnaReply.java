package com.zipchelin.domain.community;

import com.zipchelin.model.dto.member.mypage.Myreply;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class QnaReply {
    private int qReNum;
    private int qnaNum;
    private String userImg;
    private int Order;
    private String reId;
    private String reContent;
    private int reUp;
    private Date replyDate;

    public QnaReplyResponseDto toDto() {
        return QnaReplyResponseDto.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .userImg(userImg)
                .Order(Order)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }

    public QnaReplyRequestDto fromDto() {
        return QnaReplyRequestDto.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .userImg(userImg)
                .Order(Order)
                .reId(reId)
                .reContent(reContent)
                .reUp(reUp)
                .build();
    }
    
    public Myreply toMyreply() {
    	return Myreply.builder()
    			.qnaOrRec("qna")
    			.replyDate(replyDate)
    			.qnaReply(this)
    			.myRecipeReply(null)
    			.build();
    }
}
