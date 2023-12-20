<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
    request.setCharacterEncoding("utf-8");
%>
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
    <!-- 로고 -->
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="${contextPath}/admin/admin">
        <div class="sidebar-brand-icon rotate-n-15">zip</div>
        <div class="sidebar-brand-text mx-3">chelin</div>
    </a>
    <hr class="sidebar-divider">
    <!-- 메뉴 -->
    <li class="nav-item active">
        <a class="nav-link" href="#" data-toggle="collapse" data-target="#colMember" aria-expanded="true"
           aria-controls="colMember">
            <i class="fa fa-member-circle" aria-hidden="true"></i>
            <span>회원관리</span>
        </a>
        <div id="colMember" class="collapse show" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
            <div class="bg-white py-2 collapse-inner rounded">
                <a class="collapse-item active" href="${contextPath}/admin/admin">회원목록</a>
                <a class="collapse-item active2" href="${contextPath}/admin/delmem">탈퇴회원목록</a>
            </div>
        </div>
    </li>

    <li class="nav-item">
        <a class="nav-link" href="${contextPath}/admin/notice">
            <i class="fas fa-fw fa-bullhorn"></i>
            <span>공지사항</span>
        </a>
    </li>

    <li class="nav-item">
        <a class="nav-link" href="${contextPath}/admin/guide">
            <i class="fas fa-fw fa-book"></i>
            <span>가이드관리</span>
        </a>
    </li>

    <li class="nav-item">
        <a class="nav-link" href="${contextPath}/admin/recipe">
            <i class="fas fa-fw fa-cutlery"></i>
            <span>레시피관리</span>
        </a>
    </li>

    <li class="nav-item">
        <a class="nav-link" href="${contextPath}/admin/community">
            <i class="fas fa-fw fa-comments"></i>
            <span>커뮤니티관리</span>
        </a>
    </li>
</ul>