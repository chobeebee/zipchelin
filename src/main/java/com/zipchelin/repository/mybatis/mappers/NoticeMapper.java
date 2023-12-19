package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Notice;

@Mapper
public interface NoticeMapper {
	
	//공지사항 전체 조회
	public List<Notice> selectAll();
	
	public void addNotice(Notice notice);
	
	public Notice getPage(Integer noticeNum);

	public void delNotice(Integer newArr);
    
	public void updateNotice(Notice notice);

}
