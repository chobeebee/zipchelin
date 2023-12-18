(function($) {
    $("#sidebar").load("${contextPath}/admin/layout/sidebar.jsp");
    $("#navbar").load("${contextPath}/admin/layout/topnav.jsp");
    $("#footer").load("${contextPath}/admin/layout/footer.jsp");
    $("#logoutModal").load("${contextPath}/admin/layout/logout.jsp");
})(jQuery);

//체크박스 전체선택
$('#select-all').change(function() {
    $('.form-check').prop('checked', this.checked);
});
$('.form-check').change(function(){
    if($('.form-check:checked').length == $('.form-check').length){
        $('#select-all').prop('checked', true);
    }else{
        $('#select-all').prop('checked', false);
    }
});

function delNotice() {
	var url = "delnotice";
	var valueArr = new Array();
	var list = $("input[class='form-check']");
	for(var i=0;i<list.length;i++) {
		if(list[i].checked) {
			valueArr.push(list[i].value);
		}
	}
	if(valueArr.length == 0) {
		alert("선택된 글이 없습니다.");
	} else {
		var chk = confirm("정말 삭제하겠습니까?");
		$.ajax({
			url: url,
			type: 'post',
			traditional: true,
			data: {
				valueArr : valueArr
			},
			success: function(jdata){
				if(jdata==1) {
					alert("삭제되었습니다.");
					location.replace("list");
				} else {
					alert("삭제 실패");
				}
			}
		});
	}
}