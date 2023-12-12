$(function(){
    //공지사항 리스트 토글
    $('.noticeItem').click(function(){
		let chk = $(this).hasClass('active');
		if(chk){
			$(this).removeClass('active');
		}else{
			$('.noticeItem').removeClass('active');
			$(this).addClass('active');
		}
    });
});