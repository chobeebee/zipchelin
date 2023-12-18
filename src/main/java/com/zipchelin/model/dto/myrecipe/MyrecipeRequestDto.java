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
	private int myreNum;
	
	@NotBlank
	private String myreTitle;

	@NotBlank
	private String myreCont;
	
	public Myrecipe toEntity() {
		return Myrecipe.builder()
				.myreNum(myreNum)
				.myreTitle(myreTitle)
				.myreCont(myreCont)
				.build();
	}
}
