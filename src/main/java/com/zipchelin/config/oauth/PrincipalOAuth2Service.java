package com.zipchelin.config.oauth;

import com.zipchelin.config.auth.CustomUserDetails;
import com.zipchelin.domain.Member;
import com.zipchelin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class PrincipalOAuth2Service extends DefaultOAuth2UserService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        OAuth2User oAuth2User = super.loadUser(userRequest);
        String provider = userRequest.getClientRegistration().getClientId();    // google
        String providerId = oAuth2User.getAttribute("sub");               // sub키 숫자

        String memberId = provider + "_" + providerId;
        String memberPwd = "구글비번";
        String memberName = oAuth2User.getAttribute("name");
        String memberEmail = oAuth2User.getAttribute("email");
        String memberPhone = "01012345678";
        String memberRole = "ROLE_USER";

        Member member = memberRepository.findById(memberId).orElse(null);
        if (member == null) {
            member = Member.builder()
                    .memberId(memberId)
                    .memberPwd(memberPwd)
                    .memberName(memberName)
                    .memberEmail(memberEmail)
                    .memberPhone(memberPhone)
                    .provider(provider)
                    .providerId(providerId)
                    .build();
            memberRepository.save(member);
        }

        return new CustomUserDetails(member, oAuth2User.getAttributes());
    }
}
