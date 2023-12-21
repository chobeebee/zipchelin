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
                                placeholder="숫자/영문자 포함 6~12자"/>
                    <button type="button" onclick="id_dupl_valid()" class="sign_input_button btnBd">중복확인</button>
                </div>
                <div id="sign_id_warning_box">
                    <form:errors path="memberId" element="p" class="valid_warning"/>
                    <p class="sign_warning" id="sign_warning_id">아이디는 필수 입력사항입니다.</p>
                    <p class="sign_warning" id="sign_warning_id_rule">아이디는 숫자/영문자 포함 6~12자 여야 합니다.</p>
                    <p class="sign_warning" id="sign_warning_id_dup">중복되는 아이디 입니다.</p>
                </div>
            </div>
            <div class="form_item">
                <label for="sign_pwd" class="sign_left_label">비밀번호</label>
                <div class="inputField sign_info_input">
                    <form:input type="password" path="memberPwd" id="sign_pwd" class=""
                                placeholder="특수문자/영문자/숫자 포함 8~15자"/>
                    <form:errors path="memberPwd" element="p" class="valid_warning"/>
                </div>
                <div class="inputField sign_info_input">
                    <form:input type="password" path="pwdConfirm" id="sign_pwd2" class="" placeholder="비밀번호 확인"/>
                    <spring:hasBindErrors name="params">
                        <c:if test="${errors.hasGlobalErrors()}">
                            <p class="valid_warning">입력하신 비밀번호와 일치하지 않습니다.</p>
                        </c:if>
                    </spring:hasBindErrors>
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
    $('#mailSendBtn').on('click', function (e) {
        e.preventDefault();

        $('#mailSendBtn').addClass('transition-effect').prop('disabled', true)
            .css({
                'background-color': '#4FA72F',
                'color': '#fff',
            }).html('전송 중...');

        const params = {
            email: $('#sign_email').val(),
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
                console.log(response);
                if (response === 'success') {
                    $('#mailSendBtn').removeClass('transition-effect').prop('disabled', false)
                        .css({
                            'background-color': '#fff',
                            'color': '#4FA72F',
                        }).html('전송완료');
                    alert('이메일이 전송되었습니다.');
                } else {
                    $('#mailSendBtn').removeClass('transition-effect').prop('disabled', false)
                        .css({
                            'background-color': '#fff',
                            'color': '#4FA72F',
                        }).html('전송실패');
                    alert(response);
                }
            },
            error: function (request, error) {
                console.log(error);
            }
        })
    });

    $('#mailAuthBtn').on('click', function (e) {
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
                console.log(response);
                if (response) {
                    alert('인증이 완료되었습니다. <br>해당 인증은 5분 간 유효합니다.');
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

    function id_dupl_valid() {
        var id_rule = /^[A-Za-z0-9]{6,12}$/;

        if ($('#sign_id').val() == '') {
            $('#sign_warning_id_rule').css('display', 'none');
            $('#sign_id').css('border-color', 'red');
            $('#sign_warning_id').css('display', 'block');
        } else {
            $('#sign_warning_id').css('display', 'none');
            if (!id_rule.test($('#sign_id').val())) {
                $('#sign_warning_id_rule').css('display', 'block');
                $('#sign_id').css('border-color', 'red');
            } else {
                $('#sign_warning_id_rule').css('display', 'none');
                $('#sign_id').css('border-color', 'black');
            }
        }
    }
</script>
<script src="${contextPath}/resource/js/common.js"></script>
</body>
</html>