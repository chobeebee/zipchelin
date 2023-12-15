package com.zipchelin.domain;

import com.zipchelin.model.dto.member.MemberResponseDto;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
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

    public MemberResponseDto toDto() {
        return MemberResponseDto.builder()
                .memberId(memberId)
                .memberName(memberName)
                .memberEmail(memberEmail)
                .memberPhone(memberPhone)
                .joinDate(joinDate)
                .memberImg(memberImg)
                .build();
    }
}
