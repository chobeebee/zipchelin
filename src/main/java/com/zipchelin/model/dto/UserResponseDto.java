package com.zipchelin.model.dto;

import com.zipchelin.domain.user.User;
import lombok.Builder;

import java.time.LocalDateTime;

public class UserResponseDto {

    private String userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private LocalDateTime joinDate;
    private String userImg;

    @Builder
    public UserResponseDto(String userId, String userName, String userEmail, String userPhone, LocalDateTime joinDate, String userImg) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.joinDate = joinDate;
        this.userImg = userImg;
    }

    public User toEntity() {
        return User.builder()
                .userId(userId)
                .userName(userName)
                .userEmail(userEmail)
                .userPhone(userPhone)
                .userPhone(userPhone)
                .joinDate(joinDate)
                .userImg(userImg)
                .build();
    }
}
