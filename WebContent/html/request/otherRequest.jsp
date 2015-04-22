<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Other 申请单</title>
<link rel="stylesheet" type="text/css" href="../../css/table.css" />
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<a href="../../index.jsp?no=2">返回首页</a>
	<div align="center">
		<p id="title">Other Request</p>
		<form id="form1" name="form1" method="post" action="addOtherAction">
			<table width="650">
				<tr>
					<td width="125"><div align="center">申请人</div></td>
					<td width="200">
						<label for="username"></label> 
						<input type="text" name="username" id="username" value="<s:property value="#session.username" />" readonly="readonly" style="color: red;" />
					</td>
					<td width="125"><div align="center">申请部门</div></td>
					<td width="200">
						<label for="dept"></label> 
						<select name="dept" id="dept">
							<s:iterator value="#session.dept" var="dept">
								<option value="<s:property value="id"/>"><s:property value="name"/></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td width="125"><div align="center">申请时间</div></td>
					<td width="200">
						<label for="date"></label> 
						<input type="text" name="date" id="date" readonly="readonly" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
					</td>
					<td width="125"><div align="center">联系电话</div></td>
					<td width="200">
						<label for="phone"></label> 
						<input type="text" name="phone" id="phone" />
					</td>
				</tr>
				<tr>
					<td><div align="center">问<br />题<br />描<br />述</div></td>
					<td colspan="3">
						<label for="reason"></label> 
						<textarea name="reason" id="reason" cols="65" rows="10"></textarea>
					</td>
				</tr>
			</table>
			<p>
				<input type="submit" name="button" id="button_00" class="submit" value="提交" style="display: none;" /> 
				<input type="button" name="button" id="button_01" class="submit" value="提交" />  
				<input type="reset" name="button" id="button" value="重置" />
			</p>
		</form>
		<p></p>
		<p></p>
	</div>
	<div id="tip" class="tip">
		
	</div>
	<!-- 最后加载js提高性能 -->
	<script type="text/javascript" src="../../js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="../../js/request/otherRequest.js"></script>
</body>
</html>