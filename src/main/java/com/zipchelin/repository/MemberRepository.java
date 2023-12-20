package com.zipchelin.repository;

import com.zipchelin.domain.Member;

import java.util.Optional;

public interface MemberRepository {

    String save(Member member);

    void update(Member member);

    void deleteById(String memberId);

    Optional<Member> findById(String memberId);

    int countById(String memberId);
}