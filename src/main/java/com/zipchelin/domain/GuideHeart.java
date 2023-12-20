package com.zipchelin.domain;

import java.time.LocalDateTime;

import com.zipchelin.model.dto.guideHeart.GuideHeartRequestDto;
import com.zipchelin.model.dto.myrecipe.MyrecipeRequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GuideHeart {
	private int pickId;
	private int guiNum;
	private String userId;
	private LocalDateTime guiPickDatetime;
	
	public GuideHeartRequestDto fromDto() {
		return GuideHeartRequestDto.builder()
				.pickId(pickId)
				.guiNum(guiNum)
				.userId(userId)
				.build();
	}
}
