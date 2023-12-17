package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Notice;
import com.zipchelin.domain.Paging;

@Mapper
public interface NoticeMapper {
	
	//공지사항 전체 조회
	public List<Notice> selectAll();
	
	public void addNotice(Notice notice);
    void selectNotice(Notice notice);

    void delNotice(int noticeNum);
    void updateNotice(Notice notice);
    
    int count();

}
