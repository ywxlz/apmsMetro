$(document).ready(function() {
    //点击图片更换验证码
    $("#securityCode").click(function(){
        $(this).attr("src","SecurityCodeImageAction?timestamp="+new Date().getTime());
    });
    
    $('#registerEnter').click(function(){
    	//从登陆跳转到注册
    	$('#registerDiv').show();
    	$('#loginDiv').hide();
    	$('#login_item_0').removeClass().addClass('resp-tab-item');	//login_item_0
    	$('#login_item_1').addClass('resp-tab-item resp-tab-active');	//login_item_0
    });
    
    $('#loginEnter').click(function(){
    	//从注册跳转到登陆
    	$('#registerDiv').hide();
    	$('#loginDiv').show();
    	$('#login_item_1').removeClass().addClass('resp-tab-item');	//login_item_0
    	$('#login_item_0').addClass('resp-tab-item resp-tab-active');	//login_item_0
    });
    
    $('#login_item_0').click(function(){
    	//当点击登陆按钮的时候隐藏注册
    	$('#registerDiv').hide();
    	$('#logoutDiv').hide();
    });
    
    $('#login_item_1').click(function(){
    	//当点击注册按钮的时候隐藏注册
    	$('#loginDiv').hide();
    	$('#logoutDiv').hide();
    });
    
    $('#login_item_2').click(function(){
    	//当点击注销按钮的时候隐藏注册
    	$('#registerDiv').hide();
    	$('#loginDiv').hide();
    });
    
    //从注销前往登陆
    $('#logoutTologinButton').click(function(){
    	//从注册跳转到登陆
    	$('#registerDiv').hide();
    	$('#loginDiv').show();
    	$('#logoutDiv').show();
    	$('#login_item_1').removeClass().addClass('resp-tab-item');	//login_item_0
    	$('#login_item_2').removeClass().addClass('resp-tab-item');	//login_item_0
    	$('#login_item_0').addClass('resp-tab-item resp-tab-active');	//login_item_0
    });
    
    //图片提示隐藏
    $('#temp_img_01').click(function(){
    	$('.temp_text_00').hide();
    	$('.temp_text_01').hide();
    	$('.temp_text_02').hide();
    	$('.temp_text_03').hide();
    	$('.temp_text_04').hide();
    	$('.temp_text_05').hide();
    	$('.temp_text_06').hide();
    });
    $('#temp_img_02').click(function(){
    	$('.temp_text_00').hide();
    	$('.temp_text_01').hide();
    	$('.temp_text_02').hide();
    	$('.temp_text_03').hide();
    	$('.temp_text_04').hide();
    	$('.temp_text_05').hide();
    	$('.temp_text_06').hide();
    });
    $('#temp_img_03').click(function(){
    	$('.temp_text_00').hide();
    	$('.temp_text_01').hide();
    	$('.temp_text_02').hide();
    	$('.temp_text_03').hide();
    	$('.temp_text_04').hide();
    	$('.temp_text_05').hide();
    	$('.temp_text_06').hide();
    });
    $('#temp_img_04').click(function(){
    	$('.temp_text_00').hide();
    	$('.temp_text_01').hide();
    	$('.temp_text_02').hide();
    	$('.temp_text_03').hide();
    	$('.temp_text_04').hide();
    	$('.temp_text_05').hide();
    	$('.temp_text_06').hide();
    });
    $('#temp_img_05').click(function(){
    	$('.temp_text_00').hide();
    	$('.temp_text_01').hide();
    	$('.temp_text_02').hide();
    	$('.temp_text_03').hide();
    	$('.temp_text_04').hide();
    	$('.temp_text_05').hide();
    	$('.temp_text_06').hide();
    });
    $('#temp_img_06').click(function(){
    	$('.temp_text_00').hide();
    	$('.temp_text_01').hide();
    	$('.temp_text_02').hide();
    	$('.temp_text_03').hide();
    	$('.temp_text_04').hide();
    	$('.temp_text_05').hide();
    	$('.temp_text_06').hide();
    });
    $('#temp_img_07').click(function(){
    	$('.temp_text_00').hide();
    	$('.temp_text_01').hide();
    	$('.temp_text_02').hide();
    	$('.temp_text_03').hide();
    	$('.temp_text_04').hide();
    	$('.temp_text_05').hide();
    	$('.temp_text_06').hide();
    });
    //图片提示结束
    
    //从用户管理进入登陆页面
    $('#userManagerToLogin').click(function(){
    	$('#menu-2').hide();
    	$('#menu-4').show();
    });
    
    //申请单进入登陆
    $('#requestToLogin').click(function(){
    	$('#menu-3').hide();
    	$('#menu-4').show();
    });
    
    //登陆跳转到登出
    $('#loginToLogout').click(function(){
    	$('#logoutDiv').show();
    	$('#loginDiv').hide();
    	$('#login_item_0').removeClass().addClass('resp-tab-item');	//login_item_0
    	$('#login_item_2').addClass('resp-tab-item resp-tab-active');	//login_item_0
    });
    
    //登陆进入申请单
    $('#loginToRequest').click(function(){
    	$('#menu-4').hide();
    	$('#menu-3').show();
    });
    
    //登陆重置将所有提示清除
    $('#loginReset').click(function(){
    	$('#loginTip').html('');
    });
    
    
    //注册重置将所有提示清除
    $('#registerReset').click(function(){
    	$('#registerTip').html('');
    });
    
    //注册转到注销
    $('#registerToLogout').click(function(){
    	$('#logoutDiv').show();
    	$('#registerDiv').hide();
    	$('#login_item_1').removeClass().addClass('resp-tab-item');	//login_item_0
    	$('#login_item_2').addClass('resp-tab-item resp-tab-active');	//login_item_0
    });
    
  //注册进入申请单
    $('#registerToRequest').click(function(){
    	$('#menu-4').hide();
    	$('#menu-3').show();
    });
    
    //用户资料编辑
    $('#editBtn').click(function(){
		$('#table3').hide();
		$('#editBtn').hide();
		$('#editForm').show();
	});
    
});