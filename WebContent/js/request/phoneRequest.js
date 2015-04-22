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
	var _dateFlag = true;
	$('#date').blur(function(){
		if ($('#date').val() == '') {
			$('#tip').html('请选择开会日期');
		} else {
			$('#tip').html('');
			_dateFlag = false;
		}
	});
	
	//申请日期
	var _startTimeFlag = true;
	$('#startTime').blur(function(){
		if ($('#startTime').val() == '') {
			$('#tip').html('请选择开始日期');
		} else {
			$('#tip').html('');
			_startTimeFlag = false;
		}
	});
	
	//申请日期
	var _endTimeFlag = true;
	$('#endTime').blur(function(){
		if ($('#endTime').val() == '') {
			$('#tip').html('请选择结束日期');
		} else {
			$('#tip').html('');
			_endTimeFlag = false;
		}
	});
	
	//施工性质
	var _deviceFlag = true;
	$('#device_0').click(function(){
		if ($('#device_0').val() == '') {
			$('#tip').html('请选是否需要设备支持');
		} else {
			$('#tip').html('');
			_deviceFlag = false;
		}
	});
	$('#device_1').click(function(){
		if ($('#device_1').val() == '') {
			$('#tip').html('请选是否需要设备支持');
		} else {
			$('#tip').html('');
			_deviceFlag = false;
		}
	});
	
	//施工地点
	var _roomFlag = true;
	$('#room').blur(function(){
		if ($('#room').val() == '') {
			$('#tip').html('会议室不能为空');
		} else {
			$('#tip').html('');
			_roomFlag = false;
		}
	});
	
	//数量
	var _countFlag = true;
	$('#count').blur(function(){
		if (isNaN($('#count').val())) {
			$('#tip').html('开会方数不能为非数字');
		} else {
			$('#tip').html('');
			_countFlag = false;
		}
	});
	
	//备注
	var _remarkFlag = true;
	$('#remark').blur(function(){
		if ($('#remark').val() == '') {
			$('#tip').html('特殊要求不能为空<br />如果没有请填‘无’');
		} else {
			$('#tip').html('');
			_remarkFlag = false;
		}
	});
	
	//什么都没填直接提交提示错误
	$('#button_01').click(function(){
		if (_phoneFlag) {
			$('#tip').html('电话号码格式不正确<br />请重新输入');
		} else if (_dateFlag) {
			$('#tip').html('请选择开会日期');
		} else if (_startTimeFlag) {
			$('#tip').html('请选择开始日期');
		} else if (_endTimeFlag) {
			$('#tip').html('请选择结束日期');
		} else if (_deviceFlag) {
			$('#tip').html('请选是否需要设备支持');
		} else if (_roomFlag) {
			$('#tip').html('会议室不能为空');
		} else if (_countFlag) {
			$('#tip').html('开会方数不能为非数字');
		} else if (_remarkFlag) {
			$('#tip').html('特殊要求不能为空<br />如果没有请填‘无’');
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