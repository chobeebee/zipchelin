<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
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
    <link rel="icon" type="text/css" href="">

    <!-- google icon CDN -->
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">

    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

    <!-- page CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/member.css">

    <!-- plugin CSS -->
    <link rel="stylesheet" href="${contextPath}/front/css/swiper-bundle.css">

    <title>집슐랭</title>
</head>
<body>
<!--헤더 -->
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>

<main class="w1080">
    <h3 class="pageTitle">회원탈퇴</h3>
    <div class="leaveWrap">
        <section class="leaveSec">
            <h6>회원 탈퇴 안내</h6>
            <ul class="guideCont">
                <li>
                    <p>탈퇴 후 30일간 재가입이 불가능합니다.</p>
                    <p>(단, 간편가입 회원은 즉시 재가입이 가능합니다.)</p>
                </li>
                <li>
                    <p>회원 탈퇴 즉시 개인정보가 삭제되며 복원이 불가합니다.</p>
                </li>
                <li>
                    <p>작성한 게시글, 댓글 등 서비스 이용기록은 모두 삭제되며 데이터는 복구되지 않습니다.</p>
                </li>
                <li>
                    <p>작성한 게시글, 댓글은 탈퇴 시 자동삭제되지 않고 그대로 남아 있습니다.</p>
                </li>
                <li>
                    <p class="textGreen">삭제를 원하는 게시글, 댓글은 탈퇴 전에 삭제하시기 바랍니다.</p>
                </li>
            </ul>
            <input type="checkbox" class="chkBox" id="guideAgree" name="guideAgree">
            <label for="guideAgree">안내 사항을 모두 확인하였으며, 회원 탈퇴 하겠습니다.</label>
        </section>
        <section class="leaveSec">
            <h6>탈퇴 사유</h6>
            <p>집슐랭을 이용하시면서 불편했던 점을 공유해주시면 더 나은 서비스를 제공할 수 있도록 노력하겠습니다.</p>
            <strong class="chkAsk">탈퇴하시려는 이유를 선택해주세요.<span class="textGreen">(필수)</span></strong>
            <ul class="chkList">
                <li>
                    <input type="checkbox" class="chkBox" id="reason1">
                    <label for="reason1">자주 사용하지 않아요</label>
                </li>
                <li>
                    <input type="checkbox" class="chkBox" id="reason2">
                    <label for="reason2">찾는 정보가 없어요</label>
                </li>
                <li>
                    <input type="checkbox" class="chkBox" id="reason3">
                    <label for="reason3">새로운 계정으로 가입할래요</label>
                </li>
                <li>
                    <input type="checkbox" class="chkBox" id="reason4">
                    <label for="reason4">사이트 이용이 어려워요</label>
                </li>
                <li>
                    <input type="checkbox" class="chkBox" id="reason5">
                    <label for="reason5">개인 정보를 삭제하고 싶어요</label>
                </li>
                <li>
                    <input type="checkbox" class="chkBox" id="reason6">
                    <label for="reason6">직접입력</label>
                    <textarea name="reasonTyping" id="reasonTyping" cols="80" rows="6"
                              placeholder="불편했던 부분, 보완할 점을 편하게 공유해주세요."></textarea>
                </li>
            </ul>
        </section>
        <div class="btnGroup lg">
            <button type="button" class="btnBd" onclick="location.href='${contextPath}/member/index.do'">취소</button>
            <button type="button" class="btnBg" onclick="location.href='${contextPath}/member/leave_done.do'">탈퇴
            </button>
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
<script src="${contextPath}/resource/js/notice.js"></script>
</body>
</html>