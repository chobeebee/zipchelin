package com.zipchelin.model.dto.member;

import com.zipchelin.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Builder
@AllArgsConstructor
public class MemberRequestDto {

    @NotBlank
    private String memberId;

    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{6,12}", message = "비밀번호는 6~12자 영문 대 소문자, 숫자를 사용하세요.")
    private String memberPwd;

    @NotBlank
    private String memberName;

    @NotBlank
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String memberEmail;

    @NotBlank
    private String memberPhone;
    private String memberImg;

    public void encodingPassword(PasswordEncoder passwordEncoder) {
        if (!StringUtils.hasLength(memberPwd)) {
            return;
        }
        memberPwd = passwordEncoder.encode(memberPwd);
    }

    public Member toEntity() {
        return Member.builder()
                .memberId(memberId)
                .memberPwd(memberPwd)
                .memberName(memberName)
                .memberEmail(memberEmail)
                .memberPhone(memberPhone)
                .memberImg(memberImg)
                .build();
    }
}