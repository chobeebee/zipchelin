package com.zipchelin.model.dto;

import com.zipchelin.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Builder
@AllArgsConstructor
public class UserRequestDto {

    @NotBlank
    private String userId;

    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{6,12}", message = "비밀번호는 6~12자 영문 대 소문자, 숫자를 사용하세요.")
    private String userPwd;

    @NotBlank
    private String userName;

    @NotBlank
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String userEmail;

    @NotBlank
    private String userPhone;
    private String userImg;

    public void encodingPassword(BCryptPasswordEncoder passwordEncoder) {
        if (!StringUtils.hasLength(userPwd)) {
            return;
        }
        userPwd = passwordEncoder.encode(userPwd);
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