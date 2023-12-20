package com.zipchelin.domain;

import java.time.LocalDateTime;

import com.zipchelin.model.dto.MyPost;
import com.zipchelin.model.dto.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.myrecipe.MyrecipeResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Myrecipe {
	private String userId;
	private int myreNum;
	private String myreTitle;
	private String myreContent;
	private int myreUp;
	private LocalDateTime myreDate;
	
	public MyrecipeResponseDto toDto() {
		return MyrecipeResponseDto.builder()
				.myreNum(myreNum)
				.myreTitle(myreTitle)
				.myreUp(myreUp)
				.myreDate(myreDate)
				.build();
	}
	
	public MyrecipeRequestDto fromDto() {
		return MyrecipeRequestDto.builder()
				.userId(userId)
				.myreContent(myreContent)
				.myreTitle(myreTitle)
				.build();
	}
	
	public MyPost toMyPost() {
		return MyPost
				.builder()
				.myrecipe(this)
				.myreOrQna("myre")
				.postDate(myreDate)
				.qna(null)
				.build();
	}
	
}
