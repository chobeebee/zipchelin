$(function() {
	$("input[class='allCheck']").click(function() {
		var chk_listArr = $("input[class='check']");
		for(var i=0;i<chk_listArr.length;i++){
			chk_listArr[i].checked = this.checked;
		}
	});
});

function delNotice() {
	var url = "delnotice";
	var valueArr = new Array();
	var list = $("input[class='check']");
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
			}
		});
	}
}
let moveForm = $("#moveForm");
$(".pageInfo a").on("click", function(e) {
	e.preventDefault();
	moveForm.find("input[name='pageNum']").val($(this).attr("href"));
	moveForm.attr("action", "/admin/notice");
	moveForm.submit();
});
