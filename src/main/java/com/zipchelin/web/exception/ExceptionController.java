package com.zipchelin.web.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BadRequestException.class)
    String badRequestExceptionHandle(BadRequestException e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "error/404";
    }

    @ExceptionHandler(BusinessLogicException.class)
    String businessLogicExceptionHandle(BusinessLogicException e, Model model) {
        model.addAttribute("error", e.getMessage());
        return "error/500";
    }
}
