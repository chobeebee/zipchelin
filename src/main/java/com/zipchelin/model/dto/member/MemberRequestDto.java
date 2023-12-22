package com.zipchelin.model.dto.member;

import com.zipchelin.domain.member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MemberRequestDto {

    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberEmail;
    private String memberImg;

    public Member toEntity() {
        return Member.builder()
                .memberId(memberId)
                .memberPwd(memberPwd)
                .memberName(memberName)
                .memberEmail(memberEmail)
                .memberImg(memberImg)
                .build();
    }
}