<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html lang="ko">
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
    
    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">
    
    <!-- 게시판 에디터 -->
   <script type="text/javascript" src="${contextPath}/resource/smarteditor/js/HuskyEZCreator.js" charset="utf-8"></script>

    <!-- plugin CSS -->
    <link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.min.css">
    
    <!-- myrecipelist CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/community.css">

<title>요리 상담소 작성폼</title>
</head>
<body>
    <!--헤더 -->
    <header class="header">
    	<jsp:include page="/WEB-INF/views/main/header.jsp"/>
    </header>
    
    <!-- 메인 -->
    <main>
        <section class="form-list">
        <form action="/community/qna/update/${qna.qnaNum }" method="post">
            <h1 class="best-title">요리 상담소</h1>
            <div>
                <div class="information informationBox">
                <input name="qnaNum" value="${qna.qnaNum }" type="hidden">
                    <h2 class="form-title">제목</h2>
                    <p><input class="formBox" name="qnaTitle" id="qnaTitle" value="${qna.qnaTitle }"></p>
                </div>
                <div class="information">
                    <h2 class="form-title">내용</h1>
                    <textarea name="qnaContent" id="form-content" class="form-content" cols="30" rows="10">${qna.qnaContent }</textarea>
                </div>
            </div>
            
            <div class="btnGroup lg form" >
           		<a href="${contextPath}/community/qna/post/${qna.qnaNum}">
                	<button type="button"  class="btnBgGray form" class="btn_cancel"> 취소</button>
                </a>
                	<input type="submit" class="btnBg" class="btn_upload" onclick="submitPost();">
    	    </div>
		</form>
            
        </section>
    </main>

    <!-- 푸터 -->
    <footer id="footer">
    	<jsp:include page="/WEB-INF/views/main/footer.jsp"/>
    </footer> 




    <!-- js --> 
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="${contextPath}/resource/js/common.js"></script>
    <script src="${contextPath}/resource/js/community.js"></script>
    
</body>
</html>
