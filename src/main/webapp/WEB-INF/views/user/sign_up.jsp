<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.css">

    <!--[if IE 9]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie9.min.css" rel="stylesheet">
    <![endif]-->
    <!--[if lte IE 8]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie8.min.css" rel="stylesheet">
    <![endif]-->
    <title>회원가입</title>
</head>
<body id="sign_body">
<%-- 헤더 --%>
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>

    <main>
        <section id="sign_section">
            <h1 id="sign_title" class="pageTitle">회원가입</h1>
            <form:form modelAttribute="params" action="/user/sign-up" id="sign_up_form" method="post">
                <div class="form_item">
                    <label for="sign_id" class="sign_left_label">아이디</label>
                    <div class="sign_input_box">
                        <form:input type="text" path="userId" id="sign_id" class="sign_info_input2" placeholder="숫자/영문자 포함 6~12자" />
                        <button type="button" onclick="" class="sign_input_button btnBd">중복확인</button>
                    </div>
                    <div id="sign_id_warning_box">
                        <form:errors path="userId" cssStyle="color: red" />
                        <p class="sign_warning" id="sign_warning_id">아이디는 필수 입력사항입니다.</p>
                        <p class="sign_warning" id="sign_warning_id_rule">아이디는 숫자/영문자 포함 6~12자 여야 합니다.</p>
                        <p class="sign_warning" id="sign_warning_id_dup">중복되는 아이디 입니다.</p>
                    </div>
                </div>
                <div class="form_item">
                    <label for="sign_pwd" class="sign_left_label">비밀번호</label>
                    <div class="inputField sign_info_input">
                        <form:input type="password" path="userPwd" id="sign_pwd" class="" placeholder="특수문자/영문자/숫자 포함 8~15자" />
                        <form:errors path="userPwd" cssStyle="color: red" />
                        <span class="pwdToggle material-symbols-outlined">visibility_off</span>
                        <p class="sign_warning" id="sign_warning_pwd">비밀번호는 필수 입력사항입니다</p>
                        <p class="sign_warning" id="sign_warning_pwd_rule">비밀번호는 특수문자/영문자/숫자 포함 8~15자 여야 합니다</p>
                    </div>
                    <div class="inputField sign_info_input">
                        <input type="password" name="pwd" id="sign_pwd2" class="" placeholder="비밀번호 확인">
                        <span class="pwdToggle material-symbols-outlined">visibility_off</span>
                        <p class="sign_warning" id="sign_warning_pwd2">비밀번호가 먼저 입력되어야 합니다.</p>
                        <p class="sign_warning" id="sign_warning_pwd2_rule">비밀번호가 일치하지 않습니다.</p>
                    </div>
                </div>
                <div class="form_item">
                    <label for="sign_name" class="sign_left_label">이름</label>
                    <div class="sign_input_box">
                        <form:input type="text" path="userName" id="sign_name" class="sign_info_input" placeholder="이름" />
                    </div>
                    <form:errors path="userName" cssStyle="color: red" />
                    <p class="sign_warning" id="sign_warning_name">이름은 필수입력사항 입니다.</p>
                </div>
                <div class="form_item form_email">
                    <label for="sign_email_1" class="sign_left_label">이메일</label>
                    <div class="sign_input_box">
                        <form:input type="text" path="userEmail" id="sign_email_1" class="sign_email_input" placeholder="이메일" />
<%--                        <span>@</span>--%>
<%--                        <input type="text" id="sign_email_2" class="sign_email_input" value="gmail.com" disabled>--%>
<%--                        <select id="sign_email_input_choose">--%>
<%--                            <option selected>gmail.com</option>--%>
<%--                            <option>naver.com</option>--%>
<%--                            <option>kakao.com</option>--%>
<%--                            <option>직접입력</option>--%>
<%--                        </select>--%>
<%--                        <input type="hidden" id="sign_email" name="email">--%>
                    </div>
                    <form:errors path="userEmail" cssStyle="color: red" />
                    <p class="sign_warning" id="sign_warning_email">이메일은 필수입력사항 입니다.</p>
                </div>
                <div class="form_item">
                    <label for="sign_tel" class="sign_left_label">전화번호</label>
                    <div>
                        <div class="sign_input_box">
                            <form:input type="text" path="userPhone" id="sign_tel" class="sign_info_input2" placeholder="전화번호(-)제외" />
                            <button type="button" onclick="" class="sign_input_button btnBd">본인인증</button>
                        </div>
                        <form:errors path="userPhone" cssStyle="color: red" />
                        <p class="sign_warning" id="sign_warning_tel">전화번호는 필수입력사항입니다.</p>
                        <p class="sign_warning" id="sign_warning_tel_rule">전화번호가 잘못되었습니다.</p>
                        <p class="sign_warning" id="sign_warning_tel_minus">전화번호에 (-)가 포함되어선 안됩니다.</p>
                    </div>
                </div>
                <div class="form_item">
                    <div>
                        <input type="checkbox" id="sign_agree" class="chkBox">
                        <label for="sign_agree"><a href="#" class="sign_agreement">이용약관</a>을 읽고 동의하였습니다.</label>
                    </div>
                    <p class="sign_warning" id="sign_warning_agree">약관동의는 필수 입니다.</p>
                </div>

            <div>
<%--                <button onclick="sign_form_submit()" id="sign_submit_button" class="btnBg">회원가입</button>--%>
                <button type="submit" id="sign_submit_button" class="btnBg">회원가입</button>
            </div>
            </form:form>
        </section>
    </main>

<!-- 푸터 -->
<footer id="footer">
    <jsp:include page="/WEB-INF/views/main/footer.jsp"/>
</footer>

<!-- js -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="${contextPath}/resource/js/common.js"></script>
<%--    <script src="${contextPath}/resource/js/user.js"></script>--%>
</body>
</html>