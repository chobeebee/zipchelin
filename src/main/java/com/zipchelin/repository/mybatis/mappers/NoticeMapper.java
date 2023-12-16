package com.zipchelin.repository.mybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Notice;

@Mapper
public interface NoticeMapper {
	
	List<Notice> selectAll();
	
	void addNotice(Notice notice);

    void delNotice(int noticeNum);

    void updateNotice(Notice notice);
    
    int count();

}
