package com.zipchelin.model.dto.member;

import com.zipchelin.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class MemberResponseDto {

    private String memberId;
    private String memberName;
    private String memberEmail;
    private LocalDateTime joinDate;
    private String memberImg;
    private String memberRole;
    private String provider;

    public Member toEntity() {
        return Member.builder()
                .memberId(memberId)
                .memberName(memberName)
                .memberEmail(memberEmail)
                .joinDate(joinDate)
                .memberImg(memberImg)
                .memberRole(memberRole)
                .provider(provider)
                .build();
    }
}
