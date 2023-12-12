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
<title>마이페이지(찜목록)</title>
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
    <link rel="stylesheet" href="/front/css/swiper-bundle.min.css">

     <!-- fontawesome -->
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
     integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
     crossorigin="anonymous" referrerpolicy="no-referrer" />


    <!--[if IE 9]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie9.min.css" rel="stylesheet">
    <![endif]-->
    <!--[if lte IE 8]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie8.min.css" rel="stylesheet">
    <![endif]-->

    <title>집슐랭</title>
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

    <main class="w1080 clearfix">

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
                    <p>찜 <a href="#">10</a></p>
                </div>

                <div class="myBox_countBox myBox_post">
                    <!-- <span id="myBox_icon" class="material-symbols-outlined">density_small</span> -->
                    <span id="myBox_icon" class="material-symbols-outlined">stylus</span>
                    <p>내 글 <a href="#">10</a></p>
                </div>

                <div class="myBox_countBox myBox_comment">
                    <!-- <span id="myBox_icon" class="material-symbols-outlined">stylus</span> -->
                    <span id="myBox_icon" class="material-symbols-outlined">chat</span>
                    <p>내 댓글 <a href="#">10</a></p>
                </div>

            </div><!--마이페이지 레프트박스 (찜, 내글, 내댓글 갯수 & 바로가기) 끝-->

        </div>

        <!--myheart_main-->
        <div class="myHeart_main myPage_main">
            
            <!--찜페이지-탭-->
            <div class="componentWrap myPage_componentWrap">
                <ul class="tabGroup">
                    <li><a href="#" class="tab active" data-tab="tabAll">레시피</a></li>
                    <li><a href="#" class="tab" data-tab="tab01">가이드</a></li>
                </ul>
            </div>
            
            <div class="myHeart_list">
                <div class="myHeart_heart">
                    <!--찜페이지-찜리스트-->
                    <div class="heart_list">
                        <ul class="heart_list_zone">
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                            <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--찜 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link imgwrap" href="#">
                                    <div class="imgBox vertical" id="heart_imgBox">
                                            <img class="heart_list_img" src="/front/images/food/돼지고기짬뽕국.png" alt="돼지고기짬뽕국">
                                    </div>
                                    <!--찜 레시피 제목, 부제목-->
                                    <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                    </div>
                                </a>
                            </li>
                        </ul>
                        <div class="paging">
                            <ul>
                                <!--찜페이지-페이징-->
                                <!--li에 .disabled가 있으면 화살표에 클릭방지 생김-->
                                <li class="arrow prev disabled"><button disabled><span class="material-symbols-outlined">navigate_before</span></button></li>
                                <li class="active"><a href="javascript:">1</a></li>
                                <li><a href="javascript:">2</a></li>
                                <li><a href="javascript:">3</a></li>
                                <li><a href="javascript:">4</a></li>
                                <li><a href="javascript:">5</a></li>
                                <li class="arrow next"><button><span class="material-symbols-outlined">navigate_next</span></button></li>
                            </ul>
                        </div>
                </div>
                    </div>

                
                <div class="myHeart_giude tabCont">
                    <!--가이드페이지-찜리스트-->
                    <div class="heart_list">
                        <ul class="heart_list_zone">
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li class="heart_list_contents">
                                <!--가이드 레시피 사진-->
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="heart_list_link" href="#">
                                <div>
                                        <img class="heart_list_img" src="/front/images/food/단호박스콘.png" alt="돼지고기짬뽕국">
                                </div>
                                <!--가이드 레시피 제목, 부제목-->
                                <div class="heart_list_text">
                                        <p class="heart_list_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="heart_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                        </ul>
                    </div>

                    <!--가이드페이지-페이징-->
                    <div class="paging">
                        <ul class="myheart_paging">
                            <!--li에 .disabled가 있으면 화살표에 클릭방지 생김-->
                            <li class="arrow prev disabled"><button disabled><span class="material-symbols-outlined">navigate_before</span></button></li>
                            <li class="active"><a href="javascript:">1</a></li>
                            <li><a href="javascript:">2</a></li>
                            <li><a href="javascript:">3</a></li>
                            <li><a href="javascript:">4</a></li>
                            <li><a href="javascript:">5</a></li>
                            <li class="arrow next"><button><span class="material-symbols-outlined">navigate_next</span></button></li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>

    </main>

    <!--footer-->
    <footer class="edit_footer">
        <div class="contain">
            <div id="footerMenu">
                <a href="/front/index.html" class="footerLogo">
                    <img src="/front/images/logo/logo.png" alt="zipchelin">
                </a>
                    <ul class="fmenu">
                        <li><a href="#">회사소개</a></li>
                        <li><a href="#">개인정보보호정책</a></li>
                        <li><a href="#">이용약관</a></li>
                        <li><a href="#">공지사항</a></li>
                    </ul>
                    <ul class="sns">
                        <li><a href="#"><img src="/front/images/icon/facebook.png" alt="facebook"></a></li>
                        <li><a href="#"><img src="/front/images/icon/instagram.png" alt="instagram"></a></li>
                        <li><a href="#"><img src="/front/images/icon/youtube.png" alt="youtube"></a></li>
                    </ul>  
            </div>
                <address>
                    <span>회사명 : 주식회사 집슐랭 (서울시 종로구 종로78 (종로2가, 미려빌딩 3,5,6층))</span><br>
                    <span> 전화 : 02-1111-1111</span>
                    <span> 팩스 : 02-2222-2222 </span>
                    <span> E-MAIL : zipcheiln@zipc.co.kr</span>
                </address>
                <p class="copyright">Copyright &copy; 집슐랭, All Rights Reserved.</p>  
            </div>
        </div>
    </footer>

    <!-- js -->
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="/front/js/common.js"></script>
    <script src="/front/js/mypage.js"></script>
    <script src="/front/js/main.js"></script>
    </body>
</body>
</html>