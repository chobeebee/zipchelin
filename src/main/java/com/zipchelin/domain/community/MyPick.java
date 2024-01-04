package com.zipchelin.domain.community;

import java.time.LocalDateTime;
import java.util.Date;

import com.zipchelin.model.dto.community.myPick.MyPickRequestDto;
import com.zipchelin.model.dto.community.myPick.MyPickResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class MyPick {
	private int pickId;
	private String userId;
	private int guiNum;
	private int recNum;
	private LocalDateTime guiPickDatetime;
	private LocalDateTime recPickDatetime;
	
	public MyPickResponseDto toDto() {
		return MyPickResponseDto.builder()
				.pickId(pickId)
				.userId(userId)
				.guiNum(guiNum)
				.recNum(recNum)
				.build();
	}
	
	public MyPickRequestDto fromDto() {
		return MyPickRequestDto.builder()
				.pickId(pickId)
				.userId(userId)
				.guiNum(guiNum)
				.recNum(recNum)
				.build();
	}
}
