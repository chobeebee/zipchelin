package com.zipchelin.model.dto;

import com.zipchelin.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
public class UserLoginDto {

    private String userId;
    private String userPwd;

    public User toEntity() {
        return User.builder()
                .userId(userId)
                .userPwd(userPwd)
                .build();
    }
   
    
}
