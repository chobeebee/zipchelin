/* 아이디/비밀번호 찾기 */

$(function () {
    //아이디찾기/비밀번호찾기 클릭시 효과
    $('#find_id_button').add('#find_pwd_button').on('click', function () {
        let act = $(this).html();
        $('#find_target').html(act);
        /* $('ul.tabGroup a').removeClass('active');
        $(this).find('a').addClass('active'); */

        return false;
    });
    $('.find_id_label').css('font-weight', 'bold');
    $('#find_box_id').addClass('selected_find_box');

    /* $('#find_box_id').on('click', function () {
        $('.find_id_label').css('font-weight', 'bold');
        $('.find_pwd_label').css('font-weight', 'normal');
        $('#find_box_id').addClass('selected_find_box');
        $('#find_box_pwd').removeClass('selected_find_box');
    })
    $('#find_box_pwd').on('click', function () {
        $('.find_pwd_label').css('font-weight', 'bold');
        $('.find_id_label').css('font-weight', 'normal');
        $('#find_box_pwd').addClass('selected_find_box');
        $('#find_box_id').removeClass('selected_find_box');
    }) */

    $('#find_email_input_choose').click(function () {
        let email_sec = $(this).val();
        if (email_sec == '직접입력') {
            $('#find_email_2').val('');
            $('#find_email_2').attr('disabled', false);
        } else {
            $('#find_email_2').attr('disabled', true);
            $('#find_email_2').val(email_sec);
        }
    })
    $('input[name=find]').css('color', 'red')
})

function find_form_submit() {//제출 메서드
    let email_1 = $('#find_email_1').val();
    let email_2 = $('#find_email_2').val();
    let name = $('#find_name').val();
    let find_check_count=0;

    //이메일 공백 확인
    if (email_1 == '' || email_2 == '') {
        $('#find_warning_email').css('display', 'block');
    } else {
        $('#find_warning_email').css('display', 'none');
        find_check_count++;
    }

    //이름 공백 확인
    if (name == '') {
        $('#find_warning_name').css('display', 'block');
    } else {
        $('#find_warning_name').css('display', 'none');
        find_check_count++;
    }

    //무엇을 찾는지 확인 후 action 설정 후 submit
    if(find_check_count==2){
            $('#find_email').val(email_1 + '@' + email_2);
        if ($("input[name='find']:checked").val() == 'finding_id') {
            $('#find_sign_up_form').attr('action', 'finding_id');
        } else if ($("input[name='find']:checked").val() == 'finding_pwd') {
            $('#find_sign_up_form').attr('action', 'finding_pwd');
        }
        $('#find_sign_up_form').submit();
    }
}



/* 회원가입 */
//이메일
$(function () {
    $('#sign_email_input_choose').on('change', function () {
        let value = $('#sign_email_input_choose option:selected').text();
        if (value == '직접입력') {
            $('#sign_email_2').attr('disabled', false);
            $('#sign_email_2').val('');
        } else {
            $('#sign_email_2').attr('disabled', true);
            $('#sign_email_2').val(value);
        }
    })
})

