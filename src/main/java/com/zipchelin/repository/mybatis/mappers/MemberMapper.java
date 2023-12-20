package com.zipchelin.repository.mybatis.mappers;

import com.zipchelin.domain.Member;
import com.zipchelin.model.dto.member.EmailDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    void save(Member member);

    void update(Member member);

    void deleteById(String memberId);

    Optional<Member> findById(String memberId);

    int countById(String memberId);

    void emailAuth(EmailDto emailResponseDto);

    Optional<EmailDto> findAuth(String code);

    void deleteAuth(String code);
}
