package com.zipchelin.domain.community;

import com.zipchelin.model.dto.mypage.Myreply;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class QnaReply {
    private long qReNum;
    private long qnaNum;
    private String userImg;
    private String memberId;
    private String reContent;
    private int reUp;
    private LocalDateTime reDate;

    public QnaReplyResponseDto toDto() {
        return QnaReplyResponseDto.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .userImg(userImg)
                .memberId(memberId)
                .reContent(reContent)
                .reUp(reUp)
                .reDate(null)
                .build();
    }

    public QnaReplyRequestDto fromDto() {
        return QnaReplyRequestDto.builder()
                .qReNum(qReNum)
                .qnaNum(qnaNum)
                .userImg(userImg)
                .memberId(memberId)
                .reContent(reContent)
                .build();
    }
    
    public Myreply toMyreply() {
    	return Myreply.builder()
    			.qnaOrRec("qna")
    			.replyDate(reDate)
    			.qnaReply(this)
    			.myRecipeReply(null)
    			.build();
    }
}
