$(function () {
    $("input[class='allCheck']").click(function () {
        var chk_listArr = $("input[class='check']");
        for (var i = 0; i < chk_listArr.length; i++) {
            chk_listArr[i].checked = this.checked;
        }
    });
});

function delNotice() {
    var url = "delnotice";
    var valueArr = new Array();
    var list = $("input[class='check']");
    for (var i = 0; i < list.length; i++) {
        if (list[i].checked) {
            valueArr.push(list[i].value);
        }
    }
    $.ajax({
        url: url,
        type: 'post',
        traditional: true,
        data: {
            valueArr: valueArr
        },
        success: function(response) {
			 window.location.href = "/admin/notice"
		}
    })
}

let moveForm = $("#moveForm");
$(".pageInfo a").on("click", function (e) {
    e.preventDefault();
    moveForm.find("input[name='pageNum']").val($(this).attr("href"));
    moveForm.attr("action", "/admin/notice");
    moveForm.submit();
});
