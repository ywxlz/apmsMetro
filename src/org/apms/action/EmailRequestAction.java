package org.apms.action;

import java.util.Map;

import org.apms.bean.EmailRequest;
import org.apms.bean.Request;
import org.apms.service.IEmailRequestService;
import org.apms.service.IRequestService;
import org.apms.service.IUsersService;
import org.apms.util.GetTime;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:35:01
 *
 */

public class EmailRequestAction extends ActionSupport {
	private IEmailRequestService emailRequestService;
	private IUsersService userService;
	private IRequestService requestService;
	private String dept;		//部门
	private String phone;		//电话
	private String principal;	//帐号负责人
	private String number;		//人员编号
	private String space;		//需要空间
	private String address;		//办公地点
	private String username;	//使用人姓名
	private String pinyin;		//姓名全拼
	private String status;		//状态（新增、更改）
	private String time;		//使用期限（至什么时候）
	private String reason;		//申请(更改)原因
	private String id;
	
	public String execute() throws Exception {
		return "";
	}
	
	// 添加
	public String add() throws Exception {
		String nowTime = GetTime.getTime();
		//获取用户id
		String userID = userService.queryName(username).getId();
		// 邮件申请单 --id--存储空间--办公地址--负责人--添加时间--删除标志
		EmailRequest emailRequest = new EmailRequest(null, space, address, principal, nowTime, 1);
		emailRequestService.add(emailRequest);
		String ERID = emailRequestService.query().get(0).getId();
		// 基本申请单类型 --id--审批状态--申请人id--申请单类型id--审批人id--与会方数--邮件申请单id--联系电话--申请人全拼--原因--？--？--使用时间--部门--修改时间--删除状态
		Request request = new Request(null, 0, userID, "4", null, number, ERID, phone, pinyin, reason, null, null, time, dept, null, 1);
		requestService.add(request);
		return "add";
	}
	
	//queryDetail
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String queryDetail() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Request request = requestService.queryId(id);
		EmailRequest emailRequest = emailRequestService.queryId(request.getDispose());
		session.put("request", request);
		session.put("requestDept", DeptAction.getDept(request.getDid()));
		session.put("emailRequest", emailRequest);
		return "queryDetail";
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IEmailRequestService getEmailRequestService() {
		return emailRequestService;
	}
	public void setEmailRequestService(IEmailRequestService emailRequestService) {
		this.emailRequestService = emailRequestService;
	}
	public IUsersService getUserService() {
		return userService;
	}
	public void setUserService(IUsersService userService) {
		this.userService = userService;
	}
	public IRequestService getRequestService() {
		return requestService;
	}
	public void setRequestService(IRequestService requestService) {
		this.requestService = requestService;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPinyin() {
		return pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
