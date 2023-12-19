$(function() {
	var chkObj = document.getElementsByName("RowCheck");
	var rowCnt = chkObj.length;
	
	$("input[name='allCheck']").click(function() {
		var chk_listArr = $("input[name='Rowcheck']");
		for(var i=0;i<chk_listArr.length;i++){
			chk_listArr[i].checked = this.checked;
		}
	});
	$("input[name='RowCheck']").click(function() {
		if($("input[name='RowCheck']:checked").length == rowCnt) {
			$("input[name='allCheck']")[0].checked = true;
		}
		else {
			$("input[name='allCheck']")[0].checked = false;
		}
	});
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
			}
		});
	}
}