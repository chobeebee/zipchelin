//package com.zipchelin.model.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.zipchelin.model.dto.QnaListDto;
//
//public class QnaListServiceImpl implements BoardService{
//	
//	@Autowired
//	BoardDaoImpl boarddao;
//	
//	@Override
//	public List<QnaListDto> getBoardList() throws Exception {
//		System.out.println("s1");
//		List<QnaListDto> results = boarddao.selectBoardList();
//		System.out.println("s2");
//		
//		return results;
//	}
//}
