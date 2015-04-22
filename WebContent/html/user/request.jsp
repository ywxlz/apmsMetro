<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的申请单</title>
<link rel="stylesheet" type="text/css" href="../admin/css/style_admin.css">
</head>
<body>
	<a href="../../index.jsp?no=2">返回上一页</a>
	<table cellspacing="1" cellpadding="4" width="100%" class="tableborder" id="table3">
		<tr>
			<td colspan="15" class="header">申请单</td>
		</tr>
		<tr>
			<td align="center" class="altbg1"><b>编号</b></td>
			<td align="center" class="altbg1"><b>申请人</b></td>
			<td align="center" class="altbg1"><b>类型</b></td>
			<td align="center" class="altbg1"><b>电话</b></td>
			<td align="center" class="altbg1"><b>时间</b></td>
			<td align="center" class="altbg1"><b>状态</b></td>
			<td align="center" class="altbg1"><b>详情</b></td>
		</tr>
		<s:if test="#session.userRequest == null">
			<tr>
				<td colspan="15" align="center">
					<h1>
						<font color="red">还没有申请单</font>
					</h1>
				</td>
			</tr>
		</s:if>
		<s:else>
			<s:iterator value="#session.userRequest" var="request" status="I">
				<s:if test="#I.index % 2 == 1">
					<tr id="odd">
						<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><s:property value="#I.index + 1" /></td>
						<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><s:property value="#session.username" /></td>
						<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><a href="#"><s:property value="#session.typeList[#I.index].name" /></a></td>
						<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:property value="#request.phone" /></font></td>
						<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:property value="#request.time" /></font></td>
						<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:if test="#request.state == 0">未审批</s:if><s:if test="#request.state == 1">审批通过</s:if><s:if test="#request.state == 2">审批未通过</s:if></font></td>
						<td style="background-color: #e6e6fa;" class="altbg2" rowspan="2" align="center">
							<s:if test="#session.typeList[#I.index].name == '通讯业务申请单'">
								<a href="comRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '电话会议申请单'">
								<a href="phoneRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '存储空间申请单'">
								<a href="spaceRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '邮件申请单'">
								<a href="emailRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == 'IP申请单'">
								<a href="IPRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '其他申请单'">
								<a href="otherRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
						</td>
				</s:if>
				<s:else>
					<tr id="even">
						<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><s:property value="#I.index + 1" /></td>
						<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><s:property value="#session.username" /></td>
						<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><a href="#"><s:property value="#session.typeList[#I.index].name" /></a></td>
						<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:property value="#request.phone" /></font></td>
						<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:property value="#request.time" /></font></td>
						<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center"><font color="red"><s:if test="#request.state == 0">未审批</s:if><s:if test="#request.state == 1">审批通过</s:if><s:if test="#request.state == 2">审批未通过</s:if></font></td>
						<td style="background-color: #fff0fa;" class="altbg2" rowspan="2" align="center">
							<s:if test="#session.typeList[#I.index].name == '通讯业务申请单'">
								<a href="comRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '电话会议申请单'">
								<a href="phoneRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '存储空间申请单'">
								<a href="spaceRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '邮件申请单'">
								<a href="emailRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == 'IP申请单'">
								<a href="IPRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
							<s:if test="#session.typeList[#I.index].name == '其他申请单'">
								<a href="otherRequestDetailAction?id=<s:property value="#request.id" />" id="requestDetail">详情</a>
							</s:if>
						</td>
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
</body>
</html>