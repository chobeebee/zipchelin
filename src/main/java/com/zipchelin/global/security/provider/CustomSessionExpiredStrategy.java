//package com.zipchelin.global.security.provider;
//
//import org.springframework.security.web.session.SessionInformationExpiredEvent;
//import org.springframework.security.web.session.SessionInformationExpiredStrategy;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class CustomSessionExpiredStrategy implements SessionInformationExpiredStrategy {
//
//    @Override
//    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
//        HttpServletRequest request = event.getRequest();
//        HttpServletResponse response = event.getResponse();
//
//        request.setAttribute("DUPLICATE_LOGIN", true);
//
//        request.getRequestDispatcher("/login").forward(request, response);
//    }
//}
