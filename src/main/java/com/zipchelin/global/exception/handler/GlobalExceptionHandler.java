package com.zipchelin.global.exception.handler;

import com.zipchelin.global.exception.BadRequestException;
import com.zipchelin.global.exception.BusinessLogicException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

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
