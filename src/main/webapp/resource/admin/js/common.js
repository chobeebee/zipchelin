(function($) {
    $("#sidebar").load("${contextPath}/admin/layout/sidebar.jsp");
    $("#navbar").load("${contextPath}/admin/layout/topnav.jsp");
    $("#footer").load("${contextPath}/admin/layout/footer.jsp");
    $("#logoutModal").load("${contextPath}/admin/layout/logout.jsp");
})(jQuery);

//button select all or cancel
/* $("#select-all").click(function () {
    var all = $("input.select-all")[0];
    all.checked = !all.checked;
    var checked = all.checked;
    $("input.select-item").each(function (index,item) {
        item.checked = checked;
    });
}); */

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
$('.cancle_check').click(function() {
    $('#select-all,.form-check').prop('checked', false);
});

let oEditors = [];

	smartEditor = function() {
		console.log("naver smarteditor");
		nhn.husky.EZCreator.createInIFrame({
			oAppRef: oEditors,
			elPlaceHolder: "editorTxt",
			sSkinURI: "../resource/smarteditor/SmartEditor2Skin.html",
			fCreator: "createSEditor2"
		});
	}
	$(document).ready(function() {
		smartEditor();
	});
	
/* 버튼 클릭 이벤트 */
/*function submitPost(){
​​​​
	​​​​oEditors.getById["editorTxt"].exec("UPDATE_CONTENTS_FIELD", []);
	​​​​//content Text 가져오기
	​​​​let content = document.getElementById("editorTxt").value;
	​​​​
	​​​​if(content == '<p>&nbsp;</p>') { //비어있는 경우
		​​​​​​​​alert("내용을 입력해주세요.");
		​​​​​​​​oEditors.getById["editorTxt"].exec("FOCUS");
		​​​​​​​​return;
	​​​​} else {
		​​​​​​​​//console.log(content);
		​​​​​​​​let writePost = {
			​​​​​​​​​​​​title: $("#title")[0].value​​​​​​​​​​​​,
			content: content
		​​​​​​​​};
		​​​​​​​​
		​​​​​​​​//ajax 통신으로 서버로 보내 데이터 저장함
		​​​​​​​​$.ajax({
			​​​​​​​​​​​​url: "postInsertAjax"​​​​​​​​​​​​, 
			data: writePost​​​​​​​​​​​​, 
			type: 'POST'​​​​​​​​​​​, 
			success: function(data) {
				​​​​​​​​​​​​​​​​console.log('success');
				​​​​​​​​​​​​​​​​alert('저장되었습니다.');
			​​​​​​​​​​​​​​​​	location.href='./myBlogAction.me'
			​​​​​​​​​​​​}​​​​​​​​​​​​, 
			error: function(jqXHR, textStatus, errorThrown) {
				​​​​​​​​​​​​​​​​console.log(jqXHR);
				​​​​​​​​​​​​​​​​alert('오류가 발생하였습니다.');
			​​​​​​​​​​​​}
		​​​​​​​​});
	​​​​}
}*/