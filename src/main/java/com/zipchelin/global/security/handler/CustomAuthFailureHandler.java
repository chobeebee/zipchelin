package com.zipchelin.global.security.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Slf4j
@Component
public class CustomAuthFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        if (exception instanceof SessionAuthenticationException) {
            String errmsg = URLEncoder.encode("동일 계정으로 로그인이 되어 있습니다.", StandardCharsets.UTF_8);
            setDefaultFailureUrl("/member/login?error=true&errmsg=" + errmsg);
            super.onAuthenticationFailure(request, response, exception);
            return;
        }

        String errmsg = URLEncoder.encode(exception.getMessage(), StandardCharsets.UTF_8);
        setDefaultFailureUrl("/member/login?error=true&errmsg=" + errmsg);
        super.onAuthenticationFailure(request, response, exception);
    }
}
