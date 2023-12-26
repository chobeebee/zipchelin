package com.zipchelin.domain.community;

import java.time.LocalDateTime;

import com.zipchelin.model.dto.community.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.community.myrecipe.MyrecipeResponseDto;
import com.zipchelin.model.dto.member.mypage.MyPost;

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
	private long myreNum;
	private String userId;
	private String myreTitle;
	private String myreContent;
	private LocalDateTime myreDate;
	private int myreUp;
	
	public MyrecipeResponseDto toDto() {
		return MyrecipeResponseDto.builder()
				.myreNum(myreNum)
				.userId(userId)
				.myreTitle(myreTitle)
				.myreContent(myreContent)
				.myreUp(myreUp)
				.myreDate(myreDate)
				.build();
	}
	
	public MyrecipeRequestDto fromDto() {
		return MyrecipeRequestDto.builder()
				.userId(userId)
				.myreTitle(myreTitle)
				.myreContent(myreContent)
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
