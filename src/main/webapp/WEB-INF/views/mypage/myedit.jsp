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
    <link rel="stylesheet" type="text/css" href="/front/css/reset.css">
    <link rel="stylesheet" type="text/css" href="/front/css/base.css">
    <link rel="stylesheet" type="text/css" href="/front/css/common.css">

    <!-- page CSS -->
    <link rel="stylesheet" type="text/css" href="/front/css/mypage.css">

    <!-- plugin CSS -->
    <link rel="stylesheet" href="/front/css/swiper-bundle.css">

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
    <!--header-->
    <header class="header">
        <div class="headerContainer">
            <img class="logo" src="/front/images/logo/logo.png" />
            <div class="menu">
                <a href="">레시피</a>
                <a href="">가이드</a>
                <a href="">커뮤니티</a>
                <a href="">공지사항</a>
            </div>
            <div class="right_menu">
                <!-- <img class="icon" src="images/icon2/search.png" /> -->
                <a href="">
                    <span class="material-symbols-outlined">search</span>
                </a>
                <a href="">로그인</a>
                <a href="">회원가입</a>
            </div>
        </div>
    </header>

    <main class="clearfix">
        
        <!--myPage_leftBox-->
        <div class="mypage myPage_leftBox">
            
            <!--마이페이지 레프트박스 (프로필이미지, 아이디, 정보수정버튼)-->
            <div class="myBox_profile">
                <img src="/front/images/icon/profile.jpg" class="myProfile_img" alt="profile">
                <h3 class="userId_text">USER_ID</h3>
                <button class="myPage_edit_btn" onclick="location.href='mypage_edit.html'">정보수정</button>
            </div><!--마이페이지 레프트박스 (프로필이미지, 아이디, 정보수정버튼) 끝-->

            <!--마이페이지 레프트박스 (찜, 내글, 내댓글 갯수 & 바로가기)-->
            <div class="myBox_count">
                
                <div class="myBox_countBox myBox_heart">
                    <span id="myBox_icon" class="material-icons">favorite</span>
                    <p>찜 <a href="/front/html/mypage/myheart.html">10</a></p>
                </div>

                <div class="myBox_countBox myBox_post">
                    <!-- <span id="myBox_icon" class="material-symbols-outlined">density_small</span> -->
                    <span id="myBox_icon" class="material-symbols-outlined">stylus</span>
                    <p>내 글 <a href="/front/html/mypage/mypost.html">10</a></p>
                </div>

                <div class="myBox_countBox myBox_comment">
                    <!-- <span id="myBox_icon" class="material-symbols-outlined">stylus</span> -->
                    <span id="myBox_icon" class="material-symbols-outlined">chat</span>
                    <p>내 댓글 <a href="/front/html/mypage/myreply.html">10</a></p>
                </div>

            </div>

        </div><!--마이페이지 레프트박스 (찜, 내글, 내댓글 갯수 & 바로가기) 끝-->

        <!--정보수정페이지-->
        <section class="edit_info">

            <h3>개인정보 수정</h3>

            <form id="edit_form" action="" method="">

                <!--프로필사진 수정-->
                <div class="profile_section">
                    <img src="/front/images/icon/profile.jpg" alt="profile_img" class="profile_img_edit" onclick="loaction.href='#'">
                    <div class="profile_edit_btn">
                        <input type="button" value="사진선택" class="profile_select_btn" class="profile_editbtn1" onclick="loaction.href='#'">
                        <input type="button" value="기본이미지로변경" class="profile_change_btn" class="profile_editbtn2" onclick="loaction.href='#'">
                    </div>
                </div>

                <!--아이디-->
                <div class="edit_info_id ">
                    <div class="edit_form_item">
                        <label for="id" class="edit_label">아이디</label>
                        <div class="edit_info_input">
                            <input type="text" id="id" class="edit_input edit_input2" name="id" placeholder="USER_ID" disabled>
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
                        <input type="password" id="check_pwd" class="edit_input edit_input2" name="pwd" placeholder="특수문자/영문자/숫자 포함 8~15자">
                        <span class="edit_pwdToggle pwdToggle material-symbols-outlined">visibility_off</span>
                            <p class="edit_warning" id="edit_warning_pwd_check">비밀번호가 일치하지 않습니다.</p>
                    </div>
                </div>
                
                <!--이름 수정-->
                <div class="edit_form_item">
                    <label for="name" class="edit_label">이름</label>
                    <div class="edit_info_input">
                        <input type="text" id="name_input" class="edit_input edit_input2" name="name" placeholder="이름">
                        <p class="edit_warning" id="edit_warning_pwd_check2">이름을 입력해주세요.</p>
                    </div>
                </div>

                <!--이메일 수정-->
                <div class="form_item edit_form_email edit_form_item">
                    <label for="edit_email" class="edit_left_label edit_label">이메일</label>
                    <div class="edit_sign_input_box">
                        <input type="text" id="edit_email_1" class="edit_email_input" placeholder="이메일">
                        <span class="edit_email_span">@</span>
                        <input type="text" id="edit_email_2" class="edit_email_input edit_email_input2" value="gmail.com" disabled>
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
                            <input type="text" id="edit_tel" class="edit_tel_info_input" name="tel" placeholder="전화번호(-)제외">
                            <button type="button" onclick="" class="edit_tel_input_button btnBd edit_confirm_btn">본인인증</button>
                        </div>
                            <p class="edit_warning" id="edit_warning_tel_none">전화번호를 작성해주세요.</p>
                            <p class="edit_warning" id="edit_warning_tel_minus">전화번호에 (-)가 포함되어선 안됩니다.</p>
                            <p class="edit_warning" id="edit_warning_tel">전화번호가 잘못되었습니다.</p>
                    </div>
                </div>

                <!--회원탈퇴-->
                <div class="unregister">
                    <a href="/front/html/user/leave_check.html" class="edit_leave">회원탈퇴</a>
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


    <!-- footer -->
    <footer id="footer">
    <div class="contain">
        <div id="footerMenu">
            <a href="index.html" class="footerLogo">
                <img src="images/logo/logo.png" alt="zipchelin">
            </a>
            <ul class="fmenu">
                <li><a href="#">회사소개</a></li>
                <li><a href="#">개인정보보호정책</a></li>
                <li><a href="#">이용약관</a></li>
                <li><a href="#">공지사항</a></li>
            </ul>
            <ul class="sns">
                <li><a href="https://www.facebook.com/"><img src="images/icon/facebook.png" alt="facebook"></a></li>
                <li><a href="https://www.instagram.com/"><img src="images/icon/instagram.png" alt="instagram"></a></li>
                <li><a href="https://www.youtube.com/"><img src="images/icon/youtube.png" alt="youtube"></a></li>
            </ul>
                <address>
                    <span>회사명 : 주식회사 집슐랭 (서울시 종로구 종로78 (종로2가, 미려빌딩 3,5,6층))</span><br>
                    <span> 전화 : 02-1111-1111</span>
                    <span> 팩스 : 02-2222-2222 </span>
                    <span> E-MAIL : zipcheiln@zipc.co.kr</span>
                </address>
            <p class="copyright">Copyright &copy; 집슐랭, All Rights Reserved.a</p>  
        </div>
    </div>
    </footer>

    <!-- js -->
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="/front/js/common.js"></script>
    <script src="/front/js/mypage.js"></script>
    </body>
</body>
</html>