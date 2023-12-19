package com.zipchelin.repository;

import com.zipchelin.domain.Member;
import com.zipchelin.model.dto.member.EmailDto;

import java.util.Optional;

public interface MemberRepository {

    String save(Member member);

    void update(Member member);

    void deleteById(String memberId);

    Optional<Member> findById(String memberId);

    int countById(String memberId);

    void emailAuth(EmailDto params);

    Optional<EmailDto> findAuth(String code);

    void deleteAuth(String code);
}