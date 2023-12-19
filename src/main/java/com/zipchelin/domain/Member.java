package com.zipchelin.domain;

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
    private String memberPhone;
    private LocalDateTime joinDate;
    private String memberImg;
    private String memberRole;

    private String provider;
    private String providerId;

    public MemberResponseDto toDto() {
        return MemberResponseDto.builder()
                .memberId(memberId)
                .memberName(memberName)
                .memberEmail(memberEmail)
                .memberPhone(memberPhone)
                .joinDate(joinDate)
                .memberImg(memberImg)
                .memberRole(memberRole)
                .build();
    }
}
