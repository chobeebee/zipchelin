package com.zipchelin.config.handler;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        String errorMsg = "아이디 또는 비밀번호 오류입니다.";
        if (exception instanceof BadCredentialsException) {
            errorMsg = "비밀번호 오류입니다.";
        }

        setDefaultFailureUrl("/member/login?error=true");
        super.onAuthenticationFailure(request, response, exception);
    }
}
