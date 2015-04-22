$(document).ready(function() {
	//判断表单是否为空标志
	var _phoneFlag = true;
	
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
	var _timeFlag = true;
	$('#time').blur(function(){
		if ($('#time').val() == '') {
			$('#tip').html('请选择日期');
		} else {
			$('#tip').html('');
			_timeFlag = false;
		}
	});
	
	//部门签批人
	var _principalFlag = true;
	$('#principal').blur(function(){
		if ($('#principal').val() == '') {
			$('#tip').html('帐号负责人不能为空');
		} else {
			$('#tip').html('');
			_principalFlag = false;
		}
	});
	
	//部门签批人
	var _numberFlag = true;
	$('#number').blur(function(){
		if ($('#number').val() == '') {
			$('#tip').html('编号不能为空');
		} else {
			$('#tip').html('');
			_numberFlag = false;
		}
	});
	
	//部门签批人
	var _spaceFlag = true;
	$('#space').blur(function(){
		if ($('#space').val() == '') {
			$('#tip').html('空间需求不能为空');
		} else {
			$('#tip').html('');
			_spaceFlag = false;
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
		} else if (_timeFlag) {
			$('#tip').html('请选择日期');
		} else if (_principalFlag) {
			$('#tip').html('帐号负责人不能为空');
		} else if (_numberFlag) {
			$('#tip').html('编号不能为空');
		} else if (_spaceFlag) {
			$('#tip').html('空间需求不能为空');
		}else if (_addressFlag) {
			$('#tip').html('办公地点不能为空');
		} else if (_pinyinFlag) {
			$('#tip').html('姓名全拼不能为空');
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