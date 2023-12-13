package com.zipchelin.model.dto;

import com.zipchelin.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserFindDto {

    private String userId;

    public User toEntity() {
        return User.builder()
                .userId(userId)
                .build();
    }
}
