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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>집슐랭 관리자</title>

    <link href="${contextPath}/resource/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">
    <link href="${contextPath}/resource/admin/css/sb-admin-2.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${contextPath}/resource/admin/css/admin.css">
</head>
<body id="page-top">
<div id="wrapper">
    <div id="sidebar">
        <jsp:include page="/WEB-INF/views/admin/layout/sidebar.jsp"/>
    </div>
    <div id="content-wrapper" class="d-flex flex-column">
        <div id="content">
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow" id="navbar">
                <jsp:include page="/WEB-INF/views/admin/layout/topnav.jsp"/>
            </nav>
            <div class="container-fluid">
                <h1 class="h3 mb-4 text-gray-800">공지사항 목록</h1>
                <div class="card shadow mb-4">
                    <div class="card-body">
                        <form action="notice" onsubmit="delNotice();">
                            <div class="d-flex justify-content-end mb-2">
                                <a href="${contextPath}/admin/addnotice" class="btn btn-secondary mr-2"
                                   aria-current="page">등록</a>
                                <input type="submit" class="btn btn-primary" value="삭제">
                            </div>
                        </form>
                        <div class="table-responsive">
                            <table class="table table-bordered noticeList" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr class="bg-gray-100">
                                    <th class="white-space-nowrap align-middle"><input type="checkbox"
                                                                                       classs="allCheck"></th>
                                    <th>번호</th>
                                    <th>제목</th>
                                    <th>등록일자</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="notice" items="${noticeList}" varStatus="noticeNum">
                                    <tr class="noticeItem">
                                        <td class="align-middle">
                                            <input type="checkbox" class="check" value="${notice.noticeNum}">
                                        </td>
                                        <td class="num">${notice.noticeNum}</td>
                                        <td class="title">
                                            <a href="${contextPath}/admin/updatenotice?noticeNum=<c:out value='${notice.noticeNum}'/>">${notice.noticeTitle}</a>
                                        </td>
                                        <td class="date">${notice.noticeDate}</td>
                                    </tr>
                                </c:forEach>

                                </tbody>
                            </table>
                            <div class="pageInfo_wrap">
                                <div class="pageInfo_area">
                                    <ul class="pageInfo" id="pageInfo">
                                        <c:if test="${pageMaker.prev}">
                                            <li class="pageInfo_btn previous"><a href="${pageMaker.startPage-1}">Previous</a>
                                            </li>
                                        </c:if>
                                        <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                                            <li class="pageInfo_btn ${pageMaker.cri.pageNum == num ? "active":"" }"><a
                                                    href="${num}">${num}</a></li>
                                        </c:forEach>
                                        <c:if test="${pageMaker.next}">
                                            <li class="pageInfo_btn next"><a href="${pageMaker.endPage + 1 }">Next</a>
                                            </li>
                                        </c:if>
                                    </ul>
                                </div>
                            </div>
                            <form action="get" id="moveForm">
                                <input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
                                <input type="hidden" name="amount" value="${pageMaker.cri.amount}">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <form id="moveForm" method="get">
        </form>

        <!-- 푸터 -->
        <footer id="footer">
            <jsp:include page="/WEB-INF/views/admin/layout/footer.jsp"/>
        </footer>
    </div>
</div>

<!-- 로그아웃 창 -->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <jsp:include page="/WEB-INF/views/admin/layout/logout.jsp"/>
</div>

<!-- js -->
<script src="${contextPath}/resource/admin/vendor/jquery/jquery.min.js"></script>
<script src="${contextPath}/resource/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${contextPath}/resource/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
<script src="${contextPath}/resource/admin/js/sb-admin-2.min.js"></script>
<script src="${contextPath}/resource/admin/js/common.js"></script>
<script src="${contextPath}/resource/admin/js/notice.js"></script>
</body>
</html>