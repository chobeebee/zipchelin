package com.zipchelin.model.dto.myrecipe;

import javax.validation.constraints.NotBlank;

import com.zipchelin.domain.Myrecipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MyrecipeRequestDto {
	
	@NotBlank
	private String userId;
	
	@NotBlank
	private String myreTitle;

	@NotBlank
	private String myreContent;
	
	public Myrecipe toEntity() {
		return Myrecipe.builder()
				.userId(userId)
				.myreTitle(myreTitle)
				.myreContent(myreContent)
				.build();
	}
}
