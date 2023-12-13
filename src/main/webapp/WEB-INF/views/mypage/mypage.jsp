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
    
<!-- plugin CSS -->
<link rel="stylesheet" href="/front/css/swiper-bundle.css">

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
<body>
<body>
	<!--header-->
    <header class="header">
    	<jsp:include page="/WEB-INF/views/main/header.jsp"/>
    </header>

    <!--myPage-->
    <main class="w1080 clearfix">

        <!--myPage_leftBox-->
        <div class="mypage myPage_leftBox">
            <!--마이페이지 레프트박스 (프로필이미지, 아이디, 정보수정버튼)-->
            <div class="myBox_profile">
                <img src="${contextPath}/resource/images/icon/profile.jpg" class="myProfile_img" alt="profile">
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

            </div><!--마이페이지 레프트박스 (찜, 내글, 내댓글 갯수 & 바로가기) 끝-->
        </div>

        <!--myPage_Main-->
        <div class="mypage myPage_main">

            <!--마이페이지 - 찜목록-->
            <div class="myHeart">

                <!--찜아이콘, 더보기버튼-->
                <div class="my_icon_btn">
                    <div class="my_icon">
                        <span id="myPage_heart_icon" class="material-icons">favorite</span>
                        <p>찜</p>
                    </div>
                    <div class="myHeart_btn">
                        <button class="myPage_more_btn" onclick="location.href='myheart.html'">더보기</button>
                    </div>
                </div>

                <!--찜 리스트 전체-->
                <div class="myPage_list">
                    <ul class="myPage_content">
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_heart_img_link imgwrap" href="/front/html/recipe/recipe_detail.html">
                            <!--찜 레시피 사진-->
                                <div class="imgBox vertical">
                                        <img class="myPage_img" id="mypage_imgs" src="images/미라소세지.png" alt="미라소세지">
                                </div>
                                <!--찜 레시피 제목, 부제목-->
                                <div class="myPage_text">
                                        <p class="myPage_heart_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="myPage_heart_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_heart_img_link imgwrap" href="/front/html/recipe/recipe_detail.html">
                            <!--찜 레시피 사진-->
                                <div class="imgBox vertical">
                                        <img class="myPage_img" id="mypage_imgs" src="images/미라소세지.png" alt="미라소세지">
                                </div>
                                <!--찜 레시피 제목, 부제목-->
                                <div class="myPage_text">
                                        <p class="myPage_heart_subtitle">여기는 부제목을 적어주세요.</p>
                                        <h3 class="myPage_heart_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_heart_img_link imgwrap" href="/front/html/recipe/recipe_detail.html">
                               <!--찜 레시피 사진-->
                                   <div class="imgBox vertical">
                                           <img class="myPage_img" id="mypage_imgs" src="images/미라소세지.png" alt="미라소세지">
                                   </div>
                                   <!--찜 레시피 제목, 부제목-->
                                   <div class="myPage_text">
                                           <p class="myPage_heart_subtitle">여기는 부제목을 적어주세요.</p>
                                           <h3 class="myPage_heart_title">여기는 제목을 적어주세요.</h3>
                                   </div>
                                </a>
                           </li>
                           <li>
                            <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                            <a class="myPage_heart_img_link imgwrap" href="/front/html/recipe/recipe_detail.html">
                           <!--찜 레시피 사진-->
                               <div class="imgBox vertical">
                                       <img class="myPage_img" id="mypage_imgs" src="images/미라소세지.png" alt="미라소세지">
                               </div>
                               <!--찜 레시피 제목, 부제목-->
                               <div class="myPage_text">
                                       <p class="myPage_heart_subtitle">여기는 부제목을 적어주세요.</p>
                                       <h3 class="myPage_heart_title">여기는 제목을 적어주세요.</h3>
                               </div>
                            </a>
                       </li>
                        
                    </ul>
                </div><!--찜 리스트 전체 끝-->

            </div> <!--마이페이지 - 찜목록 끝-->

            <!--마이페이지 - 내글목록-->
            <div class="myPost">

                <!--내글아이콘, 더보기버튼-->
                <div class="my_icon_btn">
                    <div class="my_icon">
                        <span id="myBox_icon" class="material-symbols-outlined">stylus</span>
                        <p>내 글</p>
                    </div>
                    <div class="myHeart_btn">
                        <button class="myPage_more_btn" onclick="location.href='/front/html/mypage/mypost.html'">더보기</button>
                    </div>
                </div>

                <!--내글 리스트 전체-->
                <div class="myPage_list ">
                    <ul class="myPage_content">
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="images/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="myPage_post_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="myPage_post_title">여기는 제목을 적어주세요.</h3> 
                                    </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="images/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="myPage_post_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="myPage_post_title">여기는 제목을 적어주세요.</h3> 
                                    </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="images/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="myPage_post_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="myPage_post_title">여기는 제목을 적어주세요.</h3> 
                                    </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="images/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="myPage_post_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="myPage_post_title">여기는 제목을 적어주세요.</h3> 
                                    </div>
                                </a>
                            </li>
                    </ul>
                </div><!--내글 리스트 전체 끝-->

            </div><!--마이페이지 - 내글목록 끝-->
            
            <!--마이페이지 - 내댓글목록-->
            <div class="myComment">

                <!--내댓글아이콘, 더보기버튼-->
                <div class="my_icon_btn">
                    <div class="my_icon">
                        <span id="myBox_icon" class="material-symbols-outlined">chat</span>
                        <p>내 댓글</p>
                    </div>
                    <div class="myComment_btn">
                        <button class="myPage_more_btn" onclick="location.href='/front/html/mypage/myreply.html'">더보기</button>
                    </div>
                </div>

                <!--마이페이지 - 내댓글 리스트 전체-->
                <section class="myrecipe_section">
                    <ul class="allwrite clearfix">
                        <li class="edit_post_container">
                            <a href="/front/html/community/myrecipe_post.html" class="imgwrap">
                                <div class="post-section">
                                    <span class="postdate">2023.10.26 00:00</span>
                                        <h6 class="title">맛있는 음식을 봐라 이것들아 이것이 음식이다 빠라라라라라라라람 어쩌구 저쩌구 이것저것</h6>
                                        <p>내가 만든 요리 중에 제일 맛있는 요리입니다 자랑 좀 합시다...</p>
                                        <ul class="accList">
                                            <li class="accItem">
                                                <span class="icon material-symbols-outlined">visibility</span>268
                                            </li>
                                            <li class="accItem">                        
                                                <span class="icon material-symbols-outlined">comment</span>12
                                            </li>
                                        </ul>
                                </div>
                                <div class="imgBox align">
                                    <img src="/front/images/food/gan.jpg" alt="">
                                </div>
                            </a>
                        </li>
                        <li class="edit_post_container">
                            <a href="/front/html/community/myrecipe_post.html" class="imgwrap">
                                <div class="post-section">
                                    <span class="postdate">2023.10.26 00:00</span>
                                        <h6 class="title">맛있는 음식을 봐라 이것들아 이것이 음식이다 빠라라라라라라라람 어쩌구 저쩌구 이것저것</h6>
                                        <p>내가 만든 요리 중에 제일 맛있는 요리입니다 자랑 좀 합시다...</p>
                                        <ul class="accList">
                                            <li class="accItem">
                                                <span class="icon material-symbols-outlined">visibility</span>268
                                            </li>
                                            <li class="accItem">                        
                                                <span class="icon material-symbols-outlined">comment</span>12
                                            </li>
                                        </ul>
                                </div>
                                <div class="imgBox align">
                                    <img src="/front/images/food/gan.jpg" alt="">
                                </div>
                            </a>
                        </li>
                        <li class="edit_post_container edit_post_container_last">
                            <a href="/front/html/community/myrecipe_post.html" class="imgwrap">
                                <div class="post-section">
                                    <span class="postdate">2023.10.26 00:00</span>
                                        <h6 class="title">맛있는 음식을 봐라 이것들아 이것이 음식이다 빠라라라라라라라람 어쩌구 저쩌구 이것저것</h6>
                                        <p>내가 만든 요리 중에 제일 맛있는 요리입니다 자랑 좀 합시다...</p>
                                        <ul class="accList">
                                            <li class="accItem">
                                                <span class="icon material-symbols-outlined">visibility</span>268
                                            </li>
                                            <li class="accItem">                        
                                                <span class="icon material-symbols-outlined">comment</span>12
                                            </li>
                                        </ul>
                                </div>
                                <div class="imgBox align">
                                    <img src="/front/images/food/gan.jpg" alt="">
                                </div>
                            </a>
                        </li>
                    </ul>
                </section>
                <!--마이페이지 - 내댓글 리스트 전체 끝-->

            </div><!--마이페이지 - 내댓글목록 끝-->

        </div>
    </main>

    <!--footer-->
    <footer id="footer">
    	<jsp:include page="/WEB-INF/views/main/footer.jsp"/>
    </footer> 
    
    <!-- js -->
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="${contextPath}/resource/js/common.js"></script>
    <script src="${contextPath}/resource/js/mypage.js"></script>
    <script src="${contextPath}/resource/js/main.js"></script>
    
</body>
</html>