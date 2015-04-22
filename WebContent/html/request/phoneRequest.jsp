<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电话会议申请单</title>
<link rel="stylesheet" type="text/css" href="../../css/table.css" />
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<a href="../../index.jsp?no=2">返回首页</a>
	<form id="form1" name="form1" method="post" action="addPhoneAction">
		<p align="center" id="title">Phone Meeting Request</p>
		<div align="center">
			<table>
				<tr>
					<td colspan="2" width="125px"><div align="center">申请部门</div></td>
					<td width="200px">
						<label for="dept"></label> 
						<select name="dept" id="dept">
							<s:iterator value="#session.dept" var="dept">
								<option value="<s:property value="id"/>"><s:property value="name"/></option>
							</s:iterator>
						</select>
					</td>
					<td width="125px"><div align="center">申请人</div></td>
					<td width="200px">
						<label for="user"></label> 
						<input type="text" name="username" id="username" value="<s:property value="#session.username" />" readonly="readonly" style="color: red;" />
					</td>
				</tr>
				<tr>
					<td colspan="2"><div align="center">开会日期</div></td>
					<td>
						<label for="date"></label> 
						<input type="text" name="date" id="date" readonly="readonly" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
					</td>
					<td><div align="center">会议室</div></td>
					<td>
						<label for="room"></label> 
						<input type="text" name="room" id="room" />
					</td>
				</tr>
				<tr>
					<td colspan="2"><div align="center">联系电话</div></td>
					<td>
						<label for="phone"></label> 
						<input type="text" name="phone" id="phone" />
					</td>
					<td><div align="center">需要会议设备</div></td>
					<td>
						<label> 
							<input type="radio" name="device" value="是" id="device_0" /> 
							需要
						</label> 
						<label> 
							<input type="radio" name="device" value="否" id="device_1" /> 
							不需要
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="2"><div align="center">参会方数</div></td>
					<td colspan="3" style="padding-left: 20px;height: 29px;">
						<label for="count"></label> 
						<input style="height: 20px; width: 30px; border-bottom: 1px solid black;text-align: center;" type="text" name="count" id="count" /> 方
					</td>
				</tr>
				<tr>
					<td rowspan="2"><div align="center">开会时间</div></td>
					<td><div align="center">开始</div></td>
					<td colspan="3">
						<label for="startTime"></label> 
						<input style="width: 525px;" type="text" name="startTime" id="startTime" readonly="readonly" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
					</td>
				</tr>
				<tr>
					<td><div align="center">结束</div></td>
					<td colspan="3">
						<label for="endTime"></label> 
						<input style="width: 525px;" type="text" name="endTime" id="endTime" readonly="readonly" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
					</td>
				</tr>
				<tr>
					<td colspan="2"><div align="center">特殊要求</div></td>
					<td colspan="4">
						<label for="remark"></label> 
						<textarea name="remark" id="remark" cols="65" rows="5"></textarea>
					</td>
				</tr>
			</table>
		</div>
		<p align="center">
			<input type="submit" name="button" id="button_00" class="submit" value="提交" style="display: none;" /> 
			<input type="button" name="button" id="button_01" class="submit" value="提交" /> 
			<input type="reset" name="reset" id="reset" value="重置" />
		</p>
	</form>
	<div id="tip" class="tip">
		
	</div>
	<!-- 最后加载js提高性能 -->
	<script type="text/javascript" src="../../js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="../../js/request/phoneRequest.js"></script>
</body>
</html>