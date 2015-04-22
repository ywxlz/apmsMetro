<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Communications Business 申请单</title>
<link rel="stylesheet" type="text/css" href="../../css/table.css" />
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<a href="../../index.jsp?no=2">返回首页</a>
	<div align="center">
		<p id="title">Communications Business Request</p>
		<form id="form1" name="form1" method="post" action="addComRequestAction">
			<table width="650">
				<tr>
					<td width="125"><div align="center">申请人</div></td>
					<td width="200">
						<label for="username"></label>
						<input type="text" name="username" id="username" value="<s:property value="#session.username" />" readonly="readonly" style="color: red;" />
					</td>
					<td width="125"><div align="center">部   门</div></td>
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
					<td width="125"><div align="center">联系电话</div></td>
					<td width="200">
						<label for="phone"></label> 
						<input type="text" name="phone" id="phone" />
					</td>
					<td width="125"><div align="center">申请日期</div></td>
					<td width="200">
						<label for="date"></label> 
						<input type="text" name="date" id="date" readonly="readonly" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
					</td>
				</tr>
				<tr>
					<td width="125"><div align="center">完工期限</div></td>
					<td width="200" style="padding-left: 5px;">
						<label for="timeLimit"></label> 
						<input style="height: 20px; width: 100px; border-bottom: 1px solid black;" type="text" name="timeLimit" id="timeLimit" /> 个工作日
					</td>
					<td width="125"><div align="center">部门签批人</div></td>
					<td width="200">
						<label for="header"></label> 
						<input type="text" name="header" id="header" />
					</td>
				</tr>
				<tr>
					<td style="height: 29px;"><div align="center">施工性质</div></td>
					<td colspan="3">
						<label> 
							<input type="radio" name="nature" value="装机" id="nature_0" /> 
							装机
						</label> 
						<label> 
							<input type="radio" name="nature" value="移机" id="nature_1" /> 
							移机
						</label>
						<label> 
							<input type="radio" name="nature" value="串机" id="nature_2" /> 
							串机
						</label> 
						<label> 
							<input type="radio" name="nature" value="新增功能" id="nature_3" /> 
							新增功能
						</label>
					</td>
				</tr>
				<tr>
					<td width="125"><div align="center">施工地点</div></td>
					<td width="200" style="padding-left: 5px;">
						<label for="address"></label> 
						<input type="text" name="address" id="address" />
					</td>
					<td width="125"><div align="center">数量</div></td>
					<td width="200" style="padding-left: 5px;">
						<label for="count"></label> 
						<input style="height: 20px; width: 100px; border-bottom: 1px solid black;" type="text" name="count" id="count" /> 部
					</td>
				</tr>
				<tr id="natureText_01">
					<td id="natureTd" rowspan="4"><div id="natureTitle" align="center">通<br />讯<br />业<br />务</div></td>
					<td style="display: none;" id="natureTd_01"><div id="natureTitle_01" align="center">通讯业务</div></td>
					<td><div align="center">装机</div></td>
					<td colspan="2">
						<label for="reason"></label> 
						<textarea name="reason" id="reason" class="reason_00" cols="38" rows="3"></textarea>
					</td>
				</tr>
				<tr id="natureText_02">
					<td style="display: none;" id="natureTd_02"><div id="natureTitle_02" align="center">通讯业务</div></td>
					<td><div align="center">移机</div></td>
					<td colspan="2">
						<label for="reason"></label> 
						<textarea name="reason" id="reason" class="reason_01" cols="38" rows="3"></textarea>
					</td>
				</tr>
				<tr id="natureText_03">
					<td style="display: none;" id="natureTd_03"><div id="natureTitle_03" align="center">通讯业务</div></td>
					<td><div align="center">串机</div></td>
					<td colspan="2">
						<label for="reason"></label> 
						<textarea name="reason" id="reason" class="reason_02" cols="38" rows="3"></textarea>
					</td>
				</tr>
				<tr id="natureText_04">
					<td style="display: none;" id="natureTd_04"><div id="natureTitle_04" align="center">通讯业务</div></td>
					<td><div align="center">新增功能</div></td>
					<td colspan="2">
						<label for="reason"></label> 
						<textarea name="reason" id="reason" class="reason_03" cols="38" rows="3"></textarea>
					</td>
				</tr>
			</table>
			<p>
				<input type="submit" name="button" id="button_00" class="submit" value="提交" style="display: none;" /> 
				<input type="button" name="button" id="button_01" class="submit" value="提交" /> 
				<input type="reset" name="button" id="button_02" class="reset" value="重置" />
			</p>
		</form>
		<p></p>
		<p></p>
	</div>
	<div id="tip" class="tip">
		
	</div>
	<!-- 最后加载js提高性能 -->
	<script type="text/javascript" src="../../js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="../../js/request/comRequest.js"></script>
</body>
</html>