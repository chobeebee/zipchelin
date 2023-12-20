$(function () {
    // /front/html/user/login.html 해당 페이지에서 '로그인' 텍스트 '로그아웃'으로 변경
    /* $("header").load("/zipchelin/WEB-INF/views/main/header.jsp", function() {
        if (window.location.href.endsWith('login.html')) {
            $('body > header > div > div.right_menu > a:nth-child(2)').text('로그인');
        }
    });
    $("footer").load("/zipchelin/WEB-INF/views/main/footer.jsp");
    $(".myPage_leftBox").load("/front/html/layout/mymenu.html");
    $(".aside").load("/front/html/layout/sideBar.html");*/

    //비밀번호 보기/숨기기
    $('.pwdToggle').on('click', function () {
        let input = $(this).prev('#pwdCheck, #sign_pwd, #sign_pwd2, #login_password, #edit_pwd, #check_pwd');
        if ($(input).attr("type") == "password") {
            $(input).attr("type", "text");
            $(this).html('visibility');
        } else {
            $(input).attr("type", "password");
            $(this).html('visibility_off');
        }
    });


    //내가 쓴글 - 탭
    $('ul.tabGroup a').click(function () {
        var tab_id = $(this).attr('data-tab');

        $('ul.tabGroup a').removeClass('active');
        $('.tabCont').removeClass('show');

        $(this).addClass('active');
        $("#" + tab_id).addClass('show');

        return false;
    });
});

//모달 창
$('#listDel, #modalAlert').click(function () {
    $('#modal').css('display', 'block');
});

//리스트 삭제 확인 modal
function modalHide() {
    $('#modal').hide();
};