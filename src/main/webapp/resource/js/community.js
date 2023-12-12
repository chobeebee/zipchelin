
/* 레시피 글, 요리 상담소 */
//답글 달기 클릭 시 효과
$(function(){
    $(".replyWrite").click(function() {
        $(this).css('display','none').next().css('display','block');
        $(this).closest('.comment').next().slideDown(300);
    });
    $(".replyCancle").click(function() {
        $(this).css('display','none').prev().css('display','block');
        $(this).closest('.comment').next().slideUp(300);
    });
});
    //추천 클릭 시 효과
    $(function(){
        
    });
    function goodAction(e){
        if($(e).hasClass('material-symbols-outlined')){
            $(e).attr('class','material-icons');
        }else{
            $(e).attr('class','material-symbols-outlined');
        }
    }
    

    

