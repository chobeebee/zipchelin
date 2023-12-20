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
<link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.css">

<!-- fontawesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
crossorigin="anonymous" referrerpolicy="no-referrer" />

<title>집슐랭</title>
</head>
<body>
<body>
    <header class="header">
		<jsp:include page="/WEB-INF/views/main/header.jsp"/>
	</header>

    <!--myPage-->
    <main class="w1080 clearfix">

        <!--myPage_leftBox-->
        <div class="mypage myPage_leftBox">
        	<jsp:include page="/WEB-INF/views/main/mymenu.jsp"/>
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
                    <div class="more_btn_box">
                        <button class="myPage_more_btn" onclick="location.href='/mypage/myheart'">더보기</button>
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
                                        <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/미라소세지.png" alt="미라소세지">
                                </div>
                                <!--찜 레시피 제목, 부제목-->
                                <div class="myPage_text">
                                        <p class="mypage_list_subtitle">여기는 부제목을 적어주세요. 여기는 부제목을 적어주세요.</p>
                                        <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_heart_img_link imgwrap" href="/front/html/recipe/recipe_detail.html">
                            <!--찜 레시피 사진-->
                                <div class="imgBox vertical">
                                        <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/미라소세지.png" alt="미라소세지">
                                </div>
                                <!--찜 레시피 제목, 부제목-->
                                <div class="myPage_text">
                                        <p class="mypage_list_subtitle">여기는 부제목을 적어주세요. 여기는 부제목을 적어주세요.</p>
                                        <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3>
                                </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_heart_img_link imgwrap" href="/front/html/recipe/recipe_detail.html">
                               <!--찜 레시피 사진-->
                                   <div class="imgBox vertical">
                                           <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/미라소세지.png" alt="미라소세지">
                                   </div>
                                   <!--찜 레시피 제목, 부제목-->
                                	<div class="myPage_text">
                                        <p class="mypage_list_subtitle">여기는 부제목을 적어주세요. 여기는 부제목을 적어주세요.</p>
                                        <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3>
                                	</div>
                                </a>
                           </li>
                           <li>
                            <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                            <a class="myPage_heart_img_link imgwrap" href="/front/html/recipe/recipe_detail.html">
                           <!--찜 레시피 사진-->
                               <div class="imgBox vertical">
                                       <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/미라소세지.png" alt="미라소세지">
                               </div>
                               <!--찜 레시피 제목, 부제목-->
                                <div class="myPage_text">
                                        <p class="mypage_list_subtitle">여기는 부제목을 적어주세요. 여기는 부제목을 적어주세요.</p>
                                        <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3>
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
                    <div class="more_btn_box">
                        <button class="myPage_more_btn btnBgGray" onclick="location.href='/mypage/mypost'">더보기</button>
                    </div>
                </div>

                <!--내글 리스트 전체-->
                <div class="myPage_list ">
                    <ul class="myPage_content">
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="mypage_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3> 
                                    </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="mypage_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3> 
                                    </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="mypage_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3> 
                                    </div>
                                </a>
                            </li>
                            <li>
                                <i class="fa-regular fa-heart" id="heart_btn_icon"></i>
                                <a class="myPage_post_img_link imgwrap" href="/front/html/community/myrecipe_post.html">
                                    <div class="imgBox vertical">
                                            <img class="myPage_img" id="mypage_imgs" src="${contextPath}/resource/images/food/단호박스콘.png" alt="단호박스콘">
                                    </div>
                                    <div class="myPage_text">
                                            <p class="mypage_list_subtitle">여기는 부제목을 적어주세요.</p>
                                            <h3 class="mypage_list_title">여기는 제목을 적어주세요.</h3> 
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
                    <div class="more_btn_box">
                        <button class="myPage_more_btn btnBgGray" onclick="location.href='/mypage/myreply'">더보기</button>
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
                                    <p>내가 만든 요리 중에 제일 맛있는 요리입니다 자랑 좀 합시다...내가 만든 요리 중에 제일 맛있는 요리입니다 자랑 좀 합시다...</p>
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
                                    <img src="${contextPath}/resource/images/food/gan.jpg" alt="">
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
                                    <img src="${contextPath}/resource/images/food/gan.jpg" alt="">
                                </div>
                            </a>
                        </li>
                        <li class="edit_post_container edit_post_container_last">
                            <a href="/front/html/community/myrecipe_post.html"  class="imgwrap">
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
                                    <img src="${contextPath}/resource/images/food/gan.jpg" alt="">
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