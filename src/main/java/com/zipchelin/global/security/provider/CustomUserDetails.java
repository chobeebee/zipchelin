package com.zipchelin.global.security.provider;

import com.zipchelin.domain.member.Member;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

@Data
public class CustomUserDetails implements UserDetails, OAuth2User {

    private Member member;
    private Map<String, Object> attributes;
    private Collection<SimpleGrantedAuthority> dynamicAuthorities;

    // 일반 로그인
    public CustomUserDetails(Member member) {
        this.member = member;
    }

    // OAuth2 로그인
    public CustomUserDetails(Member member, Map<String, Object> attributes) {
        this.member = member;
        this.attributes = attributes;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public <A> A getAttribute(String name) {
        return OAuth2User.super.getAttribute(name);
    }

    @Override
    public Map<String, Object> getAttributes() {
        return null;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collect = new ArrayList<>();
        collect.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return member.getMemberRole();
            }
        });
        return collect;
    }

    public void addAuthority(String authority) {
        if (dynamicAuthorities == null) {
            dynamicAuthorities = new ArrayList<>();
        }
        dynamicAuthorities.add(new SimpleGrantedAuthority(authority));
    }

    @Override
    public String getPassword() {
        return member.getMemberPwd();
    }

    @Override
    public String getUsername() {
        return member.getMemberName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CustomUserDetails) {
            return this.getUsername().equals(((CustomUserDetails) obj).getUsername());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getUsername().hashCode();
    }
}
