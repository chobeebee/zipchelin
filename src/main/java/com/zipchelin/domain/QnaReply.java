package com.zipchelin.domain;

import java.time.LocalDateTime;

import com.zipchelin.model.dto.myrecipe.MyrecipeRequestDto;
import com.zipchelin.model.dto.myrecipe.MyrecipeResponseDto;
import com.zipchelin.model.dto.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.qnaReply.QnaReplyResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class QnaReply {
	private int qReNum;
	private int qnaNum;
	private String userImg;
	private int Order;
	private String reId;
	private String reContent;
	private int reUp;
	private LocalDateTime reDate;
	
	public QnaReplyResponseDto toDto() {
		return QnaReplyResponseDto.builder()
				.qReNum(qReNum)
				.qnaNum(qnaNum)
				.userImg(userImg)
				.Order(Order)
				.reId(reId)
				.reContent(reContent)
				.reUp(reUp)
				.build();
	}
	
	public QnaReplyRequestDto fromDto() {
		return QnaReplyRequestDto.builder()
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
