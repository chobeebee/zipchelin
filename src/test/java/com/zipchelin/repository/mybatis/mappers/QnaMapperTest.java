package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.zipchelin.domain.qna.QnaRequest;
import com.zipchelin.domain.qna.QnaResponse;
import com.zipchelin.model.service.QnaService;

@SpringBootTest
public class QnaMapperTest {
	
	@Autowired
	QnaService qnaMapper;
	
	@Test
	void save() {
		QnaRequest params = new QnaRequest();
		params.setUser_id("test");
		params.setQna_title("1");
		params.setQna_content("1");
		params.setUser_img("1");
		String id=qnaMapper.saveQna(params);
		System.out.println("게시글 개수 : " + id);
	}
	
//	@Test
//    void findById() {
//		QnaResponse qna = qnaMapper.findById("test");
//        System.out.println(qna.getUser_id());
//	}
	
//	@Test
//	void update() {
//		QnaRequest params = new QnaRequest();
//		params.setUser_id("test");
//		params.setQna_content("100");
//		params.setQna_title("100");
//		params.setUser_img("100");
//		qnaMapper.update(params);
//		
//		QnaResponse qna = qnaMapper.findById("test");
//		System.out.println(qna.getUser_id());
//	}
	
//	@Test
//	void delete() {
//		System.out.println("삭제 이전의 전체 게시글 개수는 : " + qnaMapper.findAll().size() + "개입니다.");
//        qnaMapper.deleteById("test1");
//        System.out.println("삭제 이후의 전체 게시글 개수는 : " + qnaMapper.findAll().size() + "개입니다.");
//	}
}
