package com.zipchelin.domain.community;

import java.time.LocalDateTime;

import com.zipchelin.model.dto.member.mypage.MyPost;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
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
				.userId(userId)
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
