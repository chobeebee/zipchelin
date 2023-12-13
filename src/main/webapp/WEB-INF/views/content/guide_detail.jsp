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
<!-- fontawesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
        integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

<!-- basic CSS -->
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

<!-- page CSS -->
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/guide.css">

<!-- plugin CSS -->
<link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.css">
<title>집슐랭</title>
</head>
<body>
	<!--헤더 -->
    <header class="header">
    	<jsp:include page="/WEB-INF/views/main/header.jsp"/>
    </header>
	<!--메인--> 
    <main>
        <div id="main">  
            <!--가이드섹션시작-->
            <section class="guide_detail">
                <div class="guide_first_container">
                    <div class="guide_page_name_box ">
                        <p class="guide_page_name">
                            가이드.ZIP    
                        </p>
                    </div>

                    <div class="guide_title_box">
                        <div class="guide_txt">
                            <h6 class="guide_title">맛있는 연어 손질법</h6>
                            <p class="guide_sub_title">손질하기 까다로운 연어를 손쉽게~</p>
                        </div>
                        <div class="guide_social_box">
                            <div class="view_box common_box">
                                <span class="icon material-symbols-outlined">visibility</span>
                                <p class="view_count counts">234</p>
                            </div>
                            <div class="heart_box common_box ">
                                <span class="material-symbols-outlined">favorite</span>
                                <p class="heart_count counts">56</p>
                            </div>  
                        </div>
                    </div>
                    <div>
                        <img class="guide_img" src="${contextPath}/resource/images/food/sample.jpg" alt="" >
                        <div class="guide_description_box">
                            한번 배워놓으면 영원히 써먹는 연어 손질법<br>
                            절대 실패 없는 연어 손질 법 알려드릴게요! <br> 
                            품질 좋은 연어와 맛있게 법만 안다면 매일매일 행복한 밥상을 차릴 수 있을 거예요.
                        </div>
                    </div>                    
                </div>
                
                <!--반복 컨테이너-->
                <div class="guide_container">
                    <img class="guide_img" src="${contextPath}/resource/images/food/sample2.jpg" alt="" >
                    <div class="guide_description_box">
                        <div class="step">step.1</div> 
                       연어랑 상관없는 사진이에요
                    </div>
                </div>
                <div class="guide_container">
                    <img class="guide_img" src="${contextPath}/resource/images/food/gan.jpg" alt="" >
                    <div class="guide_description_box last">
                        <div class="step">step.2</div> 
                        연어를 패대기쳐서 마무리 해보세요!
                    </div>
                </div>
                <div class="btnGroup">
                    <button class="btn btnBd saveBtn" type="button">
                        <span class="material-symbols-outlined">favorite</span><span class="btnTxt">찜하기</span>
                    </button>
                    <button class="btn btnBdGray" type="button">
                        <span class="icon material-symbols-outlined">share</span>
                    </button>
                </div>
            </section>        
            <!--가이드섹션 끝--> 
            <section class="recommend">
                <div class="detailLast list_container">
                    <h6>추천 레시피</h6>
                    <ul class="list_ul">
                        <li class="list_li">
                            <i class="fa-regular fa-heart"></i> 
                            <a class="recipe_link" href="#">
                                <div class="pic_box">
                                    <div class="imgwrap">
                                        <div class="imgBox">
                                            <img class="recipe_pic" src="${contextPath}/resource/images/food/gan.jpg" alt="#">
                                        </div>
                                    </div>
                                    <div class="textBox">
                                        <p class="sub_title">남이 해줄 때 제일 맛있는</p>
                                        <p class="title">비빔밥</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="list_li">
                            <i class="fa-regular fa-heart"></i> 
                            <a class="recipe_link" href="#">
                                <div class="pic_box">
                                    <div class="imgwrap">
                                        <div class="imgBox">
                                            <img class="recipe_pic" src="${contextPath}/resource/images/food/sample2.jpg" alt="#">
                                        </div>
                                    </div>
                                    <div class="textBox">
                                        <p class="sub_title">늘 먹어도 맛있어요</p>
                                        <p class="title">햄버거</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="list_li">
                            <i class="fa-regular fa-heart"></i> 
                            <a class="recipe_link" href="#">
                                <div class="pic_box">
                                    <div class="imgwrap">
                                        <div class="imgBox">
                                            <img class="recipe_pic" src="${contextPath}/resource/images/food/soshige.jpg" alt="#">
                                        </div>
                                    </div>
                                    <div class="textBox">
                                        <p class="sub_title">먹어도 아무 뒤탈 없는</p>
                                        <p class="title">아주 큰 로또 당첨</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="list_li">
                            <i class="fa-regular fa-heart"></i> 
                            <a class="recipe_link" href="#">
                                <div class="pic_box">
                                    <div class="imgwrap">
                                        <div class="imgBox">
                                            <img class="recipe_pic" src="${contextPath}/resource/images/food/sam.jpg" alt="#">
                                        </div>
                                    </div>
                                    <div class="textBox">
                                        <p class="sub_title">생으로 먹어보세요!!</p>
                                        <p class="title">생생삼겹살</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                    </ul>
                </div>
            </section>        
        
        </div>
    </main>
    <!-- 푸터 -->
    <footer id="footer">
    	<jsp:include page="/WEB-INF/views/main/footer.jsp"/>
    </footer> 
    
    <!-- js -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="${contextPath}/resource/js/common.js"></script>
    <script src="${contextPath}/resource/js/search.js"></script>     
</body>
</html>