package com.zipchelin.domain;

import java.time.LocalDateTime;

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
	private int myreNum;
	private String myreTitle;
	private String myreCont;
	private int myreUp;
	private int myreReply;
	private LocalDateTime myreDate;
	
	public MyrecipeResponseDto toDto() {
		return MyrecipeResponseDto.builder()
				.myreNum(myreNum)
				.myreTitle(myreTitle)
				.myreCont(myreCont)
				.myreUp(myreUp)
				.myreReply(myreReply)
				.myreDate(myreDate)
				.build();
	}
	
	public MyrecipeRequestDto fromDto() {
		return MyrecipeRequestDto.builder()
				.myreNum(myreNum)
				.myreTitle(myreTitle)
				.myreCont(myreCont)
				.build();
	}
	
}
