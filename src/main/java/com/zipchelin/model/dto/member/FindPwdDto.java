package com.zipchelin.model.dto.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Builder
@AllArgsConstructor
public class FindPwdDto {

    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z]).{6,12}", message = "아이디는 6~12자의 영문 소문자/숫자를 포함해야 합니다.")
    private String findPwdId;

    @NotBlank(message = "이메일은 필수 입력사항 입니다.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String findPwdEmail;

    @NotBlank(message = "이름은 필수 입력사항 입니다.")
    private String findPwdName;

    private String thisForm;
}
