package com.zipchelin.model.service;

import com.zipchelin.domain.Notice;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.repository.NoticeRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

    public void delNotice(HttpServletRequest request) {
        String[] ajaxMsg = request.getParameterValues("valueArr");
        Arrays.stream(ajaxMsg).map(Integer::parseInt).forEach(noticeRepository::delNotice);
    }

    public List<Notice> getListPaging(Criteria cri) {
        return noticeRepository.getListPaging(cri);
    }

    public int getTotal() {
        return noticeRepository.getTotal();
    }
}
