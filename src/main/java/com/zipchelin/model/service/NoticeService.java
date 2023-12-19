package com.zipchelin.model.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;

@Service
public interface NoticeService {

	public List<Notice> selectAll();
	
	public void addNotice(Notice notice);
	
	public Notice getPage(Integer noticeNum);
	
	public void updateNotice(Notice notice);
	
	public void delNotice(Integer newArr);
	
	public List<Notice> getListPaging(Criteria cri);
	
	public int getTotal();
}
