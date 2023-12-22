package com.zipchelin.model.dto.member.mypage;


import com.zipchelin.domain.community.MyRecipeReply;
import com.zipchelin.domain.community.QnaReply;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Builder
@Getter
public class Myreply {

	    private String qnaOrRec;
	    private LocalDateTime replyDate;
	    private QnaReply qnaReply;
	    private MyRecipeReply myRecipeReply;
}
