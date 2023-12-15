package com.zipchelin.repository.mybatis.mappers;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.zipchelin.domain.Notice;

@Mapper
public interface NoticeMapper {
	
	void addNotice(Notice notice);

    int selectNotice(Notice notice);

    void delNotice(int noticeNum);

    void updateNotice(Notice notice);

}
