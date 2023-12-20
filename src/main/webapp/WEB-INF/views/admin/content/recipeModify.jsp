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
                    <h1 class="h3 mb-4 text-gray-800">레시피 수정</h1>
                    <div class="card shadow mb-4 col-lg-8 col-md-12">
                        <div class="card-body">
                            <form method="post" action="updateGuide" class="noticeList">
                               	<div class="form-group">
                                    <label for="recNum" class="col-form-label">글번호</label>
                                    <div>
                                        <input type="text" class="form-control" id="recNum" name="recNum" value="1" disabled>
                                    </div>
                                </div>
                               	<div class="form-group">
                                    <label for="cateNum" class="col-form-label">카테고리</label>
                                    <div>
                                        <select id="cateNum" class="custom-select" name="cateNum">
                                        	<option selected>전체</option>
									    	<option value="1">밥요리</option>
									    	<option value="2">국&amp;장</option>
									    	<option value="3">밑반찬</option>
									    	<option value="4">찜&amp;조림</option>
									    	<option value="4">찜&amp;조림</option>
									    	<option value="5">튀김</option>
									    	<option value="6">샐러드</option>
									    	<option value="7">도시락</option>
									    	<option value="8">간식&amp;분식</option>
									    	<option value="9">디저트</option>
									    	<option value="10">기타요리</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="recTitle" class="col-form-label">제목</label>
                                    <div>
                                        <input type="text" class="form-control" id="recTitle" name="recTitle">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="recSubt" class="col-form-label">부제목</label>
                                    <div>
                                        <input type="text" class="form-control" id="recSubt" name="recSubt">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="recImg0" class="col-form-label">섬네일 이미지</label>
                                    <div class="custom-file mb-2">
											<input type="file" id="recImg0" name="recImg0" class="custom-file-input" aria-describedby="inputGroupFileAddon04">
										    <label class="custom-file-label" for="recImg0">이미지파일</label>
										</div>
                                </div>
                                <div class="form-group">
                                    <label for="recDesc0" class="col-form-label">레시피 설명</label>
                                    <div>
                                        <input type="text" class="form-control" id="recDesc0" name="recDesc0">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="recIngreMain" class="col-form-label">필수 재료</label>
                                    <div>
                                        <input type="text" class="form-control" id="recIngreMain" name="recIngreMain">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="recIngreSub" class="col-form-label">선택 재료</label>
                                    <div>
                                        <input type="text" class="form-control" id="recIngreSub" name="recIngreSub">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="recTool" class="col-form-label">준비도구</label>
                                    <div>
                                        <input type="text" class="form-control" id="recTool" name="recTool">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-form-label">단계별 내용</label>
                                    <div class="guiStep pt-3 pb-3">
                                    	<div class="d-flex justify-content-between align-items-center mb-2">
	                                    	<p class="mb-0">STEP 1</p>
                                    	</div>
                                    	<div class="custom-file mb-2">
											<input type="file" class="custom-file-input" id="recImg1" name="recImg1" aria-describedby="recImg1">
										    <label class="custom-file-label" for="recImg1">이미지파일</label>
										</div>
                                        <textarea rows="3" class="form-control" id="recDesc1" name="recDesc1"></textarea>
                                    </div>
                                    <div class="guiStep pt-3 pb-3">
                                    	<div class="d-flex justify-content-between align-items-center mb-2">
	                                    	<p class="mb-0">STEP 2</p>
                                    	</div>
                                    	<div class="custom-file mb-2">
											<input type="file" class="custom-file-input" id="recImg2" name="recImg2" aria-describedby="recImg2">
										    <label class="custom-file-label" for="recImg1">이미지파일</label>
										</div>
                                        <textarea rows="3" class="form-control" id="recDesc2" name="recDesc2"></textarea>
                                    </div>
                                    <div class="guiStep pt-3 pb-3">
                                    	<div class="d-flex justify-content-between align-items-center mb-2">
	                                    	<p class="mb-0">STEP 3</p>
                                    	</div>
                                    	<div class="custom-file mb-2">
											<input type="file" class="custom-file-input" id="recImg3" name="recImg3" aria-describedby="recImg3">
										    <label class="custom-file-label" for="recImg1">이미지파일</label>
										</div>
                                        <textarea rows="3" class="form-control" id="recDesc3" name="recDesc3"></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                	<label class="col-form-label">분류</label>
                                	<div class="custom-control custom-checkbox">
										<input type="checkbox" class="custom-control-input" id="recTen">
								  		<label class="custom-control-label" for="recTen">10분요리</label>
									</div>
                                </div>
                                
                                <div class="d-flex justify-content-end mb-2">
                                	<button type="button" class="btn btn-outline-dark mr-2" onclick="location.href='${contextPath}/admin/recipe'">취소</a>
                                    <button type="button" class="btn btn-secondary mr-2" onclick="location.href='${contextPath}/admin/recipe'">삭제</button>
                                    <button type="submit" class="cancle_check btn btn-primary">수정</button>
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