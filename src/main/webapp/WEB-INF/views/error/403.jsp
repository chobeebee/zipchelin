<%--
  Created by IntelliJ IDEA.
  User: member
  Date: 2023-12-13
  Time: 오후 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">

    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

    <!-- page CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/error.css">

    <title>Error - 403</title>
</head>
<body>
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>
<div class="error-area">
    <div class="d-table">
        <div class="d-table-cell">
            <div class="container">
                <div class="error-content">
                    <h1>403</h1>
                    <h2>접근 권한이 없습니다.</h2>
                    <c:choose>
                        <c:when test="${error != null}">
                            <p>${error}</p>
                        </c:when>
                        <c:otherwise>
                            <p>DEFAULT MESSAGE</p>
                        </c:otherwise>
                    </c:choose>
                    <div class="button">
                        <a href="/" class="btn">메인화면으로</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
