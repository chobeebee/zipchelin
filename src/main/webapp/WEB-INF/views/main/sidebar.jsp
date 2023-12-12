<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("utf-8");
%>
<script>
	    $(function(){
	        //top 버튼
	        $('#quick_go_top').on('click', function(){
	            $('html, body').animate({
	                scrollTop: 0
	            },400);
	            return false;
	        });
	    });    
</script>
<div class="zim">
	<a class="clearfix" href="/front/html/mypage/myheart.html">
		<span class="material-icons">favorite</span>
		<p>찜한레시피</p>
		<span class="material-symbols-outlined">chevron_right</span>
	</a>
</div>
<div class="cur_recipe">
	<p>최근 본 레시피</p>
	<div class="aside_imgBox">
		<a href="/front/html/recipe/recipe_detail.html"><img src="images/food/sal.jpg" alt=""></a>
	    <a href="/front/html/recipe/recipe_detail.html"><img src="images/food/sal.jpg" alt=""></a>
	    <a href="/front/html/recipe/recipe_detail.html"><img src="images/food/sal.jpg" alt=""></a>
	</div>
</div>
<div class="top" id="quick_go_top">
	<a href="#"><span class="material-symbols-outlined">stat_1</span></a>
</div>