package com.zipchelin.model.dto.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MemberLoginDto {

    //    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z]).{4,12}", message = "아이디는 4~12자의 영문, 숫자의 조합을 사용하세요.")
    private String memberId;

    //    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{6,12}", message = "비밀번호는 6~12자 영문 대 소문자, 숫자를 사용하세요.")
    private String memberPwd;
}
