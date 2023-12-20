package com.zipchelin.repository.mybatis;

import com.zipchelin.domain.Member;
import com.zipchelin.model.dto.member.EmailDto;
import com.zipchelin.repository.MemberRepository;
import com.zipchelin.repository.mybatis.mappers.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberMapperMybatis implements MemberRepository {

    private final MemberMapper memberMapper;

    @Override
    public String save(Member member) {
        memberMapper.save(member);
        return member.getMemberName();
    }

    @Override
    public void update(Member member) {

    }

    @Override
    public void deleteById(String memberId) {

    }

    @Override
    public Optional<Member> findById(String memberId) {
        return memberMapper.findById(memberId);
    }

    @Override
    public int countById(String memberId) {
        return 0;
    }
}
