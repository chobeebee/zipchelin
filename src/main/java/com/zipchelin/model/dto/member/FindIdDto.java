package com.zipchelin.model.dto.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Builder
@AllArgsConstructor
public class FindIdDto {

    @NotBlank(message = "이메일은 필수 입력사항 입니다.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String findIdEmail;

    @NotBlank(message = "이름은 필수 입력사항 입니다.")
    private String findIdName;

    private String thisForm;
}
