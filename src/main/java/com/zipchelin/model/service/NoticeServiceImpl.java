package com.zipchelin.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService{
	private final NoticeRepository noticeRepository;
	
	@Override
	public List<Notice> selectAll(){
		return noticeRepository.selectAll();
	}

	@Override
	public void addNotice(Notice notice) {
		noticeRepository.addNotice(notice);		
	}

	@Override
	public void updateNotice(Notice notice) {
		noticeRepository.updateNotice(notice);
		
	}

	@Override
	public void delNotice(Integer newArr) {
		noticeRepository.delNotice(newArr);
	}

	@Override
	public Notice getPage(Integer noticeNum) {
		return noticeRepository.getPage(noticeNum);
	}

	@Override
	public List<Notice> getListPaging(Criteria cri) {
		return noticeRepository.getListPaging(cri);
	}

	@Override
	public int getTotal() {
		return noticeRepository.getTotal();
	}

	
}
