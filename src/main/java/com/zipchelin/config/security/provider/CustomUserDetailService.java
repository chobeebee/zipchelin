package com.zipchelin.config.security.provider;

import com.zipchelin.domain.member.Member;
import com.zipchelin.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String memberId) throws UsernameNotFoundException {

        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new UsernameNotFoundException("가입되지 않은 아이디입니다.")
        );
        return new CustomUserDetails(member);
    }
}
