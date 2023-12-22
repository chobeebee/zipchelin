<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/user.css">

    <!-- plugin CSS -->
    <link rel="stylesheet" href="${contextPath}/resource/css/swiper-bundle.css">

    <!--[if IE 9]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie9.min.css"
          rel="stylesheet">
    <![endif]-->
    <!--[if lte IE 8]>
    <link type="text/css" href="https://cdn.jsdelivr.net/gh/coliff/bootstrap-ie8/css/bootstrap-ie8.min.css"
          rel="stylesheet">
    <![endif]-->
    <title>회원가입</title>
</head>
<body id="sign_body">
<%-- 헤더 --%>
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>

<main>
    <section id="sign_section">
        <h1 id="sign_title" class="pageTitle">회원가입</h1>
        <form:form modelAttribute="params" action="/member/sign-up" id="sign_up_form" method="post">
            <div class="form_item">
                <label for="sign_id" class="sign_left_label">아이디</label>
                <div class="sign_input_box">
                    <form:input type="text" path="memberId" id="sign_id" class="sign_info_input2"
                                placeholder="영문 소문자/숫자 포함 6~12자"/>
                    <form:checkbox path="idAuth" id="isIdAuthed"/>
                    <button type="button" id="idAuthBtn" class="auth_button">중복확인</button>
                </div>
                <div id="sign_id_warning_box">
                    <form:errors path="memberId" element="p" class="valid_warning"/>
                    <form:errors path="idAuth" element="p" class="valid_warning"/>
                </div>
            </div>
            <div class="form_item">
                <label for="sign_pwd" class="sign_left_label">비밀번호</label>
                <div class="inputField sign_info_input">
                    <form:input type="password" path="memberPwd" id="sign_pwd" class=""
                                placeholder="영문 대소문자/숫자 포함 8~15자"/>
                    <form:errors path="memberPwd" element="p" class="valid_warning"/>
                </div>
                <div class="inputField sign_info_input">
                    <form:input type="password" path="pwdConfirm" id="sign_pwd2" class="" placeholder="비밀번호 확인"/>
                    <form:errors path="pwdConfirm" element="p" class="valid_warning"/>
                </div>
            </div>
            <div class="form_item">
                <label for="sign_name" class="sign_left_label">이름</label>
                <div class="sign_input_box">
                    <form:input type="text" path="memberName" id="sign_name" class="sign_info_input" placeholder="이름"/>
                </div>
                <form:errors path="memberName" element="p" class="valid_warning"/>
            </div>
            <div class="form_item">
                <label for="sign_email" class="sign_left_label">이메일</label>
                <div>
                    <div class="sign_input_box">
                        <form:input type="email" path="memberEmail" id="sign_email" class="sign_info_input2"
                                    placeholder="이메일"/>
                        <button type="button" id="mailSendBtn" class="sign_input_button btnBd">본인인증</button>
                    </div>
                    <form:errors path="memberEmail" element="p" class="valid_warning"/>
                </div>
            </div>
            <div class="form_item">
                <label for="emailCode" class="sign_left_label">인증번호</label>
                <div class="sign_input_box">
                    <input type="text" id="emailCode" class="sign_info_input2" placeholder="인증번호">
                    <form:checkbox path="emailAuth" id="isEmailAuthed"/>
                    <button type="button" id="mailAuthBtn" class="sign_input_button btnBd">확인</button>
                </div>
                <form:errors path="emailAuth" element="p" class="valid_warning"/>
            </div>
            <div class="form_item">
                <div>
                    <form:checkbox path="terms" class="chkBox" label="이용약관을 읽고 동의하였습니다."/>
                </div>
                <form:errors path="terms" element="p" class="valid_warning"/>
            </div>

            <div>
                <button type="submit" id="sign_submit_button" class="btnBg">회원가입</button>
            </div>
        </form:form>
    </section>
</main>

<!-- 푸터 -->
<footer id="footer">
    <jsp:include page="/WEB-INF/views/main/footer.jsp"/>
</footer>

