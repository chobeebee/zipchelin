package com.zipchelin.domain.member;

import com.zipchelin.model.dto.member.MemberResponseDto;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberEmail;
    private LocalDateTime joinDate;
    private String memberImg;
    private String memberRole;

    // OAuth2 로그인 정보
    private String provider;
    private String providerId;

    // 약관 동의 여부
    private Boolean terms;

    public MemberResponseDto toDto() {
        return MemberResponseDto.builder()
                .memberId(memberId)
                .memberName(memberName)
                .memberEmail(memberEmail)
                .joinDate(joinDate)
                .memberImg(memberImg)
                .memberRole(memberRole)
                .build();
    }
}
