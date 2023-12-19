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
                    <h1 class="h3 mb-4 text-gray-800">가이드 등록</h1>
                    <div class="card shadow mb-4 col-lg-8 col-md-12">
                        <div class="card-body">
                            <form method="post" action="updateGuide" class="noticeList">
                                <div class="form-group">
                                    <label for="guiTitle" class="col-form-label">제목</label>
                                    <div>
                                        <input type="text" class="form-control" id="guiTitle" name="guiTitle">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="guiSubt" class="col-form-label">부제목</label>
                                    <div>
                                        <input type="text" class="form-control" id="guiSubt" name="guiSubt">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="guiThumb" class="col-form-label">섬네일 이미지</label>
                                    <div>
                                    	<input type="file" class="btn btn-outline-secondary mb-2" id="guiThumb" name="guiThumb" value="이미지 올리기">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="guiDesc" class="col-form-label">가이드 설명</label>
                                    <div>
                                        <input type="text" class="form-control" id="guiDesc" name="guiDesc">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="guiImgFileName" class="col-form-label">단계별 내용</label>
                                    <div>
                                    	<div class="custom-file">
											<input type="file" class="custom-file-input mb-2" id="inputGroupFile04" aria-describedby="inputGroupFileAddon04">
										    <label class="custom-file-label" for="inputGroupFile04">Choose file</label>
										</div>
                                    	<input type="file" class="btn btn-outline-secondary mb-2" id="guiImgFileName" name="guiImgFileName" value="이미지 올리기">
                                        <textarea rows="5" class="form-control" id="guiText" name="guiText"></textarea>
                                    </div>
                                </div>
                                
                                <div class="d-flex justify-content-end mb-2">
                                    <button type="submit" class="cancle_check btn btn-secondary mr-2">수정</button>
                                    <button type="reset" class="btn btn-primary" onClick="location.href='${contextPath}/admin/notice'">취소</button>
                                </div>
                            </form>
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