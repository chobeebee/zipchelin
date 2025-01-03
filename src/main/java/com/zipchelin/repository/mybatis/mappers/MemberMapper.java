package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.member.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    void save(Member member);

    void update(Member member);

    void deleteById(String memberId);

    Optional<Member> findById(String memberId);

    int countById(String memberId);

    int countByEmail(String memberEmail);

    Optional<Member> findByEmail(String memberEmail);

    void pwdReset(Member member);
}
