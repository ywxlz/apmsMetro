$(document).ready(function() {
	//判断表单是否为空标志
	var _phoneFlag = true;
	var _timeLimitFlag = true;
	
	//电话号码判断
	var _phoneCheck = /^(13[0-9]|15[0|3|6|7|8|9]|18[8|9])\d{8}$/ ;
	$('#phone').blur(function(){
		var _phone = $('#phone').val();
		if (_phoneCheck.test(_phone)) {
			$('#tip').html('');
			_phoneFlag = false;
		} else {
			$('#tip').html('电话号码格式不正确<br />请重新输入');
			$('#phone').val('');
			setTimeout( function(){
				 $("#phone").focus();
				},500); 
		}
	});
	
	//申请日期
	var _dateFlag = true;
	$('#date').blur(function(){
		if ($('#date').val() == '') {
			$('#tip').html('请选择日期');
		} else {
			$('#tip').html('');
			_dateFlag = false;
		}
	});
	
	//备注
	var _reasonFlag = true;
	$('#reason').blur(function(){
		if ($('#reason').val() == '') {
			$('#tip').html('备注不能为空');
		} else {
			$('#tip').html('');
			_reasonFlag = false;
		}
	});
	
	//什么都没填直接提交提示错误
	$('#button_01').click(function(){
		if (_phoneFlag) {
			$('#tip').html('电话号码格式不正确<br />请重新输入');
		} else if (_dateFlag) {
			$('#tip').html('请选择日期');
		} else if (_reasonFlag) {
			$('#tip').html('备注不能为空');
		} else {
			$('#button_00').show();
			$('#button_01').hide();
			$('#tip').html('确认提交？<br />确认请再次点击提交,<br />取消请返回.');
		}
	});
	
	$('#reset').click(function(){
		$('#button_01').show();
		$('#button_00').hide();
		$('#tip').html('');
	});
});