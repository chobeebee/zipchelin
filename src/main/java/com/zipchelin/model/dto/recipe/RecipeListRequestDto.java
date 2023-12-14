package com.zipchelin.model.dto.recipe;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class RecipeListRequestDto {

	@NotBlank
	private int catNum;
	
	@NotBlank
	private int recNum;
}
