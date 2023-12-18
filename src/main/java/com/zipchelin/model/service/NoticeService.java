package com.zipchelin.model.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.zipchelin.domain.Notice;

@Service
public interface NoticeService {

	public List<Notice> selectAll();
	
	public void addNotice(Notice notice);
	
	public Notice getPage(Integer noticeNum);
	
	public void updateNotice(Notice notice);
	
	public void delNotice(String noticeNum);
}
