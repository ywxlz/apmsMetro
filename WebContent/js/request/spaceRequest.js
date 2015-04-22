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
	var _spaceFlag = true;
	$('#space').blur(function(){
		if ($('#space').val() == '') {
			$('#tip').html('需求空间不能为空');
		} else {
			$('#tip').html('');
			_spaceFlag = false;
		}
	});
	
	//申请日期
	var _timeFlag = true;
	$('#time').blur(function(){
		if ($('#time').val() == '') {
			$('#tip').html('请选择使用期限');
		} else {
			$('#tip').html('');
			_timeFlag = false;
		}
	});
	
	//数量
	var _peopleFlag = true;
	$('#people').blur(function(){
		if ($('#people').val() == '') {
			$('#tip').html('部门接口人不能为空');
		} else {
			$('#tip').html('');
			_peopleFlag = false;
		}
	});
	
	//备注
	var _reasonFlag = true;
	$('#reason').blur(function(){
		if ($('#reason').val() == '') {
			$('#tip').html('原因不能为空<br />没有请填‘无’');
		} else {
			$('#tip').html('');
			_reasonFlag = false;
		}
	});
	
	//备注
	var _permissionsFlag = true;
	$('#permissions').blur(function(){
		if ($('#permissions').val() == '') {
			$('#tip').html('权限不能为空<br />没有请填‘无’');
		} else {
			$('#tip').html('');
			_permissionsFlag = false;
		}
	});
	
	//备注
	var _remarkFlag = true;
	$('#remark').blur(function(){
		if ($('#remark').val() == '') {
			$('#tip').html('特殊要求不能为空<br />没有请填‘无’');
		} else {
			$('#tip').html('');
			_remarkFlag = false;
		}
	});
	
	//什么都没填直接提交提示错误
	$('#button_01').click(function(){
		if (_phoneFlag) {
			$('#tip').html('电话号码格式不正确<br />请重新输入');
		} else if (_spaceFlag) {
			$('#tip').html('需求空间不能为空');
		} else if (_timeFlag) {
			$('#tip').html('请选择使用期限');
		} else if (_peopleFlag) {
			$('#tip').html('部门接口人不能为空');
		} else if (_reasonFlag) {
			$('#tip').html('原因不能为空<br />没有请填‘无’');
		} else if (_permissionsFlag) {
			$('#tip').html('权限不能为空<br />没有请填‘无’');
		} else if (_remarkFlag) {
			$('#tip').html('特殊要求不能为空<br />没有请填‘无’');
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