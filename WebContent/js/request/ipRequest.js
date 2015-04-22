$(document).ready(function() {
	//判断表单是否为空标志
	var _countFlag = true;
	
	//
	$('#count').blur(function(){
		if (isNaN($('#count').val())) {
			$("#tip").html('申请数量不能输入非数字<br />请重新输入');
			$('#count').val('');
		} else {
			_countFlag = false;
			$('#tip').html('');
		}
	});
	
	
	//申请日期
	var _timeFlag = true;
	$('#time').blur(function(){
		if ($('#time').val() == '') {
			$('#tip').html('请选择日期');
		} else {
			$('#tip').html('');
			_timeFlag = false;
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
	var _codeFlag = true;
	$('#code').blur(function(){
		if ($('#code').val() == '') {
			$('#tip').html('帐号负责人不能为空');
		} else {
			$('#tip').html('');
			_codeFlag = false;
		}
	});
	
	var _pinyinFlag = true;
	$('#pinyin').blur(function(){
		if ($('#pinyin').val() == '') {
			$('#tip').html('姓名全拼不能为空');
		} else {
			$('#tip').html('');
			_pinyinFlag = false;
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
		if (_countFlag) {
			$('#tip').html('申请数量不能输入非数字<br />请重新输入');
		} else if (_timeFlag) {
			$('#tip').html('请选择使用日期');
		} else if (_dateFlag) {
			$('#tip').html('请选择申请日期');
		} else if (_codeFlag) {
			$('#tip').html('网口号码不能为空');
		} else if (_addressFlag) {
			$('#tip').html('使用地点不能为空');
		} else if (_reasonFlag) {
			$('#tip').html('申请原因不能为空');
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