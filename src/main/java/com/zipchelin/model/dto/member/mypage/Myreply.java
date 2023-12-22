package com.zipchelin.model.dto.member.mypage;


import com.zipchelin.domain.admin.RecipeReply;
import com.zipchelin.domain.community.QnaReply;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class Myreply {

	    private String qnaOrRec;
	    private Date replyDate;
	    private QnaReply qnaReply;
	    private RecipeReply recipeReply;
}
