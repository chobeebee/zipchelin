<%@page import="com.zipchelin.model.dto.member.MemberResponseDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
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
<link rel="icon"  type="text/css" href="">

<!-- google icon CDN -->
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<!-- basic CSS -->
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

<!-- page CSS -->
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/mypage.css">
<title>마이페이지(수정)</title>
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
     <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    
    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

    <!-- page CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/mypage.css">

    <!-- plugin CSS -->
    <link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.css">

    <!--[if IE 9]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie9.min.css" rel="stylesheet">
    <![endif]-->
    <!--[if lte IE 8]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie8.min.css" rel="stylesheet">
    <![endif]-->

    <title>마이페이지_수정</title>
    </head>
</head>
<body>
	<body>
    <header class="header">
    	<jsp:include page="/WEB-INF/views/main/header.jsp"/>
    </header>

    <main class="clearfix">
        
         <!--myPage_leftBox-->
        <div class="mypage myPage_leftBox">
        	<jsp:include page="/WEB-INF/views/main/mymenu.jsp"/>
        </div>

        <!--정보수정페이지-->
        <section class="edit_info">

            <h3>개인정보 수정</h3>

            <form id="edit_form" action="" method="post">

                 <!--프로필사진 수정-->
                <div class="profile_section clearfix">
                    <img src="${contextPath}/resource/icon/profile.jpg" alt="profile_img" class="profile_img_edit" onclick="loaction.href='#'">
                    <div class="profile_edit_btn">
                        <label for="profile_edit" class="profile_btn btnBd">
                            <span>사진선택</span>
                        </label>
                        <input type="file" value="사진선택" id="profile_edit" class="profile_select_btn">
                        <input type="button" value="기본 이미지로 변경" class="profile_change_btn profile_btn btnBdGray" onclick="loaction.href='#'">
                    </div>
                </div>

                <!--아이디-->
                <div class="edit_info_id ">
                    <div class="edit_form_item">
                        <label for="id" class="edit_label">아이디</label>
                        <div class="edit_info_input">
                            <input type="text" id="id" class="edit_input edit_input2" name="id" placeholder="USER_ID" value="${member.memberId}" readonly>
                        </div>
                    </div>
                </div>

                <!--새 비밀번호 설정-->
                <div class="edit_form_item">
                    <label for="edit_pwd" class="edit_label">새 비밀번호</label>
                    <div class="inputField edit_info_input">
                        <input type="password" id="edit_pwd" class="edit_input edit_input2" name="pwd" placeholder="특수문자/영문자/숫자 포함 8~15자">
                        <span class="edit_pwdToggle pwdToggle material-symbols-outlined">visibility_off</span>
                            <p class="edit_warning" id="edit_warning_pwd">비밀번호를 입력해주세요.</p>
                            <p class="edit_warning" id="edit_warning_pwd_rule">비밀번호는 특수문자/영문자/숫자 포함 8~15자 여야 합니다</p>
                    </div>
                </div>

                <!--새 비밀번호 확인-->
                <div class="edit_form_item">
                    <label for="pwd" class="edit_label">새 비밀번호 확인</label>
                    <div class="inputField edit_info_input">
                        <input type="password" id="check_pwd" class="edit_input edit_input2" name="pwdCheck" placeholder="특수문자/영문자/숫자 포함 8~15자">
                        <span class="edit_pwdToggle pwdToggle material-symbols-outlined">visibility_off</span>
                            <p class="edit_warning" id="edit_warning_pwd_check">비밀번호가 일치하지 않습니다.</p>
                    </div>
                </div>
                
                <!--이름 수정-->
                <div class="edit_form_item">
                    <label for="name" class="edit_label">이름</label>
                    <div class="edit_info_input">
                        <input type="text" id="name_input" class="edit_input edit_input2" name="name" value="${member.memberName}" placeholder="이름">
                        <p class="edit_warning" id="edit_warning_pwd_check2">이름을 입력해주세요.</p>
                    </div>
                </div>

                <!--이메일 수정-->
                <div class="form_item edit_form_email edit_form_item">
                    <label for="edit_email" class="edit_left_label edit_label">이메일</label>
                    <div class="edit_sign_input_box">
                        <input type="text" id="edit_email_1" class="edit_email_input" value="${preEmail}" placeholder="이메일">
                        <span class="edit_email_span">@</span>
                        <input type="text" id="edit_email_2" class="edit_email_input edit_email_input2" value="${subEmail}" disabled>
                        <select class="edit_email_select" id="edit_email_input_choose">
                            <option selected>gmail.com</option>
                            <option>naver.com</option>
                            <option>kakao.com</option>
                            <option>직접입력</option>
                        </select>
                        <input type="hidden" id="edit_email" name="email">
                    </div>
                    <p class="edit_warning" id="edit_warning_email">이메일을 입력해주세요.</p>
                    </div>
                </div>

                <!--전화번호 수정-->
                <div class="form_item edit_form_item">
                    <label for="edit_tel" class="edit_label">전화번호</label>
                    <div class="edit_num">
                        <div class="edit_input_box">
                            <input type="text" id="edit_tel" class="edit_tel_info_input" name="tel" placeholder="전화번호(-)제외" value="${member.memberPhone}">
                            <button type="button" onclick="" class="edit_tel_input_button btnBd edit_confirm_btn">본인인증</button>
                        </div>
                            <p class="edit_warning" id="edit_warning_tel_none">전화번호를 작성해주세요.</p>
                            <p class="edit_warning" id="edit_warning_tel_minus">전화번호에 (-)가 포함되어선 안됩니다.</p>
                            <p class="edit_warning" id="edit_warning_tel">전화번호가 잘못되었습니다.</p>
                    </div>
                </div>

                <!--회원탈퇴-->
                <div class="unregister">
                    <a href="/leave-check" class="edit_leave">회원탈퇴</a>
                </div>

            </form>

                <!--취소, 수정완료 버튼-->
                <div class="edit_can_fin_btn">
                    <!--<button type="reset" class="edit_cancle_button" onclick="edit_can_btn">취소</button>
                    <button type="submit"class="edit_fin_button" id="edit_fin_btn" onclick="edit_complete_btn()">수정완료</button>-->
                    
                       <input type="button"  value="취소" class="edit_cancle_button" id="edit_can_btn">
                        <input type="button" value="수정완료" class="edit_fin_button" onclick="edit_complete_btn()">
                </div>

        </section>
        
    </main>


    <!-- 푸터 -->
    <footer id="footer">
    	<jsp:include page="/WEB-INF/views/main/footer.jsp"/>
    </footer> 

    <!-- js -->
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="${contextPath}/resource/js/common.js"></script>
    <script src="${contextPath}/resource/js/mypage.js"></script>
    </body>
</body>
</html>