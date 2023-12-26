package com.zipchelin.domain.member;

import lombok.Getter;

@Getter
public enum Role {

    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER"),
    REAUTH("RE_AUTH");

    private final String auth;

    Role(String auth) {
        this.auth = auth;
    }
}
