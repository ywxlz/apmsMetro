$(document).ready(function() {
	//处理施工性质的选择之后通讯业务的显示
	//施工性质
	var _natureFlag = true;
	$('#nature_0').click(function(){
		$('#natureTd').hide();
		$('#natureTd_01').show();
		$('#natureText_01').show();
		$('#natureText_02').hide();
		$('#natureText_03').hide();
		$('#natureText_04').hide();
		_natureFlag = false;
	});
	$('#nature_1').click(function(){
		$('#natureTd').hide();
		$('#natureTd_02').show();
		$('#natureText_01').hide();
		$('#natureText_02').show();
		$('#natureText_03').hide();
		$('#natureText_04').hide();
		_natureFlag = false;
	});
	$('#nature_2').click(function(){
		$('#natureTd').hide();
		$('#natureTd_03').show();
		$('#natureText_01').hide();
		$('#natureText_02').hide();
		$('#natureText_03').show();
		$('#natureText_04').hide();
		_natureFlag = false;
	});
	$('#nature_3').click(function(){
		$('#natureTd').hide();
		$('#natureTd_04').show();
		$('#natureText_01').hide();
		$('#natureText_02').hide();
		$('#natureText_03').hide();
		$('#natureText_04').show();
		_natureFlag = false;
	});
	
	//点击重置之后初始化页面
	$('.reset').click(function(){
		$('#natureTd').show();
		$('#natureTd_01').hide();
		$('#natureTd_02').hide();
		$('#natureTd_03').hide();
		$('#natureTd_04').hide();
		$('#natureText_01').show();
		$('#natureText_02').show();
		$('#natureText_03').show();
		$('#natureText_04').show();
		$('#tip').html('');
	});
	
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
	
	// 判断期限
	$('#timeLimit').blur(function(){
		if (isNaN($('#timeLimit').val())) {
			$("#tip").html('期限不能输入非数字<br />请重新输入');
			$('#timeLimit').val('');
		} else if ($('#timeLimit').val() == '') {
			$("#tip").html('期限不能为空');
			$('#timeLimit').val('');
		} else {
			_timeLimitFlag = false;
			$('#tip').html('');
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
	
	//部门签批人
	var _headerFlag = true;
	$('#header').blur(function(){
		if ($('#header').val() == '') {
			$('#tip').html('部门签批人不能为空');
		} else {
			$('#tip').html('');
			_headerFlag = false;
		}
	});
	
	//施工地点
	var _addressFlag = true;
	$('#address').blur(function(){
		if ($('#address').val() == '') {
			$('#tip').html('施工地点不能为空');
		} else {
			$('#tip').html('');
			_addressFlag = false;
		}
	});
	
	//数量
	var _countFlag = true;
	$('#count').blur(function(){
		if ($('#count').val() == '') {
			$('#tip').html('数量不能为空');
		} else {
			$('#tip').html('');
			_countFlag = false;
		}
	});
	
	//备注
	var _reasonFlag = true;
	$('.reason_00').blur(function(){
		if ($('.reason_00').val() == '') {
			$('#tip').html('备注不能为空');
		} else {
			$('#tip').html('');
			_reasonFlag = false;
		}
	});
	$('.reason_01').blur(function(){
		if ($('.reason_01').val() == '') {
			$('#tip').html('备注不能为空');
		} else {
			$('#tip').html('');
			_reasonFlag = false;
		}
	});
	$('.reason_02').blur(function(){
		if ($('.reason_02').val() == '') {
			$('#tip').html('备注不能为空');
		} else {
			$('#tip').html('');
			_reasonFlag = false;
		}
	});
	$('.reason_03').blur(function(){
		if ($('.reason_03').val() == '') {
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
		} else if (_timeLimitFlag) {
			$('#tip').html('期限不能输入非数字<br />请重新输入');
		} else if (_headerFlag) {
			$('#tip').html('部门签批人不能为空');
		} else if (_natureFlag) {
			$('#tip').html('请选择施工性质');
		} else if (_addressFlag) {
			$('#tip').html('施工地点不能为空');
		} else if (_countFlag) {
			$('#tip').html('数量不能为空');
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