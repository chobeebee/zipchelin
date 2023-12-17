package com.zipchelin.model.dto.myrecipe;

import java.time.LocalDateTime;

import com.zipchelin.domain.Myrecipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MyrecipeResponseDto {
	private int myreNum;
	private String myreTitle;
	private String myreCont;
	private int myreUp;
	private int myreReply;
	private LocalDateTime myreDate;
	
	public Myrecipe toEntity() {
		return Myrecipe.builder()
				.myreNum(myreNum)
				.myreTitle(myreTitle)
				.myreCont(myreCont)
				.myreUp(myreUp)
				.myreReply(myreReply)
				.myreDate(myreDate)
				.build();
	}
}
