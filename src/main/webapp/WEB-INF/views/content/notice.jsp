<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

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
    <link rel="icon" type="text/css" href="">

    <!-- google icon CDN -->
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">

    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

    <!-- page CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/notice.css">

    <title>집슐랭</title>
</head>
<body>
<!--헤더 -->
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>

<main>
    <h3 class="pageTitle">공지사항</h3>
    <ul class="noticeList">
        <c:choose>
            <c:when test="${empty noticeList}">
                <li class="noticeItem noList">
                    <h6>공지사항이 없습니다</h6>
                </li>
            </c:when>
            <c:when test="${!empty noticeList}">
                <c:forEach var="notice" items="${noticeList}" varStatus="noticeNum">
                    <li class="noticeItem">
                        <div class="titleBox">
                            <span class="num">${notice.noticeNum}</span>
                            <h6 class="title">${notice.noticeTitle}</h6>
                            <span class="date"><fmt:formatDate pattern="yyyy.MM.dd"
                                                               value="${notice.noticeDate}"/></span>
                            <span class="icon material-symbols-outlined">keyboard_arrow_down</span>
                        </div>
                        <div class="contentBox">
                            <p>
                                    ${notice.noticeCont}
                            </p>
                        </div>
                    </li>
                </c:forEach>
            </c:when>
        </c:choose>
    </ul>
    <div class="pageInfo_wrap paging">
        <div class="pageInfo_area">
            <ul class="pageInfo" id="pageInfo">
                <c:if test="${pageMaker.prev}">
                    <li class="pageInfo_btn previous arrow prev disabled"><a href="${pageMaker.startPage-1}"><span
                            class="material-symbols-outlined">navigate_before</span></a></li>
                </c:if>
                <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <li class="pageInfo_btn ${pageMaker.cri.pageNum == num ? "active":"" }"><a href="${num}">${num}</a>
                    </li>
                </c:forEach>
                <c:if test="${pageMaker.next}">
                    <li class="pageInfo_btn next arrow next"><a href="${pageMaker.endPage + 1 }"><span
                            class="material-symbols-outlined">navigate_next</span></a></li>
                </c:if>
            </ul>
        </div>
    </div>
    <form action="get" id="moveForm">
        <input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
        <input type="hidden" name="amount" value="${pageMaker.cri.amount}">
    </form>
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