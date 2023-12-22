<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<!--마이페이지 레프트박스 (프로필이미지, 아이디, 정보수정버튼)-->
<div class="myBox_profile">
    <img src="${contextPath}/resource/images/icon/profile.jpg" class="myProfile_img" alt="profile">
    <h3 class="userId_text">${memberId}</h3>
    <button class="myPage_edit_btn" onclick="location.href='${contextPath}/mypage/pwdConfirm'">정보수정</button>
</div><!--마이페이지 레프트박스 (프로필이미지, 아이디, 정보수정버튼) 끝-->

<!--마이페이지 레프트박스 (찜, 내글, 내댓글 갯수 & 바로가기)-->
<div class="myBox_count">
    <div class="myBox_countBox myBox_heart">
        <span id="myBox_icon" class="material-icons">favorite</span>
        <p>찜 <a href="${contextPath}/mypage/myheart">${count.pickCnt}</a></p>
    </div>

    <div class="myBox_countBox myBox_post">
        <span id="myBox_icon" class="material-symbols-outlined">stylus</span>
        <p>내 글 <a href="${contextPath}/mypage/mypost">${count.postCnt}</a></p>
    </div>

    <div class="myBox_countBox myBox_comment">
        <span id="myBox_icon" class="material-symbols-outlined">chat</span>
        <p>내 댓글 <a href="${contextPath}/mypage/myreply">${count.replyCnt}</a></p>
    </div>
</div><!--마이페이지 레프트박스 (찜, 내글, 내댓글 갯수 & 바로가기) 끝-->

</body>
</html>