function sign_form_submit() {
    let sign_check_count = 0;
    var id_rule = /^[A-Za-z0-9]{6,12}$/;
    //id 체크

    if ($('#sign_id').val() == '') {
        $('#sign_warning_id_rule').css('display', 'none');
        $('#sign_id').css('border-color','red');
        $('#sign_warning_id').css('display', 'block');
    } else {
        $('#sign_warning_id').css('display', 'none');
        if(!id_rule.test($('#sign_id').val())){
            $('#sign_warning_id_rule').css('display', 'block');
            $('#sign_id').css('border-color','red');
        }else{
            $('#sign_warning_id_rule').css('display', 'none');
            $('#sign_id').css('border-color','black');
            sign_check_count++;
        }
    }

    //id 중복확인 체크
    sign_check_count++;

    //비밀번호 정규식
    var password_rule = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
    //비밀번호 체크
    if ($('#sign_pwd').val() == '') {
        $('#sign_warning_pwd').css('display', 'block');
        $('#sign_pwd').css('border-color','red');
    } else {
        $('#sign_warning_pwd').css('display', 'none');
        if(!password_rule.test($('#sign_pwd').val())){
            $('#sign_warning_pwd_rule').css('display', 'block');
            $('#sign_pwd').css('border-color','red');
        }else{
            $('#sign_warning_pwd_rule').css('display', 'none');
            $('#sign_pwd').css('border-color','black');
            sign_check_count++;
        }
    }
    //비밀번호확인 체크
    if ($('#sign_pwd').val() == '') {
        $('#sign_warning_pwd2').css('display', 'block');
        $('#sign_pwd2').css('border-color','red');
    } else {
        $('#sign_warning_pwd2').css('display', 'none');
        if($('#sign_pwd2').val() != $('#sign_pwd').val()){
            $('#sign_warning_pwd2_rule').css('display', 'block');
            $('#sign_pwd2').css('border-color','red');
        }else{
            $('#sign_warning_pwd2_rule').css('display', 'none');
            $('#sign_pwd2').css('border-color','black');
            sign_check_count++;
        }
    }
    //이름 체크
    if ($('#sign_name').val() == '') {
        $('#sign_warning_name').css('display', 'block');
        $('#sign_name').css('border-color','red');
    } else {
        $('#sign_warning_name').css('display', 'none');
        $('#sign_name').css('border-color','black');
        sign_check_count++;
    }
    //이메일 체크
    if ($('#sign_email_1').val() == '' || $('#sign_email_2').val() == '') {
        $('#sign_warning_email').css('display', 'block');
        $('#sign_email_1').css('border-color','red');
        $('#sign_email_2').css('border-color','red');
    } else {
        $('#sign_warning_email').css('display', 'none');
        $('#sign_email_1').css('border-color','black');
        $('#sign_email_2').css('border-color','black');
        let email = $('#sign_email_1').val() + '@' + $('#sign_email_2').val();
        $('#sign_email').val(email);
        sign_check_count++;
    }
    //전화번호 정규식
    var tel_rule = /^\d{3}\d{3,4}\d{4}$/;
    //전화번호 체크
    if ($('#sign_tel').val() == '') {
        $('#sign_warning_tel').css('display', 'block');
        $('#sign_warning_tel_minus').css('display', 'none');
        $('#sign_warning_tel_rule').css('display', 'none');
        $('#sign_tel').css('border-color','red');
    } else {
        $('#sign_warning_tel').css('display', 'none');
        if($('#sign_tel').val().match('-')){
            $('#sign_warning_tel_rule').css('display', 'none');
            $('#sign_warning_tel_minus').css('display', 'block');
            $('#sign_tel').css('border-color','red');
        }else{
            $('#sign_warning_tel_minus').css('display', 'none');
            if(!tel_rule.test($('#sign_tel').val())){
                $('#sign_warning_tel_rule').css('display', 'block');
                $('#sign_tel').css('border-color','red');
            }else{
                $('#sign_warning_tel_rule').css('display', 'none');
                $('#sign_tel').css('border-color','black');
                sign_check_count++;
            }
        }
    }
    //약관동의여부 체크
    if ($('input[id=sign_agree]').is(':checked')) {
        $('#sign_warning_agree').css('display', 'none');
        sign_check_count++;
    } else {
        $('#sign_warning_agree').css('display', 'block');
    }
    //모두 체크 되어있을 시 제출
    if (sign_check_count == 8) {
        $('#sign_up_form').attr('action', '#').submit();
    }
}

//로그인

function login_form_submit(){
    let user_id=$('#login_id').val();
    let user_pwd=$('#login_password').val();
    let login_check_count=0;
    if(user_id==''){
        $('#login_id_warning').css('display','block')
    }else{
        $('#login_id_warning').css('display','none')
        login_check_count++;
    }

    if(user_pwd==''){
        $('#login_pwd_warning').css('display','block')
    }else{
        $('#login_pwd_warning').css('display','none')
        login_check_count++;
    }
    if(login_check_count==2){
        $('#login_form').submit();
    }else{
        return false;
    }
}

function login_fail_get_out(){
    $('#login_fail').css('display','none');
}

function email_auth_check(){
    if($('#auth_input').val()==''){
        $('.auth_warning').css('display','block')
        return false;
    }else{
        $('.auth_warning').css('display','none')
        $('#auth_form').submit();
    }
}