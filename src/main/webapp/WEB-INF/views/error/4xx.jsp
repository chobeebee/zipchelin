<%--
  Created by IntelliJ IDEA.
  User: member
  Date: 2023-12-13
  Time: 오후 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container" style="max-width: 600px">
    <div class="py-5 text-center">
        <h2>4xx 오류 화면</h2>
    </div>
    <div>
        <c:choose>
            <c:when test="${error != null}">
                <p>${error}</p>
            </c:when>
            <c:otherwise>
                <p>4xx 오류 화면 입니다.</p>
            </c:otherwise>
        </c:choose>
    </div>
    <hr class="my-4">
</div>
</body>
</html>
