package com.zipchelin.model.service;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
	private final NoticeRepository noticeRepository;

	public List<Notice> selectAll() {
        return noticeRepository.selectAll();
    }

	public void addNotice(Notice notice) {
        noticeRepository.addNotice(notice);
    }

	public Notice getPage(Integer noticeNum) {
        return noticeRepository.getPage(noticeNum);
    }

    public void updateNotice(Notice notice) {
        noticeRepository.updateNotice(notice);

    }

    public void delNotice(Integer newArr) {
        noticeRepository.delNotice(newArr);
    }

    public List<Notice> getListPaging(Criteria cri) {
        return noticeRepository.getListPaging(cri);
    }

    public int getTotal() {
        return noticeRepository.getTotal();
    }
}
