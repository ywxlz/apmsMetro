$(document).ready(function() {/*
	$('#loginSubmit').click(function(){
		alert('111');
		var _username = $('#username').val();
		var _password = $('#password').val();
		
		$.ajax({
			type: 'POST',
			url: 'loginAction',
			async: false, 
			
			data: {
				'username' : _username,
				'password' : _password
			} ,
			success: function(data){
				$('#loginConfirm_1').show();
				$('#registerConfirm_1').show();
				$('#logoutConfirm_1').show();
			} ,
			error:function(XMLResponse){
				alert(XMLResponse.responseText)
			} ,
			dataType:'json'
		});
	});*/
});