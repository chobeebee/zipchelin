package com.zipchelin.domain;

import com.zipchelin.model.dto.user.UserResponseDto;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    private String userId;
    private String userPwd;
    private String userName;
    private String userEmail;
    private String userPhone;
    private LocalDateTime joinDate;
    private String userImg;

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
