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
<link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/recipe.css">

<!-- plugin CSS -->
<link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.css">
<title>집슐랭</title>
</head>
<body>
	<!--헤더 -->
    <header class="header">
    	<jsp:include page="/WEB-INF/views/main/header.jsp"/>
    </header>
	<!--리스트 메인-->
    <main>
        <div id="main" class="recipePage">
            <!--리스트 타이틀-->
            <div class="title_box">
                <h2 class="pageTitle">레시피.ZIP</h2>
            </div>   
            <!--카테고리-->         
            <div class="category">
                <ul class="categoryName clearfix">
                    <li>
                        <a href="javascript:" class="categoryBox active" onclick="location.reload()">
                            <img class="cm_menu" src="${contextPath}/resource/images/icon/cm_menu.png" alt="menu">
                            <p>전체보기</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(1);">
                            <img src="${contextPath}/resource/images/icon/cm_rice.png" alt="rice">
                            <p>밥요리</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(2);">
                            <img src="${contextPath}/resource/images/icon/cm_soup.png" alt="soup">
                            <p>국&탕</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(3);">
                            <img src="${contextPath}/resource/images/icon/cm_chan.png" alt="chan">
                            <p>밑반찬</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(4);">
                            <img src="${contextPath}/resource/images/icon/cm_boiled.png" alt="boiled">
                            <p>찜&조림</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(5);">
                            <img src="${contextPath}/resource/images/icon/cm_salad.png" alt="salad">
                            <p>샐러드</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(6);">
                            <img src="${contextPath}/resource/images/icon/cm_box.png" alt="box">
                            <p>도시락</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(7);">
                            <img src="${contextPath}/resource/images/icon/cm_fried.png" alt="fried">
                            <p>튀김</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(8);">
                            <img src="${contextPath}/resource/images/icon/cm_dessert.png" alt="dessert">
                            <p>간식&분식</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(9);">
                            <img src="${contextPath}/resource/images/icon/cm_dessert2.png" alt="dessert2">
                            <p>디저트</p>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:" class="categoryBox" onclick="ajaxCateRecipe(10);">
                            <img src="${contextPath}/resource/images/icon/cm_etc.png" alt="etc">
                            <p>기타요리</p>
                        </a>
                    </li>
                </ul>
            </div>
            <!--레시피 리스트--> 
            <div class="list_container">
                <ul class="list_ul">
                	<c:choose>
                		<c:when test="${empty recipeList}">
                			<li class="noList">
                				<h6>레시피가 없습니다.</h6>
                			</li>
                		</c:when>
                		<c:when test="${!empty recipeList}">
                			<c:forEach var="recipe" items="${recipeList}">
                				<li class="list_li">
			                        <i class="fa-regular fa-heart"></i>                         
			                        <a class="recipe_link" href="/recipe/${recipe.recNum}">
			                            <div class="imgwrap">
			                                <div class="imgBox">
			                                    <img class="recipe_pic" src="${contextPath}/resource/images/food/${recipe.recImg0}" alt="#">
			                                </div>
			                            </div>
			                            <div class="textBox">
			                                <p class="sub_title">${recipe.recSubt}</p>
			                                <p class="title">${recipe.recTitle}</p>
			                            </div>
			                        </a>
			                    </li>
                			</c:forEach>
                		</c:when>
                	</c:choose>
                </ul>
            </div>
            <!--페이징 단락
            <div class="paging">
                <ul class="clearfix">
                    <li class="arrow prev disabled"><button disabled><span class="material-symbols-outlined">navigate_before</span></button></li>
                    <li class="active"><a href="javascript:">1</a></li>
                    <li><a href="javascript:">2</a></li>
                    <li><a href="javascript:">3</a></li>
                    <li><a href="javascript:">4</a></li>
                    <li><a href="javascript:">5</a></li>
                    <li class="arrow next"><button><span class="material-symbols-outlined">navigate_next</span></button></li>
                </ul>
            </div>-->
            <!-- 페이징 시작 -->
            <div class="paging">
                <ul class="clearfix">
                    <c:if test="${params.paging.prevPage}">
                        <li class="arrow prev"><a href="javascript:void(0)"
                               onclick="movePage(${params.paging.startPage - 1})">
                               <span class="material-symbols-outlined">navigate_before</span></a>
                        </li>
                    </c:if>

                    <c:forEach var="num" begin="${params.paging.startPage}"
                               end="${params.paging.endPage}">
                        <c:if test="${params.page != num}">
                            <li>
                            	<a href="javascript:void(0)" onclick="movePage(${num})">${num}</a>
                            </li>
                        </c:if>
                        <c:if test="${params.page == num}">
                            <li class="active">
                            	<a href="javascript:void(0)" onclick="movePage(${num})">${num}</a>
                            </li>
                        </c:if>
                    </c:forEach>

                    <c:if test="${params.paging.nextPage}">
                        <li class="arrow next">
                        	<a href="javascript:void(0)" onclick="movePage(${params.paging.endPage + 1})">
                        		<span class="material-symbols-outlined">navigate_next</span>
                        	</a>
                        </li>
                    </c:if>
                </ul>
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
    
    <script>
    	$('.categoryBox').on('click', function(){
    		$('.categoryBox').removeClass('active');
    		$(this).addClass('active');
    	});
    	
    	function ajaxCateRecipe(number){
    		$.ajax({
    			url: '${contextPath}/recipe/list/'+number,
    			type: "get",
    			dataType: "json",
    			success: recipeList,
    			error: function(request, status, error){
    				console.log(error);
    			}
    		});
    	}
    	
    	function recipeList(data){
    		console.log(data);
			//alert('성공');			
			let html="";
			
			$(".list_ul").empty();
			
			if(data.length == 0){
				html +=
					"<li class='noList'>"+
    				"<h6>레시피가 없습니다.</h6>"+
        			"</li>";
			}else{
				$.each(data, (index, obj)=>{
					html+=
						"<li class='list_li'>"+
							"<i class='fa-regular fa-heart'></i> "+
							"<a class='recipe_link' href='/recipe/"+obj.recNum+"'>"+
									"<div class='imgwrap'>"+
										"<div class='imgBox'>"+
											"<img class='recipe_pic' src='${contextPath}/resource/images/food/"+obj.recImg0+"' alt=''>"+
										"</div>"+
									"</div>"+
								"<div class='textBox'>"+
									"<p class='sub_title'>"+obj.recSubt+"</p>"+
									"<p class='title'>"+obj.recTitle+"</p>"+
								"</div>"+
							"</a>"+
						"</li>";
				});
			}
			
			$(".list_ul").append(html);
		}
    	
    </script>
</body>
</html>