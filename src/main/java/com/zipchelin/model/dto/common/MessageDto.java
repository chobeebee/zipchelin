package com.zipchelin.model.dto.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MessageDto {

    private String message;
    private String redirectURI;
}