<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <head>
    <title>申请单审批管理系统</title>
    <meta name="description" content="" />
    <meta name="author" content="templatemo">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    
    <!--引用百度地图API-->
	<style type="text/css">
	    html,body{margin:0;padding:0;}
	    .iw_poi_title {color:#CC5522;font-size:14px;font-weight:bold;overflow:hidden;padding-right:13px;white-space:nowrap}
	    .iw_poi_content {font:12px arial,sans-serif;overflow:visible;padding-top:4px;white-space:-moz-pre-wrap;word-wrap:break-word}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.1&services=true"></script>
    
    <link href="css/user/login.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/templatemo_misc.css">
   	<link type="text/css" rel="stylesheet" href="css/easy-responsive-tabs.css" />
    <link href="css/templatemo_style.css" rel="stylesheet"> 
    
    <script src="js/jquery-2.1.3.js"></script> 
	<script type="text/javascript" src="js/user/userAction.js"></script>
	<script src="js/jquery-1.10.2.min.js"></script> 
	<script src="js/jquery.lightbox.js"></script>
	<script src="js/templatemo_custom.js"></script>
	<script src="js/index.js"></script> 
    <script src="js/easyResponsiveTabs.js" type="text/javascript"></script>  
     <script>
    function showhide()
    {
        var div = document.getElementById("newpost");
		if (div.style.display !== "none") 
		{
			div.style.display = "none";
		}
		else 
		{
			div.style.display = "block";
		}
    }
  </script>
  </head>
  <body>
    	<!-- logo start -->
    <div class="logocontainer">
    	<div class="row">
        	<h1 style="margin-top: 20px;padding-top: 0px;"><a href="index.jsp">申请单审批管理系统</a></h1>
            <div class="clear"></div>
            <div class="templatemo_smalltitle"></div>
       </div>
    </div>
    <!-- logo end -->    
   <div id="menu-container" class="main_menu">
   <!-- homepage start -->
    <div class="content homepage" id="menu-1">
  	<div class="container">
          	<div class="col-md-3 col-sm-6 templatemo_leftgap">
            	<div class="templatemo_mainservice templatemo_botgap">
                	<div class="templatemo_link"><a class="show-2 templatemo_page2" href="#">用户管理</a></div>
                	
                </div>
                <div class="templatemo_mainimg"><img src="images/templatemo_home1.jpg" alt="home img 01"></div>
            </div>
            <div class="col-md-3 col-sm-6 templatemo_leftgap">
            	<div class="templatemo_mainimg templatemo_botgap templatemo_portfotopgap"><img src="images/templatemo_home2.jpg" alt="home img 02"></div>
                <div class="templatemo_mainportfolio">
                      <div class="templatemo_link"><a class="show-3 templatemo_page3" href="#">申请单</a></div>
                	                   
                </div>
            </div>
            <div class="col-md-3 col-sm-6 templatemo_leftgap">
            	<div class="templatemo_maintesti templatemo_botgap templatemo_topgap">
                	<div class="templatemo_link"><a class="show-4 templatemo_page4" href="#">登陆/注册</a></div>
                </div>
                <div class="templatemo_mainimg"><img src="images/templatemo_home3.jpg" alt="home img 03"></div>
            </div>
            <div class="col-md-3 col-sm-6 templatemo_leftgap">
            	<div class="templatemo_mainimg templatemo_botgap templatemo_topgap">
             	   <img src="images/templatemo_home4.jpg" alt="home img 04">
                </div>
                <div class="templatemo_mainabout templatemo_botgap">
                	<div class="templatemo_link"><a class="show-5 templatemo_page5" href="#">关于我们</a></div>
                </div>
                <div class="templatemo_maincontact">
                	<div class="templatemo_link"><a class="show-6 templatemo_page6" href="#">联系我们</a></div>
                </div>
            </div>
    </div>
    
   </div>
    <!-- homepage end -->
    <!--services start -->
   <div class="content services" id="menu-2">
		<div class="container">
        	<div class="row templatemo_bordergapborder">
            	<div class="col-md-3 col-sm-12 templatemo_leftgap">
                	<div class="templatemo_mainimg templatemo_botgap">
                		<a href="html/admin/login.jsp">
                			<img src="images/templatemo_service1.jpg" alt="service image" />
                			<font id="adminEnter">管理员入口</font>
                		</a>
                	</div>
                    <div class="templatemo_mainservice templatemo_botgap">
                	<div class="templatemo_linkservice"><a class="show-1 templatemo_homeservice" href="#">返  回</a></div>
                </div>
                </div>
                
                <div class="templatemo_col37 col-sm-12 templatemo_leftgap">
                	<div class="templatemo_graybg">
                    <div class="templatemo_frame">
                	<h2>用户管理</h2>
                    <div class="clear"></div>
                    <s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                    	<div id="noneLogin">
	                    	还未登陆,请前往<font id="userManagerToLogin">登陆</font>!
						</div>
                    </s:if>
                    <s:else>
                    	<div id="logined">
				        	<table cellspacing="1" cellpadding="4" width="100%" class="tableborder" id="table3">
								<tr>
									<td colspan="15" class="header"></td>
								</tr>
								<tr>
									<td align="center"><b>用户名</b></td>
									<td><s:property value="#session.userInfoList[0].username" /></td>
								</tr>
								<tr>
									<td align="center"><b>真实姓名</b></td>
									<td><s:property value="#session.userInfoList[0].realName" /></td>
								</tr>
								<tr>
									<td align="center"><b>部门</b></td>
									<td><s:property value="#session.userInfoList[1].name" /></td>
								</tr>
								<tr>
									<td align="center"><b>角色</b></td>
									<td><s:property value="#session.userInfoList[2].name" /></td>
								</tr>
							</table>
							<br />
							<div align="center"><button id="editBtn">编辑</button></div>
							<form action="userInfoEditAction" method="post" id="editForm" style="display: none;">
								<table cellspacing="1" cellpadding="4" width="100%" class="tableborder">
									<tr>
										<td colspan="15" class="header"></td>
									</tr>
									<tr>
										<td align="center"><b>用户名</b></td>
										<td><input type="text" name="username" id="editUsername" value="<s:property value="#session.userInfoList[0].username" />" /></td>
									</tr>
									<tr>
										<td align="center"><b>真实姓名</b></td>
										<td><input type="text" name="realName" value="<s:property value="#session.userInfoList[0].realName" />" /></td>
									</tr>
									<tr>
										<td align="center"><b>密码</b></td>
										<td><input type="text" name="password" value="<s:property value="#session.userInfoList[0].password" />" /></td>
									</tr>
									<tr>
										<td align="center"><b>部门</b></td>
										<td><input type="text" readonly="readonly" name="dept" value="<s:property value="#session.userInfoList[1].name" />" /></td>
									</tr>
									<tr>
										<td align="center"><b>角色</b></td>
										<td><input type="text" readonly="readonly" name="role" value="<s:property value="#session.userInfoList[2].name" />" /></td>
									</tr>
								</table>
								<input type="hidden" name="id" value="<s:property value="#session.userInfoList[0].id" />" />
								<div align="center"><input type="submit" id="editBtn" value="提交" /></div>
							</form>
						</div>
                    </s:else>
                    </div>
               	  </div>
              </div>
               <div class="templatemo_col37 col-sm-12 templatemo_leftgap templatemo_topgap">
                	<div class="templatemo_mainimg templatemo_botgap"><img src="images/templatemo_service2.jpg" alt="service image"></div>
                	<div id="editTip"></div>
                </div>
            </div>
        </div>
     </div>
	    
    <!-- services end -->	

	<!-- portfilio start -->
    <div class="portfolio" id="menu-3" style="display: none;" >
    	<div class="container">
          	<div class="col-md-3 col-sm-6 templatemo_leftgap">
       	      <div class="templatemo_insideportfolio templatemo_botgap">
               	  <div class="templatemo_portfoliotext">
                	<h2>申请单</h2>
                    <div class="clear"></div>
					有六种类型申请单供你选择：<br />
					 1.通讯业务申请单<br />
					 2.电话会议申请单<br />
					 3.存储空间申请单<br />
					 4.邮件申请单<br />
					 5.IP申请单<br />
					 6.其他申请单
                  	</div>
              </div>
            	<div class="templatemo_portfolioback">
                	<div class="templatemo_link"><a class="show-1 templatemo_homeportfolio" href="#">返  回</a></div>
                </div>
                
            </div>
            <div class="col-md-3 col-sm-6 templatemo_leftgap">
                <div class="templatemo_botgap templatemo_portfotopgap gallery-item">
					<img src="images/portfolio/templatemo_portfolio01.jpg" alt="gallery 1">
					<!-- 判断登陆 -->
                		<div id="temp_text" class="temp_text_00">通讯业务申请单</div>
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                	</s:if>
                	<s:else>
						<div class="overlay">
							<a id="temp_img_01" href="images/portfolio/templatemo_portfolio01.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
						</div>
                	</s:else>
                	<!-- End -->
				</div>				
                <div class="templatemo_botgap templatemo_topgap gallery-item">
             	   <img src="images/portfolio/templatemo_portfolio02.jpg" alt="gallery 2">
             	   <!-- 判断登陆 -->
                		<div id="temp_text" class="temp_text_01">电话会议申请单</div>
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                	</s:if>
                	<s:else>
                   		<div class="overlay">
							<a id="temp_img_02" href="images/portfolio/templatemo_portfolio02.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
						</div>
                	</s:else>
                	<!-- End -->
                </div>
                <div class="templatemo_botgap templatemo_topgap gallery-item">
             	   <img src="images/portfolio/templatemo_portfolio03.jpg" alt="gallery 3">
             	   <!-- 判断登陆 -->
                		<div id="temp_text" class="temp_text_02">存储空间申请单</div>
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                	</s:if>
                	<s:else>
                   		<div class="overlay">
							<a id="temp_img_03" href="images/portfolio/templatemo_portfolio03.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
						</div>
                	</s:else>
                	<!-- End -->
                </div>
            </div>
            <div class="col-md-3 col-sm-6 templatemo_leftgap">
				<div class="templatemo_botgap templatemo_topgap gallery-item">
             	  	 <img src="images/portfolio/templatemo_portfolio04.jpg" alt="gallery 4">
             	  	 <!-- 判断登陆 -->
                		<div id="temp_text" class="temp_text_03">邮件申请单</div>
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                	</s:if>
                	<s:else>
                     	<div class="overlay">
							<a id="temp_img_04" href="images/portfolio/templatemo_portfolio04.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
						</div>
                	</s:else>
                	<!-- End -->
                </div>
                <div class="templatemo_botgap templatemo_topgap gallery-item">
             	   <img src="images/portfolio/templatemo_portfolio05.jpg" alt="gallery 5">
             	   <!-- 判断登陆 -->
                		<div id="temp_text" class="temp_text_04">IP申请单</div>
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                	</s:if>
                	<s:else>
                  		<div class="overlay">
							<a id="temp_img_05" href="images/portfolio/templatemo_portfolio05.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
						</div>
                	</s:else>
                	<!-- End -->
                </div>
                <div class="templatemo_botgap templatemo_topgap gallery-item">
             	   <img src="images/portfolio/templatemo_portfolio06.jpg" alt="gallery 6">
             	   <!-- 判断登陆 -->
                		<div id="temp_text" class="temp_text_05">其他申请单</div>
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                	</s:if>
                	<s:else>
	                   	<div class="overlay">
							<a id="temp_img_06" href="images/portfolio/templatemo_portfolio06.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
						</div>
                	</s:else>
                	<!-- End -->
                </div>
            </div>
            <div class="col-md-3 col-sm-6 templatemo_leftgap">
				<div class="templatemo_botgap templatemo_topgap gallery-item">
             	  	 <img src="images/portfolio/templatemo_portfolio07.jpg" alt="gallery 7">
             	  	 <!-- 判断登陆 -->
                		<div id="temp_text" class="temp_text_06">我的申请单</div>
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                	</s:if>
                	<s:else>
	                    <div class="overlay">
							<a id="temp_img_07" href="images/portfolio/templatemo_portfolio07.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
						</div>
                	</s:else>
                	<!-- End -->
                </div>
                
                <div class="templatemo_botgap templatemo_topgap gallery-item">
                	<!-- 判断登陆 -->
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                		<img id="requestToLogin" src="images/portfolio/templatemo_portfolio08.jpg" alt="gallery 8">
                	</s:if>
                	<!-- End -->
                </div>
                <!-- 没用到的申请单图片展示
                <div class="templatemo_botgap templatemo_topgap gallery-item">
             	   <img src="images/portfolio/templatemo_portfolio09.jpg" alt="gallery 9">
                   <div class="overlay">
								<a href="images/portfolio/templatemo_portfolio09.jpg" data-rel="lightbox" class="fa fa-arrows-alt"></a>
							</div>
                </div> 
                -->
            </div>
    </div>
    </div>
	 <!-- portfolio end -->
	 
	<!-- testimonial start -->
    <div class="content testimonial" id="menu-4">
    		    	<div class="container">
        	<div class="row templatemo_bordergapborder">
            <!--vertical Tabs-->
      		<div id="cmt">
            <div class="col-md-3 col-sm-12 templatemo_leftgap_about">
            <ul class="resp-tabs-list templatemo_testitab">
                <li id="login_item_0">登陆</li>
                <li id="login_item_1">注册</li>
                <li id="login_item_2">注销</li>
            </ul>
            <div class="templatemo_aboutlinkwrapper">
     		<div class="templatemo_link"><a class="show-1 templatemo_hometestimonial" href="index.jsp">返  回</a></div>
            </div>
            </div>
            <div class="resp-tabs-container templatemo_testicontainer">
                <div id="loginDiv">
                	<!-- 判断登陆 -->
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                		<div id="loginConfirm_0" class="templatemo_col50 templatemo_rightgap_about">
	                    	<div class="templatemo_graybg templatemo_botgap">
	                        <div class="templatemo_frame">
	                    	<h2>用户登陆</h2>
	                    		<!-- 登陆开始 -->
	                    		<form class="register" action="loginAction" method="post" onsubmit="return loginVali();">
									<br />
									
									<table id="loginTable">
										<tr>
											<td>用户名</td>
											<td colspan="2"><input id="username" type="text" name="username" placeholder="用户名" /></td>
										</tr>
										<tr>
											<td>密&nbsp;&nbsp;&nbsp;码</td>
											<td colspan="2"><input id="password" type="password" name="password" placeholder="密码" /></td>
										</tr>
										<tr>
											<td>验证码</td>
											<td style="width: 72px;"><input id="veriCode" type="text" name="veriCode" placeholder="验证码" /></td>
											<td><img id="securityCode" style="cursor:hand;" src="SecurityCodeImageAction" alt="看不清?换一张!" /></td>
										</tr>
									</table>
									<input id="loginSubmit" type="submit" value="登陆" />
									<input id="loginReset" type="reset" value="重置" />
									<br /><br /><br />					
									<div class="login">
										还没有账号?
										<font id="registerEnter">注册</font>一个.
									</div>
								</form>
								<!-- 登陆结束 -->
	                        </div>
	                        </div>
	                    </div>
                    </s:if>
                    <s:else>
                    	<div id="loginConfirm_1" class="templatemo_col50 templatemo_rightgap_about">
	                    	<div class="templatemo_graybg templatemo_botgap">
	                        <div class="templatemo_frame">
	                    	<h2>已经登陆</h2>
	                    		<form class="register">
	                    			<br />
	                    			欢迎您(<s:property value="#session.username" />),您已登录.
	                    			<br /><br /><br /><br />
	                    			<input id="loginToRequest" type="button" value="我要填写申请单" />
	                    			<br />
		                    		<input id="loginToLogout" type="button" value="我要注销" />
	                    		</form>
	                        </div>
	                        </div>
	                    </div>
                    </s:else>
                    <div class="templatemo_col50 templatemo_leftgap templatemo_botgap">
                    	<img src="images/templatemo_testimonial1.jpg" alt="testimonial image">
                    	<div id="loginTip"></div>
                    </div>
                </div>
                <div id="registerDiv">
                	<!-- 判断登陆 -->
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                		<div id="registerConfirm_0" class="templatemo_col50 templatemo_rightgap_about">
	                    	<div class="templatemo_graybg templatemo_botgap">
	                        <div class="templatemo_frame">
	                    	<h2>用户注册</h2>
	                    		<!-- 注册开始 -->
	                    		<form class="register" action="registerAction" method="post" onsubmit="return registerVali();">
									<br />
									
									<table id="registerTable">
										<tr>
											<td style="width: 66px;">用户名</td>
											<td><input id="registerUsername" type="text" name="registerUsername" placeholder="用户名" /></td>
										</tr>
										<tr>
											<td style="width: 66px;">真实姓名</td>
											<td><input id="registerRealName" type="text" name="registerRealName" placeholder="真实姓名" /></td>
										</tr>
										<tr>
											<td>密&nbsp;&nbsp;&nbsp;码</td>
											<td><input id="registerPassword" type="password" name="registerPassword" placeholder="密码" /></td>
										</tr>
										<tr>
											<td>确认密码</td>
											<td><input id="registerRePassword" type="password" name="registerRePassword" placeholder="确认密码" /></td>
										</tr>
									</table>
									<input id="registerSubmit" type="submit" value="注册" />
									<input id="registerReset" type="reset" value="重置" />
									<br /><br />				
									<div class="login">
										已经有账号?快去<font id="loginEnter">登陆</font>.
									</div>
								</form>
								<!-- 注册结束 -->
	                        </div>
	                        </div>
	                    </div>
                	</s:if>
                	<s:else>
                		<div id="registerConfirm_1" class="templatemo_col50 templatemo_rightgap_about">
	                    	<div class="templatemo_graybg templatemo_botgap">
	                        <div class="templatemo_frame">
	                    	<h2>确认注册</h2>
	                    		已经登陆,不能注册了,你可以注销之后再注册?或者去填写申请单?
	                    		<form class="register">
	                    			<br /><br /><br /><br />
									<input id="registerToRequest" type="button" value="填写申请单" /><br />
		                    		<input id="registerToLogout" type="button" value="我要去注销" />
	                    		</form>
	                        </div>
	                        </div>
	                    </div>
                	</s:else>
                	<!-- End -->
                    <div class="templatemo_col50 templatemo_leftgap templatemo_botgap">
                    	<img src="images/templatemo_testimonial2.jpg" alt="testimonial image">
                    	<div id="registerTip"></div>
                    </div>
                </div>
                <div id="logoutDiv">
                	<!-- 判断登陆 -->
                	<s:if test="#session.loginStatus == null || #session.loginStatus == ''">
                		<div id="logoutConfirm_0" class="templatemo_col50 templatemo_rightgap_about">
	                    	<div class="templatemo_graybg templatemo_botgap">
	                        <div class="templatemo_frame">
	                    	<h2>还未登陆</h2>
	                    		<form class="register">
	                    			<br /><br /><br /><br />
	                    			<br /><br />
		                    		<input id="logoutTologinButton" type="button" value="前往登陆" />
	                    		</form>
	                        </div>
	                        </div>
	                    </div>
                	</s:if>
                	<s:else>
                		<div id="logoutConfirm_1" class="templatemo_col50 templatemo_rightgap_about">
	                    	<div class="templatemo_graybg templatemo_botgap">
	                        <div class="templatemo_frame">
	                    	<h2>用户注销</h2>
	                    		<form class="register" action="logoutAction" method="post" onsubmit="return logoutVali();">
	                    			<br /><br /><br /><br />
	                    			<br /><br />
		                    		<input id="logoutButton" type="submit" value="注销" />
	                    		</form>
	                        </div>
	                        </div>
	                    </div>
                	</s:else>
                    <div class="templatemo_col50 templatemo_leftgap templatemo_botgap">
                    	<img src="images/templatemo_testimonial3.jpg" alt="testimonial image">
                    	<div id="logoutTip"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-12 templatemo_leftgap templatemo_aboutlinkwrapper1">
                	<div class="templatemo_aboutback templatemo_botgap">
                	<div class="templatemo_link"><a class="show-1 templatemo_hometestimonial" href="#">返  回</a></div>
                </div>
                </div>
    </div>
            </div>

    </div>
	 <!-- testimonial end -->
     <!-- about start -->
    <div class="content about" id="menu-5">
    	<div class="container">
        	<div class="row templatemo_bordergapborder">
            <!--vertical Tabs-->
      		<div id="ab">
            <div class="col-md-3 col-sm-12 templatemo_leftgap_about">
            <ul class="resp-tabs-list templatemo_tab">
                <li>我们的团队</li>
                <li>我们的历史</li>
                <li>我们的愿景</li>
            </ul>
            <div class="templatemo_aboutlinkwrapper">
     		<div class="templatemo_link"><a class="show-1 templatemo_homeabout" href="#">返  回</a></div>
            </div>
            </div>
            <div class="resp-tabs-container templatemo_aboutcontainer">
                <div>
                	<div class="templatemo_col50 templatemo_rightgap_about">
                    	<div class="templatemo_graybg templatemo_botgap">
                         <div class="templatemo_frame">
                    	<h2>我们的团队</h2>
                    	<p>
                    		111111111
                        </p>
                        </div>
                        </div>
                    </div>
                    <div class="templatemo_col50 templatemo_leftgap templatemo_botgap"><img src="images/templatemo_about.jpg" alt="about image"></div>
                </div>
                <div>
                	<div class="templatemo_col50 templatemo_rightgap_about">
                    	<div class="templatemo_graybg templatemo_botgap">
                        <div class="templatemo_frame">
                    	<h2>我们的历史</h2>
                    	<p>
                    		1111111111
                        </p>
                        </div>
                        </div>
                    </div>
                    <div class="templatemo_col50 templatemo_leftgap templatemo_botgap"><img src="images/templatemo_team.jpg" alt="history image"></div>
                </div>
                <div>
                	<div class="templatemo_col50 templatemo_rightgap_about">
                    	<div class="templatemo_graybg templatemo_botgap">
                        <div class="templatemo_frame">
                    	<h2>我们的愿景</h2>
                    	<p>
                    		111111111
                        </p>
                        </div>
                        </div>
                    </div>
                    <div class="templatemo_col50 templatemo_leftgap templatemo_botgap"><img src="images/templatemo_vision.jpg" alt="vision image"></div>
                </div>
            </div>
        </div>
			<div class="col-sm-12 templatemo_leftgap templatemo_aboutlinkwrapper1">
                	<div class="templatemo_aboutback templatemo_botgap">
                	<div class="templatemo_link"><a class="show-1 templatemo_homeabout" href="#">返  回</a></div>
                </div>
                </div>
    </div>
            </div>
    </div>
    <!-- about end -->
    <!-- contact start -->
    <div class="content contact" id="menu-6">
    	<div class="container">
        	<div class="row templatemo_bordergapborder">
            	<div class="col-md-3 col-sm-12 templatemo_leftgap">
                	<div class="templatemo_mainimg templatemo_botgap"><img src="images/templatemo_contact1.jpg" alt="contact image"></div>
                    <div class="templatemo_maincontact templatemo_botgap">
                	<div class="templatemo_linkcontact"><a class="show-1 templatemo_homecontact" href="#">返  回</a></div>
                </div>
                </div>
                
                <div class="templatemo_col37 col-sm-12 templatemo_leftgap">
                	<div class="templatemo_graybg templatemo_paddinggap">
                	<h2>联系我们</h2>
                    <div class="clear"></div>
                    	<form role="form" action="" method="post">
                          <div class="templatemo_form">
                            <input name="fullname" type="text" value="<s:property value="#session.username" />" class="form-control" id="fullname" placeholder="名字" maxlength="40">
                          </div>
                          <div class="templatemo_form">
                            <input name="email" type="text" class="form-control" id="email" placeholder="邮箱" maxlength="40">
                          </div>
                           <div class="templatemo_form">
                            <input name="subject" type="text" class="form-control" id="subject" placeholder="标题" maxlength="60">
                          </div>
                          <div class="templatemo_form">
                              <textarea name="message" class="form-control" id="message" placeholder="留言..."></textarea>
                          </div>
                          <div class="templatemo_form"><input type="submit" class="btn btn-primary" /></div>
            			</form>
               	  </div>
              </div>
                <div class="templatemo_col37 col-sm-12 templatemo_leftgap templatemo_topgap">
                	<div class="templatemo_graybg templatemo_paddinggap">
                    	<h2>我们的位置</h2>
                        <div class="clear"></div>
                        <div class="templatemo_contactmap">
		    					<div id="templatemo_map" style="background-color: white;">
		    						<div style="width:340px;height:280px;border:#ccc solid 1px;" id="dituContent"></div>
		    					</div>                        
        		        </div>
                        <div class="templatemo_address">
							桂林理工大学信息 科学与工程学院 计本2011-2班<br />
							电话: 110 <br />  
							邮箱: 123@glut.com
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
        <!-- contact end --> 
    
    </div>
    
    	<!-- logo start -->
    <div class="logocontainer">
    	<div class="row">
            <div class="templatemo_footer">Copyright © 2084 apms</div>
       </div>
    </div>
    <!-- logo end -->  
    <script type="text/javascript">
    //初始化加载
    window.onload = function(){
    	var Ohref=window.location.href;
    	var arrhref=Ohref.split("?no=");
    	var no = arrhref[1];
    	if (no == '' || no == null || no == '0') {
			
		} else if (no == '1') {
			$('#menu-1').hide();
			$('#menu-2').show();
		} else if (no == '2') {
			$('#menu-1').hide();
			$('#menu-3').show();
		} else if (no == '3') {
			$('#menu-1').hide();
			$('#menu-4').show();
		} else if (no == '4') {
			$('#menu-1').hide();
			$('#menu-5').show();
		} else if (no == '5') {
			$('#menu-1').hide();
			$('#menu-6').show();
		}
    }
    
    //创建和初始化地图函数：
    function initMap(){
        createMap();//创建地图
        setMapEvent();//设置地图事件
        addMapControl();//向地图添加控件
        addMarker();//向地图中添加marker
    }
    
    //创建地图函数：
    function createMap(){
        var map = new BMap.Map("dituContent");//在百度地图容器中创建一个地图
        var point = new BMap.Point(0.308153,25.070164);//定义一个中心点坐标
        map.centerAndZoom(point,17);//设定地图的中心点和坐标并将地图显示在地图容器中
        window.map = map;//将map变量存储在全局
    }
    
    //地图事件设置函数：
    function setMapEvent(){
        map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
        map.enableScrollWheelZoom();//启用地图滚轮放大缩小
        map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
        map.enableKeyboard();//启用键盘上下左右键移动地图
    }
    
    //地图控件添加函数：
    function addMapControl(){
        //向地图中添加缩放控件
	var ctrl_nav = new BMap.NavigationControl({anchor:BMAP_ANCHOR_TOP_LEFT,type:BMAP_NAVIGATION_CONTROL_LARGE});
	map.addControl(ctrl_nav);
        //向地图中添加缩略图控件
	var ctrl_ove = new BMap.OverviewMapControl({anchor:BMAP_ANCHOR_BOTTOM_RIGHT,isOpen:1});
	map.addControl(ctrl_ove);
        //向地图中添加比例尺控件
	var ctrl_sca = new BMap.ScaleControl({anchor:BMAP_ANCHOR_BOTTOM_LEFT});
	map.addControl(ctrl_sca);
    }
    
    //标注点数组
    var markerArr = [{title:"我们在这",content:"桂林理工大学",point:"110.308117|25.070213",isOpen:1,icon:{w:21,h:21,l:0,t:0,x:6,lb:5}}
		 ];
    //创建marker
    function addMarker(){
        for(var i=0;i<markerArr.length;i++){
            var json = markerArr[i];
            var p0 = json.point.split("|")[0];
            var p1 = json.point.split("|")[1];
            var point = new BMap.Point(p0,p1);
			var iconImg = createIcon(json.icon);
            var marker = new BMap.Marker(point,{icon:iconImg});
			var iw = createInfoWindow(i);
			var label = new BMap.Label(json.title,{"offset":new BMap.Size(json.icon.lb-json.icon.x+10,-20)});
			marker.setLabel(label);
            map.addOverlay(marker);
            label.setStyle({
                        borderColor:"#808080",
                        color:"#333",
                        cursor:"pointer"
            });
			
			(function(){
				var index = i;
				var _iw = createInfoWindow(i);
				var _marker = marker;
				_marker.addEventListener("click",function(){
				    this.openInfoWindow(_iw);
			    });
			    _iw.addEventListener("open",function(){
				    _marker.getLabel().hide();
			    })
			    _iw.addEventListener("close",function(){
				    _marker.getLabel().show();
			    })
				label.addEventListener("click",function(){
				    _marker.openInfoWindow(_iw);
			    })
				if(!!json.isOpen){
					label.hide();
					_marker.openInfoWindow(_iw);
				}
			})()
        }
    }
    //创建InfoWindow
    function createInfoWindow(i){
        var json = markerArr[i];
        var iw = new BMap.InfoWindow("<b class='iw_poi_title' title='" + json.title + "'>" + json.title + "</b><div class='iw_poi_content'>"+json.content+"</div>");
        return iw;
    }
    //创建一个Icon
    function createIcon(json){
        var icon = new BMap.Icon("http://app.baidu.com/map/images/us_mk_icon.png", new BMap.Size(json.w,json.h),{imageOffset: new BMap.Size(-json.l,-json.t),infoWindowOffset:new BMap.Size(json.lb+5,1),offset:new BMap.Size(json.x,json.h)})
        return icon;
    }
    
    initMap();//创建和初始化地图
</script>
   <script type="text/javascript">
    $(document).ready(function () {
        $('#horizontalTab').easyResponsiveTabs({
            type: 'default', //Types: default, vertical, accordion
            width: 'auto', //auto or any width like 600px
            fit: true, // 100% fit in a container
            closed: 'accordion', // Start closed if in accordion view
            activate: function(event) { // Callback function if tab is switched
                var $tab = $(this);
                var $info = $('#tabInfo');
                var $name = $('span', $info);

                $name.text($tab.text());

                $info.show();
				
            }
        });

        $('#ab').easyResponsiveTabs({
            type: 'vertical',
            width: 'auto',
            fit: true,
        });
		

		$('#cmt').easyResponsiveTabs({
            type: 'vertical',
            width: 'auto',
            fit: true,
        });
    });
    
    var _flag = false;
	
	//验证验证码
    $('#veriCode').keyup(function(){
    	var _veriCode = $('#veriCode').val();
    	$.ajax({
			type: 'POST',
			url: 'valiCode',
			async: false, 
			data: {
				'veriCode' : _veriCode
			} ,
			success: function(data){
				if (data.flag == 'true') {
					$('#loginTip').html('');
					_flag = true;
				} else {
					$('#loginTip').html('验证码错误!');
				}
			} ,
			error:function(XMLResponse){
				alert(XMLResponse.responseText)
			} ,
			dataType:'json'
		});
    });
    
    function loginVali(){
    	var _username = $('#username').val();
    	var _password = $('#password').val();
    	var _veriCode = $('#veriCode').val();
    	
    	if (_username == '' || _username == null) {
			$('#loginTip').html('用户名不能为空!');
			return false;
		} else if (_password == '' || _password == null) {
			$('#loginTip').html('密码不能为空!');
			return false;
		} else if (_veriCode == '' || _veriCode == null) {
    		$('#loginTip').html('验证码不能为空!');
			return false;
		} else if (!_flag) {
			$('#loginTip').html('验证码错误!');
			return false;
		} else {
			return true;
		}
    }
    
	var _registerFlag = true;
	
	//验证验证码
    $('#registerUsername').keyup(function(){
    	var _registerUsername = $('#registerUsername').val();
    	$.ajax({
			type: 'POST',
			url: 'valiUsername',
			async: false, 
			data: {
				'registerUsername' : _registerUsername
			} ,
			success: function(data){
				if (data.registerFlag) {
					$('#registerTip').html('');
					_registerFlag = false;
				} else {
					$('#registerTip').html('用户名已经存在!');
				}
			} ,
			error:function(XMLResponse){
				alert(XMLResponse.responseText)
			} ,
			dataType:'json'
		});
    });
	
  //验证验证码
    $('#editUsername').keyup(function(){
    	var _editUsername = $('#editUsername').val();
    	$.ajax({
			type: 'POST',
			url: 'valiUsername',
			async: false, 
			data: {
				'registerUsername' : _editUsername
			} ,
			success: function(data){
				if (data.registerFlag) {
					$('#editTip').html('');
					_registerFlag = false;
				} else {
					$('#editTip').html('用户名已经存在!');
				}
			} ,
			error:function(XMLResponse){
				alert(XMLResponse.responseText)
			} ,
			dataType:'json'
		});
    });
    
    
    function registerVali(){
    	// 判断如果两次输入密码是否
    	var _username = $('#registerUsername').val();
    	var _realName = $('#registerRealName').val();
    	var _password = $('#registerPassword').val();
    	var _rePassword = $('#registerRePassword').val();
    	alert(_registerFlag);
    	if (_username == '' || _username == null) {
			$('#registerTip').html('用户名不能为空!');
			return false;
		} else if (_password == '' || _password == null) {
			$('#registerTip').html('密码不能为空!');
			return false;
		} else if (_rePassword == '' || _rePassword == null) {
			$('#registerTip').html('确认密码不能为空!');
			return false;
		} else if (_password != _rePassword) {
    		$('#registerTip').html('两次输入密码不相同!');
			return false;
		} else if (_registerFlag) {
    		$('#registerTip').html('用户名已经存在!');
			return false;
		} else if (_username.length < 6) {
    		$('#registerTip').html('用户名不能小于6位!');
			return false;
		} else if (_password.length < 6) {
    		$('#registerTip').html('密码不能小于6位!');
			return false;
		} else {
			return true;
		}
    }
    
    function logoutVali(){
    	if ($('#logoutTologinButton').is(":hidden")) {
			//判断如果 logoutTologinButton 是隐藏的
			var _logoutTip = $('#logoutTip').html();
			if (_logoutTip == '' || _logoutTip == null) {
				$('#logoutTip').html('真的要注销吗？<br />确定注销请再次点击注销!');
				return false;
			} else {
				return true;
			}
		}
    }
</script>
  </body>
</html>