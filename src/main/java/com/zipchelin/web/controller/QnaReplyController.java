package com.zipchelin.web.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zipchelin.model.dto.community.qna.QnaDto;
import com.zipchelin.model.dto.community.qna.QnaResponseDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyRequestDto;
import com.zipchelin.model.dto.community.qnaReply.QnaReplyResponseDto;
import com.zipchelin.model.service.QnaReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
	@RestController
	@RequiredArgsConstructor
	public class QnaReplyController {
		
		private final QnaReplyService qnareplyservice;
		
		@GetMapping("/community/qna/post/{qnaNum}")
		public List<QnaReplyResponseDto> findAllQna(@ModelAttribute final Long qnaNum) {
			return qnareplyservice.findAllQna(qnaNum);
			
	    }
		
		@PostMapping("/community/qna/post/{qnaNum}")
		public Long postQna(@RequestBody final QnaReplyRequestDto params) {
			Long id = qnareplyservice.saveQna(params);
	        return id;
	    }
	}
