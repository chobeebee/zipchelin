package com.zipchelin.model;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class EmailApplicationEvent extends ApplicationEvent {

    private String email;
    private String code;

    public EmailApplicationEvent(Object source, String email, String code) {
        super(source);
        this.email = email;
        this.code = code;
    }
}
