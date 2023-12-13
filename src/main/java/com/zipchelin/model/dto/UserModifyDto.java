package com.zipchelin.model.dto;

import com.zipchelin.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UserModifyDto {

    private String userPwd;
    private String userEmail;
    private String userPhone;
    private String userImg;

    public User toEntity() {
        return User.builder()
                .userPwd(userPwd)
                .userEmail(userEmail)
                .userPhone(userPhone)
                .userImg(userImg)
                .build();
    }
}
