package com.zipchelin.model.dto.guideHeart;

import javax.validation.constraints.NotBlank;

import com.zipchelin.domain.GuideHeart;
import com.zipchelin.model.dto.myrecipe.MyrecipeRequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class GuideHeartRequestDto {
	@NotBlank
	private int pickId;
	
	@NotBlank
	private int guiNum;
	
	@NotBlank
	private String userId;
	
	public GuideHeart toEntity() {
		return GuideHeart.builder()
				.pickId(pickId)
				.guiNum(guiNum)
				.userId(userId)
				.build();
	}
}
