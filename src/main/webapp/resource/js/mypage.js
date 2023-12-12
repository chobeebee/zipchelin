$(function(){
    //버튼 그룹 보기, 숨기기
    $('#showChk').click(function(){
        $(this).parent().addClass('hide').next().removeClass('hide');
        $('.listItem .chkWrap').css('display','block');
    });
    $('#chkCancle').click(function(){
        $(this).parent().addClass('hide').prev().removeClass('hide');
        $('.listItem .chkWrap').css('display','none');
    });

    //체크박스 전체 선택
    $("#allChk").click(function() {
		if($("#allChk").is(":checked")){
            $("input[name=chkItem]").prop("checked", true);
        }else {
            $("input[name=chkItem]").prop("checked", false);
        }
	});
	$("input[name=chkItem]").click(function() {
		var total = $("input[name=chkItem]").length;
		var checked = $("input[name=chkItem]:checked").length;

		if(total != checked){
            $("#allChk").prop("checked", false);
        } else{
            $("#allChk").prop("checked", true); 
        }     
	});


    //내가 쓴글 - 탭
    $('ul.tabGroup li').click(function(){
        var tab_id = $(this).attr('data-tab');
     
        $('ul.tabGroup li').removeClass('active');
        $('.tabContainer').removeClass('on');
     
        $(this).addClass('active');
        $("#"+tab_id).addClass('on');

        return false;
    });

    /*마이페이지 - 정보수정페이지*/
    //이메일(체크박스)
        $('#edit_email_input_choose').on('change', function () {
            let value = $('#edit_email_input_choose option:selected').text();
            if (value == '직접입력') {
                $('#edit_email_2').attr('disabled', false);
                $('#edit_email_2').val('');
            } else {
                $('#edit_email_2').attr('disabled', true);
                $('#edit_email_2').val(value);
            }
        })

        //마이페이지 - 찜목록 탭
        $(function() {
            $('ul.tabGroup li').click(function() {
                var actTab = $(this).attr('data-tab');
                $('ul.tabGroup li').removeClass('active'); 
                $('.tabContainer').removeClass('on');
                $(this).addClass('active');
                $('#' + actTab).addClass('on');
            })
        });

        /* 하트 토글 버튼 */
        document.querySelectorAll('.fa-regular.fa-heart').forEach(function (icon) {
            icon.addEventListener('click', function () {
            this.classList.toggle('fa-regular');
            this.classList.toggle('fa-solid');
            });
        });

        //사진 확대
        var swiper = new Swiper("heart_list_img", {
            slidesPerView: 1,
            spaceBetween: 30,
            loop: true,
            autoplay: {
              delay: 2500,
              disableOnInteraction: false,
            }
          });

        //수정페이지 - 취소버튼 클릭 시 페이지 새로고침
        $('#edit_can_btn').click(function() {
            alert('아');
            location.reload();
            });
});

//비밀번호
    //중복확인 체크
    //비밀번호 정규식
    var password_rule = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
    //비밀번호 체크
    function edit_complete_btn(){
        if ($('#edit_pwd').val() == '') {
            $('#edit_warning_pwd').css('display', 'block');
            $('#edit_pwd').css('border-color','red');
        } else {
            $('#edit_warning_pwd').css('display', 'none');
            if(!password_rule.test($('#edit_pwd').val())){
                $('#edit_warning_pwd_rule').css('display', 'block');
                $('#edit_pwd').css('border-color','red');
            }else{
                $('#edit_warning_pwd_rule').css('display', 'none');
                $('#edit_pwd').css('border-color','black');
            }
        }
        //비밀번호확인 체크
        if(!($('#check_pwd').val()==$('#edit_pwd').val()) || $('#check_pwd').val() == ''){
            $('#edit_warning_pwd_check').css('display','block')
            $('#check_pwd').css('border-color','red');
        }else{
            $('#edit_warning_pwd_check').css('display','none')
            $('#check_pwd').css('border-color','black');
        }

        //이름 
        if($('#name_input').val() == ''){
            $('#edit_warning_pwd_check2').css('display','block')
            $('#name_input').css('border-color','red');
        }else{
            $('#edit_warning_pwd_check2').css('display','none')
            $('#name_input').css('border-color','black');
        }

        //이메일
        if($('#edit_email_1').val() == ''){
            $('#edit_warning_email').css('display','block');
            $('#edit_email_1').css('border-color','red');
        }else{
            $('#edit_warning_email').css('display','none')
            $('#edit_email_1').css('border-color','black');
        }

        //전화번호 정규식
        var tel_rule = /^\d{3}\d{3,4}\d{4}$/;

        //전화번호
        if($('#edit_tel').val() == ''){
            $('#edit_warning_tel_none').css('display','block');
            $('#edit_warning_tel_minus').css('display', 'none');
            $('#edit_warning_tel').css('display', 'none');
            $('#edit_tel').css('border-color','red');
        }else{
            $('#edit_warning_tel_none').css('display', 'none');
            if($('#edit_tel').val().match('-')){
                $('#edit_warning_tel').css('display', 'none');
                $('#edit_warning_tel_minus').css('display', 'block');
                $('#edit_tel').css('border-color','red');
            }else{
                $('#edit_warning_tel_minus').css('display','none');
                if(!tel_rule.test($('#edit_tel').val())){
                    $('#edit_warning_tel').css('display', 'block');
                    $('#edit_tel').css('border-color','red');
                }else{
                    $('#edit_warning_tel').css('display', 'none');
                    $('#edit_tel').css('border-color','black');
                }
            }
        }
    }
        
