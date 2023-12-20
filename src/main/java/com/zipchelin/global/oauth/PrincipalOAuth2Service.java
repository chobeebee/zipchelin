package com.zipchelin.global.oauth;

import com.zipchelin.global.auth.CustomUserDetails;
import com.zipchelin.domain.Member;
import com.zipchelin.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class PrincipalOAuth2Service extends DefaultOAuth2UserService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        OAuth2User oAuth2User = super.loadUser(userRequest);
        String provider = userRequest.getClientRegistration().getRegistrationId();

        OAuth2UserInfo oAuth2UserInfo = null;
        if (provider.equals("google")) {
            oAuth2UserInfo = new GoogleUserInfo(oAuth2User.getAttributes());
        } else if (provider.equals("naver")) {
            oAuth2UserInfo = new NaverUserInfo((Map) oAuth2User.getAttributes().get("response"));
        }

        Member member = memberRepository.findById(oAuth2UserInfo.getMemberId()).orElse(null);
        if (member == null) {
            member = Member.builder()
                    .memberId(oAuth2UserInfo.getMemberId())
                    .memberPwd("provider")
                    .memberName(oAuth2UserInfo.getName())
                    .memberEmail(oAuth2UserInfo.getEmail())
                    .provider(provider)
                    .providerId(oAuth2UserInfo.getProviderId())
                    .build();
            memberRepository.save(member);
        }

        return new CustomUserDetails(member, oAuth2User.getAttributes());
    }
}
