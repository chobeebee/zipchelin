package com.zipchelin.config.security.provider;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String memberId = authentication.getName();
        String memberPwd = (String) authentication.getCredentials();

        CustomUserDetails userDetails = (CustomUserDetails) userDetailsService.loadUserByUsername(memberId);

        if (!passwordEncoder.matches(memberPwd, userDetails.getMember().getMemberPwd())) {
            throw new BadCredentialsException("잘못된 비밀번호입니다.");
        }

        UsernamePasswordAuthenticationToken authenticationTokentoken =
                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

        return authenticationTokentoken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
         return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }

    /**
     *  http 요청 시 AutenticationFilter가 미인증 UsernamePasswordAuthenticationToken 객체 생성
     *  AuthenticationManager에서 Class<?> authentication 를 처리할 수 있는 구현체 탐색

     *  호출한 CustomUserDetails 객체에 인증 작업(isAuthenticated = true)을 완료 후 AuthenticationManager에 반환
     *  AuthenticationManager -> AutenticationFilter -> Autentication 객체를 SecurityContext 로 감싸서 Holder에 저장
     *  SecurityContextHolder에 보관된 Autentication로 시큐리티가 인가 프로세스 진행
     */

    public boolean reauthenticate(String userId, String currentPassword) {

        CustomUserDetails userDetails =
                (CustomUserDetails) userDetailsService.loadUserByUsername(userId);

        boolean passwordMatches =
                passwordEncoder.matches(currentPassword, userDetails.getMember().getMemberPwd());

        if (passwordMatches) {
            userDetails.addAuthority("RE_AUTH");
            log.info("재인증 권한 부여 = {}", userDetails);
        }
        return passwordMatches;
    }
}