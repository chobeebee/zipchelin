package com.zipchelin.model.dto.user;

import com.zipchelin.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class UserResponseDto {

    private String userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private LocalDateTime joinDate;
    private String userImg;

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
