package com.zipchelin.model.service;

import com.zipchelin.domain.Member;
import com.zipchelin.model.dto.member.MemberContext;
import com.zipchelin.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberDetailsServiceImpl implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {

        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new UsernameNotFoundException("가입되지 않은 아이디입니다.")
        );

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(member.getMemberRole()));

        MemberContext memberContext = new MemberContext(member, roles);

        return memberContext;
    }
}
