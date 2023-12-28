package com.zipchelin.model.dto.community.myPick;

import javax.validation.constraints.NotBlank;

import com.zipchelin.domain.community.MyPick;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MyPickResponseDto {
	
	@NotBlank
	private int pickId;
	
	@NotBlank
	private String userId;
	
	@NotBlank
	private int guiNum;
	
	@NotBlank
	private int recNum;
	
	public MyPick toEntity() {
		return MyPick.builder()
				.pickId(pickId)
				.userId(userId)
				.guiNum(guiNum)
				.recNum(recNum)
				.build();
	}
}
