package com.zipchelin.global.exception;

public class BusinessLogicException extends RuntimeException {

    public BusinessLogicException(String message) {
        super(message);
    }

    public BusinessLogicException(Exception e) {
        super(e.getMessage());
    }
}
