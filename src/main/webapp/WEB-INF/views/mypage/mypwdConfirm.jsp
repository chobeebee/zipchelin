<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<meta http-equiv="x-ua-compatible" content="IE=edge">
<meta name="keywords" content="레시피, 혼밥, 요리">
<meta name="description" content="요리에 관한 모든 정보를 한 번에 보세요">

<meta property="og:type" content="website">
<meta property="og:title" content="집슐랭">
<meta property="og:description" content="요리에 관한 모든 정보를 한 번에 보세요">
<meta property="og:image" content="">
<meta property="og:url" content="">

<!-- favicon-->
<link rel="shortcut icon" type="text/css" href="">
<link rel="icon"  type="text/css" href="">

<!-- google icon CDN -->
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<!-- basic CSS -->
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

<!-- page CSS -->
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/mypage.css">

<!-- plugin CSS -->
<link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.css">
<title>집슐랭</title>
</head>
<body>	
	<!--헤더 -->
    <header class="header">
    	<jsp:include page="/WEB-INF/views/main/header.jsp"/>
    </header>
	
	<main class="w1080 clearfix">
        <!--myPage_leftBox-->
        <div class="mypage myPage_leftBox">
        	<jsp:include page="/WEB-INF/views/main/mymenu.jsp"/>
        </div>
        
        <div class="pwdConfirmWrap">
            <form action="${contextPath}/mypage/checkPwd" method="post" id="confirmForm">
                <div class="confirmInfo">
                    <h6>비밀번호 확인</h6>
                    <p>개인 정보를 안전하게 보호하기 위하여</p>
                    <p>비밀번호를 다시 입력해 주세요.</p>
                </div>
                <div class="inputBox">
                    <div class="inputField">
                        <label for="pwdCheck">비밀번호</label>
                        <input type="password" name="pwdCheck" id="pwdCheck" placeholder="비밀번호">
                        <span class="pwdToggle material-symbols-outlined">visibility_off</span>
                    </div>
                    <span class="inputError">비밀번호 일치하지 않습니다. 다시 입력해주세요</span>
                </div>
                <div class="btnGroup lg">
                    <button type="button" class="btnBd" onclick="location.href='${contextPath}/common/index.do'">취소</button>
                    <button type="submit" class="btnBg">확인</button>
                </div>
            </form>
        </div>
    </main>
	
	<!-- 푸터 -->
    <footer id="footer">
    	<jsp:include page="/WEB-INF/views/main/footer.jsp"/>
    </footer>
	
	<!-- js -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="${contextPath}/resource/js/common.js"></script>
    <script src="${contextPath}/resource/js/mypage.js"></script>
</body>
</html>