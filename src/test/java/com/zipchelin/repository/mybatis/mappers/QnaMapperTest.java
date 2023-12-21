package com.zipchelin.repository.mybatis.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QnaMapperTest {

    @Autowired
    QnaMapper qnaMapper;

//	@Test
//	void save() {
//		QnaRequest params = new QnaRequest();
//		params.setUser_id("test");
//		params.setQna_title("1");
//		params.setQna_content("1");
//		params.setUser_img("1");
//		String id=qnaMapper.saveQna(params);
//		System.out.println("게시글 개수 : " + id);
//	}

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
    
//    @Test
//    void searchKeyword() {
//    	PagingDto params = new PagingDto(2, 5, 7);
//        
//        
//        List<QnaResponse> findAll = qnaMapper.findAll(params);
//        System.out.println(params.getOffsetStart());
//        System.out.println(params.getOffsetEnd());
//    }

}
