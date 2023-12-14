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

<title>집슐랭</title>
</head>
<body>
	<!--헤더 -->
    <header class="header">
    	<jsp:include page="/WEB-INF/views/main/header.jsp"/>
    </header>
    
    <main class="w1080 clearfix">
        <!--myPage_leftBox-->
        <div class="mypage myPage_leftBox">
        	<jsp:include page="/WEB-INF/views/main/mymenu.jsp"/>
        </div>
        
        <section class="AllList">
            <h3 class="pageTitle">내가 쓴 댓글</h3>
            <div class="componentWrap">
                <div class="btnGroup bdBtnGroup">
                    <button class="btn btnBd" id="showChk">선택</button>
                </div>
                <div class="btnGroup bdBtnGroup hide">
                    <button class="btn btnBdGray">
                        <label for="allChk"><input type="checkbox" id="allChk">전체선택</label>
                    </button>
                    <button class="btn btnBdGray" id="listDel">삭제</button>
                    <button class="btn btnBd" id="chkCancle">취소</button>
                </div>
            </div>
            <div class="tabContWrap">
                <div class="tabCont01">
                    <ul class="imgLists myreplyList">
                        <li class="listItem myreplyItem">
                            <div class="chkWrap">
                                <input type="checkbox" class="chkBox" name="chkItem" id="listChk01">
                                <label for="listChk01"></label>
                            </div>
                            <div class="myCont contBox">
                                <a href="/front/html/community/qna_post.html">
                                    <span class="postDate">2023.10.17 00:00</span>
                                    <h6>모래뿐일 것이다 이상의 꽃이 없으면 쓸쓸한 인간에 남는 것은 영락과 부패 뿐이다 낙원?? 꽃이 없으면 쓸쓸한 인간에 남는 것은 영락과 부패 뿐이다 낙원</h6>
                                    <div class="replyPage">
                                        <strong class="community_menu">요리 상담소</strong><p class="linkTitle">모래뿐일 것이다 이상의 꽃 모래뿐일 것이다 이상의 꽃 모래뿐일 것이다 이상의 꽃 모래뿐일 것이다 이상의 꽃</p><span class="material-symbols-outlined">chevron_right</span>
                                        <!-- <strong class="community_menu">나만의 레시피</strong><p class="linkTitle">모래뿐일 것이다 이상의 꽃</p><span class="material-symbols-outlined">chevron_right</span> -->
                                    </div>
                                </a>
                            </div>
                        </li>
                    </ul>
                    <div class="paging">
                        <ul>
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
            
        </section>
    </main>
    
    
    <!-- 푸터 -->
    <footer id="footer">
    	<jsp:include page="/WEB-INF/views/main/footer.jsp"/>
    </footer> 
    
    <!--모달 창
    <div>
    	<jsp:include page="/WEB-INF/views/content/modal.jsp"/>
    </div>-->
	
	<!-- js -->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="${contextPath}/resource/js/common.js"></script>
    <script src="${contextPath}/resource/js/mypage.js"></script>
</body>
</html>