<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>邮箱申请单</title>
<link rel="stylesheet" type="text/css" href="../../css/table.css" />
<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<a href="../../index.jsp?no=2">返回首页</a>
	<div align="center">
		<p id="title">Email Request</p>
		<form id="form1" name="form1" method="post" action="addEmailAction">
			<table width="670">
				<tr>
					<td width="145"><div align="center">所属部门(处)</div></td>
					<td width="200">
						<label for="dept"></label>
						<div align="center">
							<select name="dept" id="dept">
								<s:iterator value="#session.dept" var="dept">
									<option value="<s:property value="id"/>"><s:property value="name"/></option>
								</s:iterator>
							</select>
						</div>
					</td>
					<td width="125"><div align="center">联系电话</div></td>
					<td width="200">
						<label for="phone"></label>
						<div align="center">
							<input type="text" name="phone" id="phone" />
						</div>
					</td>
				</tr>
				<tr>
					<td><div align="center">帐号负责人</div></td>
					<td>
						<label for="principal"></label>
						<div align="center">
							<input type="text" name="principal" id="principal" />
						</div>
					</td>
					<td><div align="center">人员编号</div></td>
					<td>
						<label for="number"></label>
						<div align="center">
							<input type="text" name="number" id="number" />
						</div>
					</td>
				</tr>
				<tr>
					<td><div align="center">空间需求</div></td>
					<td>
						<label for="space"></label>
						<div align="center">
							<input type="text" name="space" id="space" />
						</div>
					</td>
					<td><div align="center">办公地点</div></td>
					<td>
						<label for="address"></label>
						<div align="center">
							<input type="text" name="address" id="address" />
						</div>
					</td>
				</tr>
				<tr>
					<td><div align="center">使用人姓名</div></td>
					<td>
						<label for="username"></label>
						<div align="center">
							<input type="text" name="username" id="username" value="<s:property value="#session.username" />" readonly="readonly" style="color: red;" />
						</div>
					</td>
					<td><div align="center">姓名全拼</div></td>
					<td>
						<label for="pinyin"></label>
						<div align="center">
							<input type="text" name="pinyin" id="pinyin" />
						</div>
					</td>
				</tr>
				<tr>
					<td style="height: 29px;" colspan="4">
						<p align="center">
							<label> 
								<input type="radio" name="status" value="新增" id="status_0" /> 
								新增
							</label> 
							<label> 
								<input type="radio" name="status" value="更改" id="status_1" /> 
								更改
							</label>
						</p>
					</td>
				</tr>
				<tr>
					<td><div align="center">使用期限</div></td>
					<td colspan="3"><label for="time"></label>
						<div align="center">
							<input style="width: 530px;" type="text" name="time" id="time" readonly="readonly" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
						</div>
					</td>
				</tr>
				<tr>
					<td><div align="center">申请(更改)原因</div></td>
					<td colspan="3"><label for="reason"></label>
						<div align="center">
							<textarea name="reason" id="reason" cols="65" rows="5"></textarea>
						</div>
					</td>
				</tr>
			</table>
			<p>
				<input type="submit" name="button" id="button_00" class="submit" value="提交" style="display: none;" /> 
				<input type="button" name="button" id="button_01" class="submit" value="提交" /> 
				<input type="reset" name="reset" id="reset" value="重置" />
			</p>
		</form>
		<p>&nbsp;</p>
		<p>&nbsp;</p>
	</div>
	<div id="tip" class="tip">
		
	</div>
	<!-- 最后加载js提高性能 -->
	<script type="text/javascript" src="../../js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="../../js/request/emailRequest.js"></script>
</body>
</html>