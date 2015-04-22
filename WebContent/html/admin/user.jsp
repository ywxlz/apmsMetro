<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
<head>        
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />    
    <title>后台管理</title>
    <link rel="icon" type="image/ico" href="favicon.ico"/>
    <!-- 时钟 -->
	<script src="clock/js/index.js"></script>
	<link rel='stylesheet prefetch'  href="clock/css/csshake.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style_admin.css">
	<style type="text/css">
		.clock{width:360px;height:120px;margin:0px;transform:translate(40%, -20%);color:#d96457;font-family:"Lato", sans-serif;}
		.clock div{position:relative;float:left;background:transparent;border-radius:6px;width:75px;height:80px;line-height:80px;text-align:center;font-size:50px;margin:0px;}
	</style>
    <link href="css/stylesheets.css" rel="stylesheet" type="text/css" />
    <link href="css/admin.css" rel="stylesheet" type="text/css" />
</head>
<body>    
    <div id="loader"><img src="img/loader.gif"/></div>
    <div class="wrapper">
        
        <div class="sidebar">
            
            <div class="top">
                <a href="index.jsp" class="logo"></a>
                <div class="admin">
                	欢迎您(<s:property value="#session.adminName" />),<font id="adminLogout">注销</font>
                </div>
            </div>
            <div class="nContainer">                
                <ul class="navigation">         
                    <li class="active"><a href="stateRequestAction" class="blblue">申请单审批</a></li>
                    <li>
                        <a href="#" class="blyellow">申请单查询</a>
                        <div class="open"></div>
                        <ul>
                        	<li><a href="queryRequestAction">所有申请单</a></li>
                            <li><a href="queryComRequestAction">通讯业务申请单</a></li>
                            <li><a href="queryPhoneRequestAction">电话会议申请单</a></li>
                            <li><a href="querySpaceRequestAction">存储空间申请单</a></li>
                            <li><a href="queryEmailRequestAction">邮件申请单</a></li>
                            <li><a href="queryIPRequestAction">IP申请单</a></li>
                            <li><a href="queryOtherRequestAction">其他申请单</a></li>
                        </ul>
                    </li>
                    <li><a href="queryUserAction" class="blgreen">用户管理</a></li>
                    <li><a href="adminInfoAction" class="blred">我的资料</a></li>
                </ul>
                <a class="close">
                    <span class="ico-remove"></span>
                </a>
            </div>
            <div class="widget">
                <div class="datepicker"></div>
            </div>
            <!-- 时钟 -->
			<div class='clock' 
				style="
				font:12px/180% Arial, Helvetica, sans-serif, '新宋体';
				display:block;
				outline:none;
				position:absolute;
				right:20px;
				top:580px;
				"
				>
				<div class='h shake shake-slow'></div>
				<div class='m shake shake-slow'></div>
				<div class='s shake shake-slow'></div>
			</div>
			<div>&nbsp;</div>
			<div>&nbsp;</div>
			<div>&nbsp;</div>
			<div>&nbsp;</div>
			<div>&nbsp;</div>
			<div>&nbsp;</div>
			<div>&nbsp;</div>
        </div>
        
        <div class="body">
        	<br /><br /><br /><br />
        	<table cellspacing="1" cellpadding="4" width="100%" class="tableborder" id="table3">
				<tr>
					<td colspan="15" class="header">用户管理</td>
				</tr>
				<tr>
					<td align="center" class="altbg1"><b>编号</b></td>
					<td align="center" class="altbg1"><b>用户名</b></td>
					<td align="center" class="altbg1"><b>真实姓名</b></td>
					<td align="center" class="altbg1"><b>部门</b></td>
					<td align="center" class="altbg1"><b>角色</b></td>
					<td align="center" class="altbg1"><b>操作</b></td>
				</tr>
				<s:if test="#session.userList == null">
					<tr>
						<td colspan="15" align="center">
							<h1>
								<font color="red">还没有申请单</font>
							</h1>
						</td>
					</tr>
				</s:if>
				<s:else>
					<s:iterator value="#session.userList" status="I">
						<s:if test="#I.index % 2 == 1">
							<tr id="odd">
								<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><s:property value="#I.index + 1" /></td>
								<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><s:property value="key.username" /></td>
								<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><a href="#"><s:property value="key.realName" /></a></td>
								<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:property value="value[#I.index * 2].name" /></font></td>
								<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><font><s:property value="value[#I.index * 2 + 1].name" /></font></td>
								<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><a>操作</a></td>
							</tr>
						</s:if>
						<s:else>
							<tr id="even">
								<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><s:property value="#I.index + 1" /></td>
								<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><s:property value="key.username" /></td>
								<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><a href="#"><s:property value="key.realName" /></a></td>
								<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:property value="value[#I.index * 2].name" /></font></td>
								<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><font><s:property value="value[#I.index * 2 + 1].name" /></font></td>
								<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><a>操作</a></td>
							</tr>
						</s:else>
						<tr></tr>
					</s:iterator>
		
					<tr valign="bottom" align="right">
						<td colspan="15" width="100%">&nbsp;&nbsp;&nbsp;&nbsp;
								${pageNo}/${totalPage}&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="AdminQueryNewsServlet?pageNo=1">首页</a>|
								<a href="AdminQueryNewsServlet?pageNo=${pageNo-1}">上一页</a>| 
								<a href="AdminQueryNewsServlet?pageNo=${pageNo+1}">下一页</a>|
								<a href="AdminQueryNewsServlet?pageNo=${totalPage}">尾页</a>
						</td>
					</tr>
				</s:else>
			</table>
        </div>
        
    </div>
    
    <div class="dialog" id="source" style="display: none;" title="Source"></div>
    
</body>



	<script type='text/javascript' src='js/plugins/jquery/jquery-1.9.1.min.js'></script>
    <script type='text/javascript' src='js/plugins/jquery/jquery-ui-1.10.1.custom.min.js'></script>
    <script type='text/javascript' src='js/plugins/jquery/jquery-migrate-1.1.1.min.js'></script>
    <script type='text/javascript' src='js/plugins/jquery/globalize.js'></script>
    <script type='text/javascript' src='js/plugins/other/excanvas.js'></script>
    
    <script type='text/javascript' src='js/plugins/other/jquery.mousewheel.min.js'></script>
        
    <script type='text/javascript' src='js/plugins/bootstrap/bootstrap.min.js'></script>
    
    <script type='text/javascript' src='js/plugins/cookies/jquery.cookies.2.2.0.min.js'></script>    
    
    <script type='text/javascript' src='js/plugins/jflot/jquery.flot.js'></script>    
    <script type='text/javascript' src='js/plugins/jflot/jquery.flot.stack.js'></script>    
    <script type='text/javascript' src='js/plugins/jflot/jquery.flot.pie.js'></script>
    <script type='text/javascript' src='js/plugins/jflot/jquery.flot.resize.js'></script>
    
    <script type='text/javascript' src='js/plugins/sparklines/jquery.sparkline.min.js'></script>        
    
    <script type='text/javascript' src='js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js'></script>
    
    <script type='text/javascript' src="js/plugins/uniform/jquery.uniform.min.js"></script>
    
    <script type='text/javascript' src='js/plugins/shbrush/XRegExp.js'></script>
    <script type='text/javascript' src='js/plugins/shbrush/shCore.js'></script>
    <script type='text/javascript' src='js/plugins/shbrush/shBrushXml.js'></script>
    <script type='text/javascript' src='js/plugins/shbrush/shBrushJScript.js'></script>
    <script type='text/javascript' src='js/plugins/shbrush/shBrushCss.js'></script>    
    
    <script type='text/javascript' src='js/plugins.js'></script>
    <script type='text/javascript' src='js/charts.js'></script>
    
    <script type='text/javascript' src='js/actions.js'></script>
    <script type='text/javascript' src='js/admin.js'></script>
</html>
