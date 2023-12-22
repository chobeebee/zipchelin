<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<div id="modal">
    <div class="modalBox">
        <div class="modalCont">
            <h6>정말로 삭제하시겠습니까?</h6>
            <p>한번 삭제 시 복구할 수 없습니다.</p>
        </div>
        <div class="btnGroup">
            <button type="button" class="btnBd" onclick="modalHide()">취소</button>
            <button type="button" class="btnBg" onclick="location.href=''">삭제</button>
        </div>
    </div>
</div>
