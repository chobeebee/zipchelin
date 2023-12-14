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