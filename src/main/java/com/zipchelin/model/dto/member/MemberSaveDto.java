package com.zipchelin.model.dto.member;

import com.zipchelin.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Builder
@AllArgsConstructor
public class MemberSaveDto {

    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z]).{6,12}", message = "아이디는 6~12자의 영문 소문자, 숫자를 사용해야 합니다.")
    private String memberId;

    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z]).{6,12}", message = "비밀번호는 6~12자의 영문 대 소문자, 숫자를 사용해야 합니다.")
    private String memberPwd;

    private String pwdConfirm;

    @NotBlank(message = "이름은 필수 입력사항 입니다.")
    private String memberName;

    @NotBlank(message = "이메일은 필수 입력사항 입니다.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String memberEmail;

    private String memberImg;

    @AssertTrue(message = "이용약관에 동의하셔야 합니다.")
    private Boolean terms;

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
                .memberImg(memberImg)
                .provider("ZIP")
                .providerId("0")
                .terms(terms)
                .build();
    }
}
