package com.zipchelin.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/search/*")
public class SearchController {

    @GetMapping("/list")
    public String search() {
        return "content/search/search_list";
    }

}
