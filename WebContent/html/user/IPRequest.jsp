<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IP申请单</title>
<link rel="stylesheet" type="text/css" href="../admin/css/style_admin.css">
</head>
<body>
	<div class="body">
		<a href="javascript:;" onClick="javascript :history.back(-1);">返回上一页</a>
       	<br />
       	<div align="center"><h1>IP申请单</h1></div>
       	<table cellspacing="1" cellpadding="4" width="100%" class="tableborder" id="table3">
			<tr>
				<td class="altbg1"><div align="center">申请人</div></td>
				<td class="altbg2"><div align="center"><s:property value="#session.username" /></div></td>
				<td class="altbg1"><div align="center">部   门</div></td>
				<td class="altbg2"><div align="center"><s:property value="#session.requestDept.name" /></div></td>
			</tr>
			<tr>
				<td class="altbg1"><div align="center">申请日期</div></td>
				<td class="altbg2"><div align="center"><s:property value="#session.request.remark" /></div></td>
				<td class="altbg1"><div align="center">使用时间</div></td>
				<td class="altbg2"><div align="center"><s:property value="#session.request.time" /></div></td>
			</tr>
			<tr>
				<td class="altbg1"><div align="center">网口号码</div></td>
				<td class="altbg2"><div align="center"><s:property value="#session.request.appendix" /></div></td>
				<td class="altbg1"><div align="center">使用地点</div></td>
				<td class="altbg2"><div align="center"><s:property value="#session.IPRequest.address" /></div></td>
			</tr>
			<tr>
				<td class="altbg1"><div align="center">数量</div></td>
				<td class="altbg2"><div align="center"><s:property value="#session.IPRequest.count" /></div></td>
				<td class="altbg1"><div align="center">签批状态</div></td>
				<td class="altbg2">
					<div align="center">
						<font color="red">
							<s:if test="#session.request.state == 0">未审批</s:if>
							<s:if test="#session.request.state == 1">审批通过</s:if>
							<s:if test="#session.request.state == 2">审批未通过</s:if>
						</font>
					</div>
				</td>
			</tr>
			<tr>
				<td class="altbg1"><div align="center">申请原因</div></td>
				<td colspan="3" class="altbg2"><div align="center"><s:property value="#session.request.reason" /></div></td>
			</tr>
		</table>
       </div>
</body>
</html>