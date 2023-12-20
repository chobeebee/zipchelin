(function($) {
	$("#sidebar").load("${contextPath}/admin/layout/sidebar.jsp");
	$("#navbar").load("${contextPath}/admin/layout/topnav.jsp");
	$("#footer").load("${contextPath}/admin/layout/footer.jsp");
	$("#logoutModal").load("${contextPath}/admin/layout/logout.jsp");
	
	
	
	
	
		
		
})(jQuery);

//가이드 단계별 내용 추가
let stepNum=2;
function addGuiBtn(){
	let guiStep = `
		<div class="guiStep pt-3 pb-3 border-top">
            <div class="d-flex justify-content-between align-items-center mb-2">
	             <p class="mb-0">STEP ${stepNum}</p>
	             <button type="button" class="btn btn-sm btn-outline-secondary" onclick="delGui(this);">X</button>
            </div>
            <div class="custom-file mb-2">
				<input type="file" class="custom-file-input" id="guiImgFileName${stepNum}" aria-describedby="inputGroupFileAddon04">
				<label class="custom-file-label" for="guiImgFileName${stepNum}">이미지파일</label>
			</div>
             <textarea rows="3" class="form-control" id="guiText" name="guiText"></textarea>
      </div>
	`;
	stepNum++;
	$('#guiBtn').before(guiStep);
}

//가이드 단계별 내용 삭제
function delGui(obj){
	$(obj).parents(".guiStep").remove();
	console.log($('.guiStep').length);
	guiStepArray();
}

//가이드 단계별 내용 순서 재배치
function guiStepArray(){
	for(let i=1; i<$('.guiStep').length; i++){
		let stepNum=$('.guiStep')[i].index();
		console.log(stepNum);
		$('.guiStep[i]').find('p.mb-0').html('STEP '+ stepNum);
		$('.guiStep[i]').find('input[type="file"]').attr('id','guiImgFileName'+ stepNum);
		$('.guiStep[i]').find('.custom-file-label').attr('for','guiImgFileName'+ stepNum);
		
		
		
		/*let guiStepNum = `
			<div class="guiStep pt-3 pb-3 border-top">
	            <div class="d-flex justify-content-between align-items-center mb-2">
		             <p class="mb-0">STEP ${stepNum}</p>
		             <button type="button" class="btn btn-sm btn-outline-secondary" onclick="delGui(this);">X</button>
	            </div>
	            <div class="custom-file mb-2">
					<input type="file" class="custom-file-input" id="guiImgFileName${stepNum}" aria-describedby="inputGroupFileAddon04">
					<label class="custom-file-label" for="guiImgFileName${stepNum}">이미지파일</label>
				</div>
	             <textarea rows="3" class="form-control" id="guiText" name="guiText"></textarea>
	      </div>
		`;*/
		
	}
}






