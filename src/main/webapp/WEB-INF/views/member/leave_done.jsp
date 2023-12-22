<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html lang="ko">
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
    <link rel="icon" type="text/css" href="">

    <!-- google icon CDN -->
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">

    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

    <!-- page CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/member.css">

    <!-- plugin CSS -->
    <link rel="stylesheet" href="${contextPath}/front/css/swiper-bundle.css">

    <title>집슐랭</title>
</head>
<body>
<!--헤더 -->
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>

<main class="w1080">
    <h3 class="pageTitle">회원탈퇴</h3>
    <div class="leaveDoneWrap">
        <div class="leaveSec">
            <h6>집슐랭 회원 탈퇴가 완료되었습니다.</h6>
            <p>그동안 집슐랭을 이용해주셔서 감사합니다.<br>더 나은 서비스를 제공할 수 있도록 노력하겠습니다.</p>
        </div>
        <div class="btnGroup lg">
            <button type="button" class="btnBg" onclick="location.href='${contextPath}/member/index.do'">확인</button>
        </div>
    </div>
</main>

<!-- 푸터 -->
<footer id="footer">
    <jsp:include page="/WEB-INF/views/main/footer.jsp"/>
</footer>

<!-- js -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="${contextPath}/resource/js/common.js"></script>
<script src="${contextPath}/resource/js/notice.js"></script>
</body>
</html>