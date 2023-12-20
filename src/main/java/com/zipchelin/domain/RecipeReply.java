package com.zipchelin.domain;

import java.time.LocalDateTime;

import com.zipchelin.model.dto.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.qnaReply.QnaReplyResponseDto;
import com.zipchelin.model.dto.recipeReply.RecipeReplyRequestDto;
import com.zipchelin.model.dto.recipeReply.RecipeReplyResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class RecipeReply {
	private int mReNum;
	private int myReNum;
	private String userImg;
	private String postId;
	private String reId;
	private String reContent;
	private int reUp;
	private LocalDateTime reDate;
	
	public RecipeReplyResponseDto toDto() {
		return RecipeReplyResponseDto.builder()
				.mReNum(mReNum)
				.myReNum(myReNum)
				.userImg(userImg)
				.postId(postId)
				.reId(reId)
				.reContent(reContent)
				.reUp(reUp)
				.build();
	}
	
	public RecipeReplyRequestDto fromDto() {
		return RecipeReplyRequestDto.builder()
				.mReNum(mReNum)
				.myReNum(myReNum)
				.userImg(userImg)
				.postId(postId)
				.reId(reId)
				.reContent(reContent)
				.reUp(reUp)
				.build();
	}
}
