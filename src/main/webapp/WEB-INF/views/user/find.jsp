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
    <link rel="icon"  type="text/css" href="">

    <!-- google icon CDN -->
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">
    
    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

    <!-- page CSS -->
	<link rel="stylesheet" type="text/css"  href="${contextPath}/resource/css/user.css">
	
    <!-- plugin CSS -->
    <link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.min.css">

    <!--[if IE 9]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie9.min.css" rel="stylesheet">
    <![endif]-->
    <!--[if lte IE 8]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie8.min.css" rel="stylesheet">
    <![endif]-->
 
<title>아이디/비밀번호 찾기</title>
</head>
<body id="find_body">
<%-- 헤더 --%>
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>
    <main id="find_section">
        <h3 id="find_target" class="pageTitle">아이디찾기</h3>
        <ul class="tabGroup">
            <li id="find_box_id"><a href="#" class="tab active" id="find_id_button" data-tab="">아이디찾기</a></li>
            <li id="find_box_pwd"><a href="#" class="tab" id="find_pwd_button" data-tab="">비밀번호찾기</a></li>
        </ul>

        <div class="tabContWrap">
            <div id="tabFindId">
                <form id="find_sign_up_form">
                    <div id="find_input_area">
                        <div class="form_email">
                            <label for="find_email" class="sign_left_label">이메일</label>
                            <div class="sign_input_box">
                                <input type="text" id="find_email_1" class="find_email_input" placeholder="이메일">
                                <span>@</span>
                                <input type="text" id="find_email_2" class="find_email_input" value="gmail.com" disabled>
                                <select id="find_email_input_choose">
                                    <option selected>gmail.com</option>
                                    <option>naver.com</option>
                                    <option>kakao.com</option>
                                    <option>직접입력</option>
                                </select>
                                <input type="hidden" id="find_email" name="email">
                            </div>

                            <p class="find_warning" id="find_warning_email">이메일은 필수입력사항 입니다.</p>
                        </div>
                        <div id="find_name_box">
                            <label for="find_name" class="sign_left_label">이름</label>
                            <div>
                                <input type="text" id="find_name" name="name" placeholder="이름" required>
                            </div>
                            <p class="find_warning" id="find_warning_name">이름은 필수입력사항 입니다.</p>
                        </div>
                        <div>
                            <input value="찾기" type="button" class="btnBg" id="find_do_find" onclick="find_form_submit()"><!--구성 요소중 누락된 요소 있을 시 거절-->
                        </div>
                    </div>
                </form>
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
    <script src="${contextPath}/resource/js/user.js"></script>
</body>
</html>