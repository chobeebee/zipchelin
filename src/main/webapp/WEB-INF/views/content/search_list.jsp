<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" 
	isELIgnored="false"
	%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
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
<link rel="icon" type="text/css" href="">

<!-- google icon CDN -->
<link
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<!-- basic CSS -->
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

<!-- page CSS -->
<link rel="stylesheet" href="${contextPath}/resource/css/guide.css">
<link rel="stylesheet" href="${contextPath}/resource/css/search.css">

<!-- plugin CSS -->
<link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.min.css">

<!-- fontawesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css"
	integrity="sha512-10/jx2EXwxxWqCLX/hHth/vu2KY3jCF70dCQB8TSgNjbCVAC/8vai53GfMDrO2Emgwccf2pJqxct9ehpzG+MTw=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<!--[if IE 9]>
<link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie9.min.css" rel="stylesheet">
<![endif]-->
<!--[if lte IE 8]>
<link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie8.min.css" rel="stylesheet">
<![endif]-->
<title>검색 메인 페이지</title>

</head>
<body>
	<!--헤더-->
	<header class="header"></header>
	<!-- 검색 창 -->
	<main>
		<div class="searchSection">
			<div class="searchBox">
				<input class="searchText" type="text" title="검색어 입력 창"
					placeholder="검색어를 입력해주세요" maxlength="50"> <span
					class="searchButton material-symbols-outlined">search</span>
			</div>
			<div class="recomBox">
				<ul class="clearfix">
					<li class="recomList">
						<button class="recomBut" type="button">제철 과일</button>
					</li>
					<li class="recomList">
						<button class="recomBut" type="button">생선 구이</button>
					</li>
					<li class="recomList">
						<button class="recomBut" type="button">인성손질법</button>
					</li>
					<li class="recomList">
						<button class="recomBut" type="button">감자손질법</button>
					</li>
					<li class="recomList">
						<button class="recomBut" type="button">디저트</button>
					</li>
				</ul>
			</div>
		</div>
		<!--서칭 페이지 메인-->
		<div id="main" class="schListMain">
			<!--탭 그룹-->
			<div>
				<ul class="tabGroup">
					<li class="tab active" data-tab="tab1">레시피</li>
					<li class="tab" data-tab="tab2">가이드</li>
					<li class="tab" data-tab="tab3">나만의 레시피</li>
					<li class="tab" data-tab="tab4">요리 상담소</li>
				</ul>
			</div>

			<!--레시피 서칭 결과-->
			<div id="tab1" class="tabContainer on">
				<div class="list_container">
					<ul class="list_ul">
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sul.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">남이 해줄 때 제일 맛있는</p>
										<p class="title">비빔밥</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sample2.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">늘 먹어도 맛있어요</p>
										<p class="title">햄버거</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/soshige.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">먹어도 아무 뒤탈 없는</p>
										<p class="title">아주 큰 로또 당첨</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/gan.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">생으로 먹어보세요!!</p>
										<p class="title">생생삼겹살</p>
									</div>
								</div>
						</a></li>
						<!--4개-->
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sul.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">남이 해줄 때 제일 맛있는</p>
										<p class="title">비빔밥</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sample2.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">늘 먹어도 맛있어요</p>
										<p class="title">햄버거</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/soshige.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">먹어도 아무 뒤탈 없는</p>
										<p class="title">아주 큰 로또 당첨</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/gan.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">생으로 먹어보세요!!</p>
										<p class="title">생생삼겹살</p>
									</div>
								</div>
						</a></li>
						<!--4개-->
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sul.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">남이 해줄 때 제일 맛있는</p>
										<p class="title">비빔밥</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sample2.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">늘 먹어도 맛있어요</p>
										<p class="title">햄버거</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/soshige.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">먹어도 아무 뒤탈 없는</p>
										<p class="title">아주 큰 로또 당첨</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../recipe/recipe_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/gan.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">생으로 먹어보세요!!</p>
										<p class="title">생생삼겹살</p>
									</div>
								</div>
						</a></li>
						<!--4개-->
					</ul>
				</div>


				<!--페이징 단락-->
				<div class="paging">
					<ul class="clearfix">
						<!--li에 .disabled가 있으면 화살표에 클릭방지 생김-->
						<li class="arrow prev disabled"><button disabled>
								<span class="material-symbols-outlined">navigate_before</span>
							</button></li>
						<li class="active"><a href="javascript:">1</a></li>
						<li><a href="javascript:">2</a></li>
						<li><a href="javascript:">3</a></li>
						<li><a href="javascript:">4</a></li>
						<li><a href="javascript:">5</a></li>
						<li class="arrow next"><button>
								<span class="material-symbols-outlined">navigate_next</span>
							</button></li>
					</ul>
				</div>
			</div>
			<!--가이드 서칭 결과-->
			<div id="tab2" class="tabContainer">
				<div class="list_container">
					<ul class="list_ul">
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/gan.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">남이 해줄 때 제일 맛있는</p>
										<p class="title">비빔밥</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sample2.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">늘 먹어도 맛있어요</p>
										<p class="title">햄버거</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/soshige.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">먹어도 아무 뒤탈 없는</p>
										<p class="title">아주 큰 로또 당첨</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sam.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">생으로 먹어보세요!!</p>
										<p class="title">생생삼겹살</p>
									</div>
								</div>
						</a></li>
						<!--4개-->
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/gan.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">남이 해줄 때 제일 맛있는</p>
										<p class="title">비빔밥</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sample2.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">늘 먹어도 맛있어요</p>
										<p class="title">햄버거</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/soshige.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">먹어도 아무 뒤탈 없는</p>
										<p class="title">아주 큰 로또 당첨</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sam.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">생으로 먹어보세요!!</p>
										<p class="title">생생삼겹살</p>
									</div>
								</div>
						</a></li>
						<!--4개-->
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/gan.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">남이 해줄 때 제일 맛있는</p>
										<p class="title">비빔밥</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sample2.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">늘 먹어도 맛있어요</p>
										<p class="title">햄버거</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/soshige.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">먹어도 아무 뒤탈 없는</p>
										<p class="title">아주 큰 로또 당첨</p>
									</div>
								</div>
						</a></li>
						<li class="list_li"><i class="fa-regular fa-heart"></i> <a
							class="recipe_link" href="../guide/guide_detail.html">
								<div class="pic_box">
									<div class="imgwrap">
										<div class="imgBox">
											<img class="recipe_pic" src="${contextPath}/resource/images/food/sam.jpg"
												alt="#">
										</div>
									</div>
									<div class="textBox">
										<p class="sub_title">생으로 먹어보세요!!</p>
										<p class="title">생생삼겹살</p>
									</div>
								</div>
						</a></li>
						<!--4개-->


					</ul>
				</div>


				<!--페이징 단락-->
				<div class="paging">
					<ul class="clearfix">
						<!--li에 .disabled가 있으면 화살표에 클릭방지 생김-->
						<li class="arrow prev disabled"><button disabled>
								<span class="material-symbols-outlined">navigate_before</span>
							</button></li>
						<li class="active"><a href="javascript:">1</a></li>
						<li><a href="javascript:">2</a></li>
						<li><a href="javascript:">3</a></li>
						<li><a href="javascript:">4</a></li>
						<li><a href="javascript:">5</a></li>
						<li class="arrow next"><button>
								<span class="material-symbols-outlined">navigate_next</span>
							</button></li>
					</ul>
				</div>
			</div>
			<!--나만의 레시피-->
			<div id="tab3" class="tabContainer">
				<section class="myrecipe_section">
					<ul class="allwrite clearfix">
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라 이것들아 이것이 음식이다 빠라라라라라라라람 어쩌구
										저쩌구 이것저것</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다 자랑 좀 합시다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
						<li class="post-container"><a
							href="/front/html/community/myrecipe_post.html" class="imgwrap">
								<div class="post-section">
									<span class="postdate">2023.10.26 00:00</span>
									<h6 class="title">맛있는 음식을 봐라</h6>
									<p>내가 만든 요리 중에 제일 맛있는 요리입니다...</p>
									<ul class="accList">
										<li class="accItem"><span
											class="icon material-symbols-outlined">visibility</span>268</li>
										<li class="accItem"><span
											class="icon material-symbols-outlined">comment</span>12</li>
									</ul>
								</div>
								<div class="imgBox align">
									<img src="/front/images/food/gan.jpg" alt="">
								</div>
						</a></li>
					</ul>
				</section>
				<!--페이징 단락-->
				<div class="paging">
					<ul class="clearfix">
						<!--li에 .disabled가 있으면 화살표에 클릭방지 생김-->
						<li class="arrow prev disabled"><button disabled>
								<span class="material-symbols-outlined">navigate_before</span>
							</button></li>
						<li class="active"><a href="javascript:">1</a></li>
						<li><a href="javascript:">2</a></li>
						<li><a href="javascript:">3</a></li>
						<li><a href="javascript:">4</a></li>
						<li><a href="javascript:">5</a></li>
						<li class="arrow next"><button>
								<span class="material-symbols-outlined">navigate_next</span>
							</button></li>
					</ul>
				</div>
			</div>
			<!--요리 상담소-->
			<div id="tab4" class="tabContainer">
				<div class="qna">
					<ul class="qnaList ">
						<li class="tableWd tableTh">
							<p class="tableItem">번호</p>
							<p class="tableItem title">제목</p>
							<p class="tableItem">좋아요</p>
							<p class="tableItem">댓글</p>
							<p class="tableItem">작성자</p>
							<p class="tableItem">작성일</p>
						</li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">12</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>

						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">11</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">10</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">9</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">8</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">7</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">6</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">5</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">4</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">3</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">2</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
						<li><a href="#" class="textbox tableWd">
								<div class="num tableItem">1</div>
								<div class="text-title tableItem title">
									<span class="question">Q. </span>
									<p>잡채호떡에 청양고추간장 뿌려먹으면 맛이 있나요?</p>
									<span class="iconFile material-symbols-outlined">imagesmode</span>
								</div>
								<div class="tableItem">268</div>
								<div class="tableItem">80</div>
								<div class="qna-id tableItem">jhj7801</div>
								<div class="qna-date tableItem">2023.10.18 10:02</div>
						</a></li>
					</ul>
				</div>
				<!--페이징 단락-->
				<div class="paging">
					<ul class="clearfix">
						<!--li에 .disabled가 있으면 화살표에 클릭방지 생김-->
						<li class="arrow prev disabled"><button disabled>
								<span class="material-symbols-outlined">navigate_before</span>
							</button></li>
						<li class="active"><a href="javascript:">1</a></li>
						<li><a href="javascript:">2</a></li>
						<li><a href="javascript:">3</a></li>
						<li><a href="javascript:">4</a></li>
						<li><a href="javascript:">5</a></li>
						<li class="arrow next"><button>
								<span class="material-symbols-outlined">navigate_next</span>
							</button></li>
					</ul>
				</div>
			</div>
	</main>
	<!--푸터-->
	<footer id="footer"></footer>
	<!-- js -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/front/js/common.js"></script>
	<script src="/front/js/search.js"></script>
</body>
</html>