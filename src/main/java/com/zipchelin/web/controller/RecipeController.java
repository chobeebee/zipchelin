package com.zipchelin.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/recipe/*")
public class RecipeController {

    @GetMapping("/list")
    public String guide() {
        return "content/recipe/recipe_list";
    }

    @GetMapping("/detail")
    public String viewRecipe() {
        return "content/recipe/recipe_detail";
    }

}
