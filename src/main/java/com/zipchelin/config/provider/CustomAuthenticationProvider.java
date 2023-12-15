package com.zipchelin.config.provider;

import com.zipchelin.model.dto.member.MemberContext;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String userId = authentication.getName();                     // 사용자가 입력한 아이디
        String memberPwd = (String) authentication.getCredentials();  // 사용자가 입력한 패스워드

        MemberContext memberContext = (MemberContext) userDetailsService.loadUserByUsername(userId);

        if (!passwordEncoder.matches(memberPwd, memberContext.getMember().getMemberPwd())) {
            throw new BadCredentialsException("잘못된 비밀번호입니다.");
        }

        UsernamePasswordAuthenticationToken authenticationTokentoken =
                new UsernamePasswordAuthenticationToken(memberContext.getMember(), null, memberContext.getAuthorities());

        return authenticationTokentoken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // 유저네임패스워드토큰이 파라미터로 넘어온 클래스와 일치할 때 커스텀인증공급이 실행
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}