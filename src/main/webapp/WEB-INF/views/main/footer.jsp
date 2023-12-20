<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<div class="contain">
    <div id="footerMenu" class="clearfix">
        <a href="${contextPath}/index.html" class="footerLogo">
            <img src="${contextPath}/resource/images/logo/logo.png" alt="zipchelin">
        </a>
        <ul class="fmenu">
            <li><a href="#">회사소개</a></li>
            <li><a href="#">개인정보보호정책</a></li>
            <li><a href="#">이용약관</a></li>
            <li><a href="${contextPath}/notice.do">공지사항</a></li>
        </ul>
        <ul class="sns">
            <li><a href="https://www.facebook.com/"><img src="${contextPath}/resource/images/icon/facebook.png"
                                                         alt="facebook"></a></li>
            <li><a href="https://www.instagram.com/"><img src="${contextPath}/resource/images/icon/instagram.png"
                                                          alt="instagram"></a></li>
            <li><a href="https://www.youtube.com/"><img src="${contextPath}/resource/images/icon/youtube.png"
                                                        alt="youtube"></a>
            </li>
        </ul>
        <address>
            <span>회사명 : 주식회사 집슐랭 (서울시 종로구 종로78 (종로2가, 미려빌딩 3,5,6층))</span><br>
            <span> 전화 : 02-1111-1111</span>
            <span> 팩스 : 02-2222-2222 </span>
            <span> E-MAIL : zipcheiln@zipc.co.kr</span>
        </address>
        <p class="copyright">Copyright &copy; 집슐랭, All Rights Reserved.a</p>
    </div>
</div>