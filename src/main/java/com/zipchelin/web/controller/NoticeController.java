package com.zipchelin.web.controller;

import com.zipchelin.model.dto.admin.notice.PageMakerDTO;
import com.zipchelin.model.page.Criteria;
import com.zipchelin.model.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/notice")
public class NoticeController {
    private static final Logger log = LoggerFactory.getLogger(NoticeController.class);

    @Autowired
    private NoticeService noticeService;

//	@GetMapping
//	public String notice(Model model) {
//		log.info("게시판 목록 페이지 진입");
//		model.addAttribute("noticeList", noticeService.selectAll());
//		return "content/notice";
//	}

    @GetMapping
    public String notice(Model model, Criteria cri) {
        model.addAttribute("noticeList", noticeService.getListPaging(cri));

        int total = noticeService.getTotal();
        PageMakerDTO pageMake = new PageMakerDTO(cri, total);
        model.addAttribute("pageMaker", pageMake);
        return "content/notice";
    }
}
