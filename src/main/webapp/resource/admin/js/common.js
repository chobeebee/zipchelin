(function($) {
	$("#sidebar").load("${contextPath}/admin/layout/sidebar.jsp");
	$("#navbar").load("${contextPath}/admin/layout/topnav.jsp");
	$("#footer").load("${contextPath}/admin/layout/footer.jsp");
	$("#logoutModal").load("${contextPath}/admin/layout/logout.jsp");
	
	
	
	
	
		
		
})(jQuery);

//가이드 단계별 내용 추가
let stemNum=2;
function addGuiBtn(){
	let guiStep = `
		<div class="guiStep pt-3 pb-3 border-top">
            <div class="d-flex justify-content-between align-items-center mb-2">
	             <p class="mb-0">STEP ${stemNum}</p>
	             <button class="btn btn-sm btn-outline-secondary delGuiStep">X</button>
            </div>
            <div class="custom-file mb-2">
				<input type="file" class="custom-file-input" id="guiImgFileName${stemNum}" aria-describedby="inputGroupFileAddon04">
				<label class="custom-file-label" for="guiImgFileName${stemNum}">이미지파일</label>
			</div>
             <textarea rows="3" class="form-control" id="guiText" name="guiText"></textarea>
      </div>
	`;
	stemNum++;
	$('#guiBtn').before(guiStep);
}

//가이드 단계별 내용 삭제
function delGui(obj){
	$(obj).closet(".guiStep").remove();
}




