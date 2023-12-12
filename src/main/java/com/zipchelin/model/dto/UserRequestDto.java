package com.zipchelin.model.dto;

import com.zipchelin.domain.user.User;
import lombok.Builder;

public class UserRequestDto {

    private String userId;
    private String userPwd;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userImg;

    @Builder
    public UserRequestDto(String userId, String userPwd, String userName, String userEmail, String userPhone, String userImg) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userImg = userImg;
    }

    public User toEntity() {
        return User.builder()
                .userId(userId)
                .userPwd(userPwd)
                .userName(userName)
                .userEmail(userEmail)
                .userPhone(userPhone)
                .userImg(userImg)
                .build();
    }
}
