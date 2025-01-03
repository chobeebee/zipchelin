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
                <h1 class="h3 mb-4 text-gray-800">커뮤니티 목록</h1>
                <div class="nav nav-tabs" id="nav-tab" role="tablist">
                    <button class="nav-link active" id="nav-home-tab" data-toggle="tab" data-target="#nav-home"
                            type="button"
                            role="tab" aria-controls="nav-home" aria-selected="true">나만의레시피
                    </button>
                    <button class="nav-link" id="nav-profile-tab" data-toggle="tab" data-target="#nav-profile"
                            type="button"
                            role="tab" aria-controls="nav-profile" aria-selected="false">요리상담소
                    </button>
                </div>
                <div class="tab-content" id="nav-tabContent">
                    <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                        <div class="card border-top-0 mb-4">
                            <div class="card-body">
                                <div class="d-flex justify-content-between">
                                    <div class="dropdown d-inline-block">
                                        <button class="btn btn-outline-primary dropdown-toggle" type="button"
                                                id="dropdownMenuMenu" data-toggle="dropdown"
                                                aria-haspopup="true" aria-expanded="false">
                                            카테고리
                                        </button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuMenu">
                                            <button class="dropdown-item" type="button">게시글</button>
                                            <button class="dropdown-item" type="button">댓글</button>
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
                                            <th class="white-space-nowrap align-middle">
                                                <div>
                                                    <input type="checkbox" id="select-all">
                                                </div>
                                            </th>
                                            <th>번호</th>
                                            <th>제목</th>
                                            <th>등록일자</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>1</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>2</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>3</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>4</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                    <nav aria-label="Page navigation">
                                        <ul class="pagination justify-content-center">
                                            <li class="page-item">
                                                <a class="page-link" href="#" aria-label="Previous">
                                                    <span aria-hidden="true">&laquo;</span>
                                                </a>
                                            </li>
                                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                                            <li class="page-item">
                                                <a class="page-link" href="#" aria-label="Next">
                                                    <span aria-hidden="true">&raquo;</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                        <div class="card border-top-0 mb-4">
                            <div class="card-body">
                                <div class="d-flex justify-content-between">
                                    <div class="dropdown d-inline-block">
                                        <button class="btn btn-outline-primary dropdown-toggle" type="button"
                                                id="dropdownMenuMenu" data-toggle="dropdown"
                                                aria-haspopup="true" aria-expanded="false">
                                            카테고리
                                        </button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuMenu">
                                            <button class="dropdown-item" type="button">게시글</button>
                                            <button class="dropdown-item" type="button">댓글</button>
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
                                            <th>등록일자</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>1</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>2</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>3</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox" value="">
                                            </td>
                                            <td>4</td>
                                            <td>
                                                <a href="#">맛있게 먹는법</a>
                                            </td>
                                            <td>2023.01.01</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                    <nav aria-label="Page navigation">
                                        <ul class="pagination justify-content-center">
                                            <li class="page-item">
                                                <a class="page-link" href="#" aria-label="Previous">
                                                    <span aria-hidden="true">&laquo;</span>
                                                </a>
                                            </li>
                                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                                            <li class="page-item">
                                                <a class="page-link" href="#" aria-label="Next">
                                                    <span aria-hidden="true">&raquo;</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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
</body>

</html>