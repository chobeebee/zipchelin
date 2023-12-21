package com.zipchelin.model.dto;


import java.time.LocalDateTime;
import java.util.Date;

import com.zipchelin.domain.QnaReply;
import com.zipchelin.domain.RecipeReply;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Myreply {

	    private String qnaOrRec;
	    private Date replyDate;
	    private QnaReply qnaReply;
	    private RecipeReply recipeReply;
}
