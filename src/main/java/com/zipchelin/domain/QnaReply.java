package com.zipchelin.domain;

import com.zipchelin.model.dto.Myheart;
import com.zipchelin.model.dto.Myreply;
import com.zipchelin.model.dto.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.qnaReply.QnaReplyResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
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
    			.recipeReply(null)
    			.build();
    }
}
