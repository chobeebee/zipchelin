/*탭 부분*/
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

/* 찜하기 버튼 하트 */
$('.saveBtn').on('click', function(){
  let heart=$(this).children(':first-child');
  let btnClass=heart.attr('class');
  console.log(btnClass);
  if(btnClass == 'material-symbols-outlined'){
    heart.attr("class", "material-icons");
  }else{
    heart.attr("class", "material-symbols-outlined");
  }
})