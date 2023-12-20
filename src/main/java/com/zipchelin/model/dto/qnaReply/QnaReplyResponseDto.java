package com.zipchelin.model.dto.qnaReply;

import javax.validation.constraints.NotBlank;

import com.zipchelin.domain.QnaReply;
import com.zipchelin.domain.RecipeHeart;
import com.zipchelin.model.dto.recipeHeart.RecipeHeartRequestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class QnaReplyResponseDto {
	
	@NotBlank
	private int qReNum;
	
	@NotBlank
	private int qnaNum;
	
	@NotBlank
	private String userImg;
	
	@NotBlank
	private int Order;
	
	@NotBlank
	private String reId;
	
	@NotBlank
	private String reContent;
	
	@NotBlank
	private int reUp;
	
	public QnaReply toEntity() {
		return QnaReply.builder()
				.qReNum(qReNum)
				.qnaNum(qnaNum)
				.userImg(userImg)
				.Order(Order)
				.reId(reId)
				.reContent(reContent)
				.reUp(reUp)
				.build();
	}
}