<!-- js -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
    $('#sign_id').on('input', debounce(function () {

        let btn = $('#idAuthBtn');
        let id = $('#sign_id');
        let id_rule = /^[a-z0-9]{6,12}$/;

        if (id.val() === '' || !id_rule.test(id.val())) {
            btn.removeClass('transition-effect').prop('disabled', false)
                .css({
                    'border-color': '#FF0000FF',
                    'background-color': '#fff',
                    'color': '#FF0000FF',
                }).html('양식오류');
            id.css('border-color', 'red');
            $('#isIdAuthed').prop('checked', false);
            return;
        }

        const params = {id: id.val()};

        $.ajax({
            url: '/member/confirmId',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(params),
            dataType: 'json',
            async: true,

            success: function (response) {
                if (response) {
                    btn.removeClass('transition-effect').prop('disabled', false)
                        .css({
                            'border-color': '#4FA72F',
                            'background-color': '#fff',
                            'color': '#4FA72F',
                        }).html('사용가능');
                    id.css('border-color', 'black');
                    $('#isIdAuthed').prop('checked', true);
                } else {
                    btn.removeClass('transition-effect').prop('disabled', false)
                        .css({
                            'border-color': '#FF0000FF',
                            'background-color': '#fff',
                            'color': '#FF0000FF',
                        }).html('아이디 중복');
                    id.css('border-color', 'red');
                    $('#isIdAuthed').prop('checked', false);
                }
            },
            error: function (request, error) {
                console.log(error);
            }
        })
    }, 500));

    function debounce(func, delay) {
        let timeoutId;
        return function (...args) {
            clearTimeout(timeoutId);
            timeoutId = setTimeout(() => {
                func.apply(this, args);
            }, delay);
        };
    }

    $('#mailSendBtn').on('click', function () {

        let email = $('#sign_email');
        let sendBtn = $('#mailSendBtn');
        let email_rule = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (email.val() === '' || !email_rule.test(email.val())) {
            sendBtn.addClass('transition-effect')
                .css({
                    'border-color': '#FF0000FF',
                    'background-color': '#fff',
                    'color': '#FF0000FF',
                }).html('양식오류');
            email.css('border-color', 'red');
            return;
        }

        sendBtn.addClass('transition-effect').prop('disabled', true)
            .css({
                'background-color': '#4FA72F',
                'color': '#fff',
            }).html('전송 중...');

        const params = {
            email: email.val(),
            code: ''
        }

        $.ajax({
            url: '/member/sendMail',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(params),
            dataType: 'text',
            async: true,

            success: function (response) {
                if (response === 'success') {
                    sendBtn.removeClass('transition-effect').prop('disabled', false)
                        .css({
                            'border-color': '#4FA72F',
                            'background-color': '#fff',
                            'color': '#4FA72F',
                        }).html('전송완료');
                    email.css('border-color', '#4FA72F');
                    alert('이메일이 전송되었습니다.');
                } else {
                    sendBtn.removeClass('transition-effect').prop('disabled', false)
                        .css({
                            'border-color': '#FF0000FF',
                            'background-color': '#fff',
                            'color': '#FF0000FF',
                        }).html('전송실패');
                    email.css('border-color', 'red');
                    alert(response);
                }
            },
            error: function (request, error) {
                console.log(error);
            }
        })
    });

    $('#mailAuthBtn').on('click', function () {
        const params = {
            email: $('#sign_email').val(),
            code: $('#emailCode').val()
        };

        $.ajax({
            url: '/member/confirmMail',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(params),
            dataType: 'json',
            async: true,

            success: function (response) {
                if (response) {
                    alert('인증이 완료되었습니다. 해당 인증은 5분 간 유효합니다.');
                    $('#isEmailAuthed').prop('checked', true);
                } else {
                    alert('잘못된 인증번호입니다. 다시 확인해주세요.');
                }
            },
            error: function (request, error) {
                console.log(error);
            }
        })
    });
</script>
<script src="${contextPath}/resource/js/common.js"></script>
</body>
</html>