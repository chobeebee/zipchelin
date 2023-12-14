<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
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
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <link href="${contextPath}/resource/admin/css/sb-admin-2.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${contextPath}/resource/admin/css/admin.css">
</head>
<body id="page-top">
    <div id="wrapper">
        <div id="sidebar">
    		<jsp:include page="/WEB-INF/views/admin/layout/sidebar.jsp" />
    	</div>
        <div id="content-wrapper" class="d-flex flex-column">
            <div id="content">
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow" id="navbar">
            		<jsp:include page="/WEB-INF/views/admin/layout/topnav.jsp" />
            	</nav>
                <div class="container-fluid">
                    <h1 class="h3 mb-4 text-gray-800">레시피 목록</h1>
                    <div class="card shadow mb-4">
                        <div class="card-body">
                            <div class="d-flex justify-content-between">
                                <div class="dropdown d-inline-block">
                                    <button class="btn btn-outline-primary dropdown-toggle" type="button" id="dropdownMenuMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        카테고리
                                    </button>
                                    <div class="dropdown-menu" aria-labelledby="dropdownMenuMenu">
                                        <button class="dropdown-item" type="button">밥요리</button>
                                        <button class="dropdown-item" type="button">국&장</button>
                                        <button class="dropdown-item" type="button">밑반찬</button>
                                        <button class="dropdown-item" type="button">찜&조림</button>
                                        <button class="dropdown-item" type="button">튀김</button>
                                        <button class="dropdown-item" type="button">샐러드</button>
                                        <button class="dropdown-item" type="button">도시락</button>
                                        <button class="dropdown-item" type="button">간식/분식</button>
                                        <button class="dropdown-item" type="button">디저트</button>
                                        <button class="dropdown-item" type="button">기타요리</button>
                                    </div>
                                </div>
                                <div class="d-flex justify-content-end mb-2">
                                    <a href="#" class="btn btn-secondary mr-2" aria-current="page">취소</a>
                                    <a href="#" class="btn btn-primary">삭제</a>
                                </div>
                            </div>             
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr class="bg-gray-100">
                                            <th class="white-space-nowrap  align-middle">
                                                <div>
                                                    <input type="checkbox" id="select-all">
                                                </div>
                                            </th>
                                            <th>번호</th>
                                            <th>제목</th>
                                            <th>작성자</th>
                                            <th>작성일자</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>1</td>
                                            <td><a href="${contextPath}/admin/editrecipe"">제육볶음</a></td>
                                            <td>jangmin</td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>2</td>
                                            <td>제육볶음</td>
                                            <td>jangmin</td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>3</td>
                                            <td>제육볶음</td>
                                            <td>jangmin</td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>4</td>
                                            <td>제육볶음</td>
                                            <td>jangmin</td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>5</td>
                                            <td>제육볶음</td>
                                            <td>jangmin</td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>6</td>
                                            <td>제육볶음</td>
                                            <td>jangmin</td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>7</td>
                                            <td>제육볶음</td>
                                            <td>jangmin</td>
                                            <td>2023.01.01</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>  
                    </div>
                </div>
            </div>
            <!-- 푸터 -->
            <footer id="footer">
            	<jsp:include page="/WEB-INF/views/admin/layout/footer.jsp" />
            </footer>
        </div>
    </div>

    <!-- 로그아웃 창 -->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <jsp:include page="/WEB-INF/views/admin/layout/logout.jsp" />
    </div>

    <!-- js -->
    <script src="${contextPath}/resource/admin/vendor/jquery/jquery.min.js"></script>
    <script src="${contextPath}/resource/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="${contextPath}/resource/admin/vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    <script src="${contextPath}/resource/admin/js/sb-admin-2.min.js"></script>
    <script src="${contextPath}/resource/admin/js/common.js"></script>
</body>
</html>