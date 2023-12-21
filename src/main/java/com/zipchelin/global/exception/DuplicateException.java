package com.zipchelin.global.exception;

public class DuplicateException extends BadRequestException {

    public DuplicateException(String message) {
        super(message);
    }
}
