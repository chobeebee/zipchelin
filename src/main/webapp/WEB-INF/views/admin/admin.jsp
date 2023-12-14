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
                    <h1 class="h3 mb-4 text-gray-800">회원목록</h1>
                    <div class="card shadow mb-4">
                        <div class="card-body">
                            <div class="d-flex justify-content-end mb-2">
                                <a href="#" class="cancle_check btn btn-secondary mr-2" aria-current="page">취소</a>
                                <a href="#" class="btn btn-primary">삭제</a>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-bordered" id="memberTbl" width="100%" cellspacing="0">
                                    <thead>
                                        <tr class="bg-gray-100">
                                            <th class="white-space-nowrap  align-middle">
                                                <div>
                                                    <input type="checkbox" id="select-all">
                                                </div>
                                            </th>
                                            <th>번호</th>
                                            <th>ID</th>
                                            <th>PW</th>
                                            <th>이름</th>
                                            <th>이메일</th>
                                            <th>핸드폰번호</th>
                                            <th>가입일자</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>1</td>
                                            <td><a href="${contextPath}/admin/editmem">hanbiz</a></td>
                                            <td>mollayo!@</td>
                                            <td>이한비</td>
                                            <td>hanbiz@daum.net</td>
                                            <td>010-1234-1234</td>
                                            <td>2023.12.11</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>2</td>
                                            <td><a href="${contextPath}/admin/editmem">winhak</a></td>
                                            <td>wonhee00#</td>
                                            <td>이승학</td>
                                            <td>winhak@daum.net</td>
                                            <td>010-2245-2245</td>
                                            <td>2023.12.01</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>3</td>
                                            <td><a href="${contextPath}/admin/editmem">lovelyouj</a></td>
                                            <td>wonhee00#</td>
                                            <td>장유정</td>
                                            <td>lovelyouj@gmail.com</td>
                                            <td>010-1115-1115</td>
                                            <td>2023.11.26</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>4</td>
                                            <td><a href="${contextPath}/admin/editmem">heehee1</a></td>
                                            <td>wonhee00#</td>
                                            <td>변희원</td>
                                            <td>heehee1@naver.com</td>
                                            <td>010-3757-3757</td>
                                            <td>2023.11.26</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>5</td>
                                            <td><a href="${contextPath}/admin/editmem">badahae</a></td>
                                            <td>bada111!@</td>
                                            <td>정해지</td>
                                            <td>badahae@gmail.com</td>
                                            <td>010-6845-6845</td>
                                            <td>2023.11.02</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>6</td>
                                            <td><a href="${contextPath}/admin/editmem">subinc</a></td>
                                            <td>subinida</td>
                                            <td>조수빈</td>
                                            <td>subinzzang@daum.net</td>
                                            <td>010-4545-4545</td>
                                            <td>2023.10.30</td>
                                        </tr>
                                        <tr>
                                            <td class="align-middle">
                                                <input class="form-check" type="checkbox">
                                            </td>
                                            <td>7</td>
                                            <td><a href="${contextPath}/admin/editmem">minseoda</a></td>
                                            <td>min1234!@</td>
                                            <td>장민서</td>
                                            <td>minseoda@naver.com</td>
                                            <td>010-6856-6856</td>
                                            <td>2023.10.10</td>
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