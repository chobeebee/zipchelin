	package com.zipchelin.web.controller;

import com.zipchelin.domain.admin.Notice;
import com.zipchelin.model.dto.admin.notice.PageMakerDTO;
import com.zipchelin.model.dto.admin.page.Criteria;
import com.zipchelin.model.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/*")
public class AdminController {

    @Autowired
    private NoticeService noticeService;

    // 관리자 페이지 이동
    @GetMapping
    public String admin() {
        return "admin/admin";
    }

    @GetMapping("/delmem")
    public String delMem() {
        return "admin/content/delMem";
    }

    @GetMapping("/editmem")
    public String editMem() {
        return "admin/content/editMem";
    }

    // 공지사항 CRUD
    // 공지사항 조회
    @GetMapping("/notice")
    public String notice(Model model, Criteria cri) {
        model.addAttribute("noticeList", noticeService.getListPaging(cri));

        int total = noticeService.getTotal();
        PageMakerDTO pageMake = new PageMakerDTO(cri, total);
        model.addAttribute("pageMaker", pageMake);
        return "admin/content/notice";
    }


    // 공지사항 추가 페이지 이동
    @GetMapping("/addnotice")
    public String viewAddNotice() {
        return "admin/content/addNotice";
    }

    // 공지사항 추가 실행
    @PostMapping("/addnotice")
    public String addNotice(Notice notice) {
        noticeService.addNotice(notice);
        return "redirect:/admin/notice";
    }

    // 공지사항 수정 페이지 이동
    @GetMapping("/updatenotice")
    public String viewUpdateNotice(Integer noticeNum, Model model) {
        model.addAttribute("noticeInfo", noticeService.getPage(noticeNum));
        return "admin/content/updateNotice";
    }

    // 공지사항 수정 실행
    @PostMapping("/updatenotice")
    public String updateNotice(Notice notice) {
        noticeService.updateNotice(notice);
        return "redirect:/admin/notice";
    }

    // 공지사항 삭제
    @PostMapping("/delnotice")
    public void delNotice(HttpServletRequest request) {
    	noticeService.delNotice(request);
    }


    @GetMapping("/guide")
    public String guide() {
        return "admin/content/guide";
    }

    @GetMapping("/guide/form")
    public String guideForm() {
        return "admin/content/guideForm";
    }

    @GetMapping("/recipe")
    public String recipe() {
        return "admin/content/recipe";
    }

    @GetMapping("/recipe/form")
    public String recipeForm() {
        return "admin/content/recipeForm";
    }

    @GetMapping("/recipe/modify")
    public String editRecipe() {
        return "admin/content/recipeModify";
    }

    @GetMapping("/community")
    public String community() {
        return "admin/content/community";
    }
}
