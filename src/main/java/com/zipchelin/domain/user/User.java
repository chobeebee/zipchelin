package com.zipchelin.domain.user;

import com.zipchelin.model.dto.UserResponseDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    private String userId;
    private String userPwd;
    private String userName;
    private String userEmail;
    private String userPhone;
    private LocalDateTime joinDate;
    private String userImg;

    @Builder
    public User(String userId, String userPwd, String userName, String userEmail, String userPhone, LocalDateTime joinDate, String userImg) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.joinDate = joinDate;
        this.userImg = userImg;
    }

    public UserResponseDto toDto() {
        return UserResponseDto.builder()
                .userId(userId)
                .userName(userName)
                .userEmail(userEmail)
                .userPhone(userPhone)
                .joinDate(joinDate)
                .userImg(userImg)
                .build();
    }
}
