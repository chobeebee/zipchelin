package com.zipchelin.web.interceptor;

import com.zipchelin.model.dto.common.MessageDto;
import com.zipchelin.web.ConstField;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        System.out.println("requestURI = " + requestURI);
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute(ConstField.LOGIN_USER) == null) {
            MessageDto message = new MessageDto("로그인이 필요한 페이지입니다.", "/user/login?" + requestURI);
            request.setAttribute("message", message);
            request.getRequestDispatcher(ConstField.ALERT_PAGE).forward(request, response);
            return false;
        }
        return true;
    }
}
