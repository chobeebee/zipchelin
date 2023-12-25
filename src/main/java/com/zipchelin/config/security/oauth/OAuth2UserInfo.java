package com.zipchelin.config.security.oauth;

public interface OAuth2UserInfo {

    String getProvider();

    String getProviderId();

    String getEmail();

    String getName();

    String getMemberId();
}
