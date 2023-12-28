<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
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

<!-- basic CSS -->
<link rel="stylesheet" type="text/css"
	href="${contextPath}/resource/css/reset.css">
<link rel="stylesheet" type="text/css"
	href="${contextPath}/resource/css/base.css">
<link rel="stylesheet" type="text/css"
	href="${contextPath}/resource/css/common.css">

<!-- page CSS -->
<link rel="stylesheet" type="text/css"
	href="${contextPath}/resource/css/recipe.css">

<!-- plugin CSS -->
<link rel="stylesheet"
	href="${contextPath}/resource/css/swiper-bundle.css">
<title>집슐랭</title>

<script type="text/javascript">
	function name() {

	}
</script>
</head>
<body>
	<!--헤더 -->
	<header class="header">
		<jsp:include page="/WEB-INF/views/main/header.jsp" />
	</header>
	<main>
		<div id="main">
			<!--레시피섹션시작-->
			<section class="recipe_detail">
				<div class="recipe_first_container">
					<div class="recipe_page_name_box ">
						<p class="recipe_page_name">레시피.ZIP</p>
					</div>

					<div class="recipe_title_box">
						<div class="recipe_txt">
							<h6 class="recipe_title">${recipe.recTitle}</h6>
							<p class="recipe_sub_title">${recipe.recSubt}</p>
						</div>
						<div class="recipe_social_box">
							<div class="view_box common_box">
								<span class="icon material-symbols-outlined">visibility</span>
								<p class="view_count counts">${recipe.recView}</p>
							</div>
							<div class="heart_box common_box">
								<span class="material-symbols-outlined">favorite</span>
								<p class="heart_count counts">56</p>
							</div>
						</div>
					</div>

					<div class="recipe_box clearfix">
						<img class="recipe_img"
							src="${contextPath}/resource/images/food/sample.jpg" alt="">
						<div class="recipe_prepare">
							<div class="recipe_mate">재료</div>
							<div class="recipe_mate recipe_materials">
								<div class="mate_name">필수 준비재료</div>
								<p class="mates">${recipe.recIngreMain}</p>
							</div>
							<div class="recipe_mate recipe_materials">
								<div class="mate_name">선택 재료</div>
								<p class="mates">${recipe.recIngreSub}</p>
							</div>
							<div class="recipe_mate recipe_tools">
								<div class="mate_name">준비 도구</div>
								<p class="mates">${recipe.recTool}</p>
							</div>
							<div class="btnGroup">
								<button class="btn btnBd saveBtn" type="button">
									<span class="material-symbols-outlined">favorite</span><span
										class="btnTxt">찜하기</span>
								</button>
								<button class="btn btnBdGray" type="button">
									<span class="icon material-symbols-outlined">share</span>
								</button>
							</div>
						</div>
					</div>
					<div class="recipe_description_box">${recipe.recDesc0}</div>
				</div>
				<!--반복 컨테이너-->
				<div class="recipe_container clearfix">
					<img class="recipe_img"
						src="${contextPath}/resource/images/food/${recipe.recImg1}.jpg"
						alt="레시피 이미지">
					<div class="recipe_description_box">
						<div class="step">step1.</div>
						${recipe.recDesc1}
					</div>
				</div>
				<c:if test="${recipe.recDesc2 != null}">
					<div class="recipe_container clearfix">
						<img class="recipe_img"
							src="${contextPath}/resource/images/food/${recipe.recImg2}"
							alt="레시피 이미지">
						<div class="recipe_description_box last">
							<div class="step">step2.</div>
							${recipe.recDesc2}
						</div>
					</div>
				</c:if>
				<c:if test="${recipe.recDesc3 != null}">
					<div class="recipe_container clearfix">
						<img class="recipe_img"
							src="${contextPath}/resource/images/food/${recipe.recImg3}"
							alt="레시피 이미지">
						<div class="recipe_description_box last">
							<div class="step">step3.</div>
							${recipe.recDesc3}
						</div>
					</div>
				</c:if>
			</section>
			<!--가이드섹션 끝-->
			!여기!
			<section class="recommend">
				<div class="detailLast list_container">
					<h6>추천 레시피</h6>
					<ul class="list_ul">
						<c:forEach var="recipe" items="${recipeList}">
							<li class="list_li">
								<i class="fa-regular fa-heart"></i> 
								<a class="recipe_link" href="${contextPath}/resource/images/food/recipe/${recipe.recNum}">
									<div class="pic_box">
										<div class="imgwrap">
											<div class="imgBox">
												<img class="recipe_pic" 
												src="${contextPath}/resource/images/food/recipe/${recipe.recImg0}" alt="추천레시피">
											</div>
										</div>
										<div class="textBox">
											<p class="sub_title">${recipe.recSubt}</p>
											<p class="title">${recipe.recTitle}</p>
										</div>
									</div>
								</a>
							</li>
						</c:forEach>

					</ul>
				</div>
			</section>
		</div>
	</main>
	<!-- 푸터 -->
	<footer id="footer">
		<jsp:include page="/WEB-INF/views/main/footer.jsp" />
	</footer>

	<!-- js -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="${contextPath}/resource/js/common.js"></script>
	<script src="${contextPath}/resource/js/guide.js"></script>
</body>
</html>