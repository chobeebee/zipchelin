package com.zipchelin.web.controller;

import com.zipchelin.model.dto.qna.QnaDto;
import com.zipchelin.model.dto.qna.QnaRequest;
import com.zipchelin.model.dto.qna.QnaResponse;
import com.zipchelin.model.service.QnaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/qna/*")
public class QnaController {

    private final QnaService qnaService;

    @GetMapping("")
    public String viewQna(@ModelAttribute("params") final QnaDto params, Model model) {
        List<QnaResponse> qna = qnaService.findAllQna(params);
        model.addAttribute("qna", qna);
        return "content/qna/qna";
    }

    @PostMapping("/upload")
    public String postQna() {
        return "content/qna/upload";
    }

    @GetMapping("/post/{num}")  // /qna/post/id값
    public String postQna(@PathVariable("num") Long id, Model model) {
        QnaResponse qna = qnaService.findQnaById(id);
        model.addAttribute("qna", qna);
        return "content/qna/qna_post";
    }

    @GetMapping("/form")
    public String saveFormQna(@RequestParam(value = "id", required = false) final Long id, Model model) {
        if (id != null) {
            QnaResponse qna = qnaService.findQnaById(id);
            model.addAttribute("qna", qna);
        }
        return "content/qna/qna_form";
    }

    @PostMapping("/save")
    public String saveQna(final QnaRequest params) {
        qnaService.saveQna(params);
        return "redirect:/qna/qna";
    }

    @GetMapping("/delete/{num}")
    public String deleteQna(@PathVariable("num") final Long id) {
        qnaService.deleteQna(id);
        return "redirect:/qna/qna";
    }

    @GetMapping("/update/{num}")
    public String updateFormQna(@PathVariable("num") final Long id, Model model) {
        if (id != null) {
            QnaResponse qna = qnaService.findQnaById(id);
            model.addAttribute("qna", qna);
        }
        return "content/qna/qna_update";
    }

    @PostMapping("/update")
    public String updateQna(final QnaRequest params) {
        qnaService.updateQna(params);
        System.out.println(params);
        return "redirect:/qna/qna";
    }

}
