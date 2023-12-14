package com.zipchelin.model.service;

import com.zipchelin.domain.Member;
import com.zipchelin.model.dto.member.MemberRequestDto;
import com.zipchelin.repository.MemberRepository;
import com.zipchelin.web.exception.DuplicateException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public String saveMember(MemberRequestDto params) {

        Optional<Member> findById = memberRepository.findById(params.getMemberId());
        if (findById.isPresent()) {
            throw new DuplicateException("이미 존재하는 아이디입니다.");
        }

        params.encodingPassword(passwordEncoder);
        return memberRepository.save(params.toEntity());
    }

//    public MemberResponseDto login(MemberLoginDto params) {
//
//        Member findById = memberRepository.findById(params.getMemberId())
//                .orElseThrow(() -> new UsernameNotFoundException("아이디 또는 비밀번호 오류입니다."));
//
//        String encodedPassword = (findById == null) ? "" : findById.getMemberPwd();
//
//        if ((findById == null) || !passwordEncoder.matches(params.getMemberPwd(), encodedPassword)) {
//            return null;
//        }
//
//        return findById.toDto();
//    }
}
