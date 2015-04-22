package org.apms.action;

import java.util.Map;

import org.apms.bean.OtherRequest;
import org.apms.bean.Request;
import org.apms.service.IOtherRequestService;
import org.apms.service.IRequestService;
import org.apms.service.IUsersService;
import org.apms.util.GetTime;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:36:05
 *
 */

public class OtherRequestAction extends ActionSupport {
	private IOtherRequestService otherRequestService;
	private IUsersService userService;
	private IRequestService requestService;
	private String username;	//申请人
	private String dept;		//申请部门
	private String date;		//申请时间
	private String phone;		//联系电话
	private String reason;		//问题描述
	private String id;

	public String execute() throws Exception {
		return "";
	}
	
	public String add() throws Exception {
		String time = GetTime.getTime();
		String userId = userService.queryName(username).getId();
		OtherRequest otherRequest = new OtherRequest(null, time, "1", 1);
		otherRequestService.add(otherRequest);
		String ORID = otherRequestService.query().get(0).getId();
		Request request = new Request(null, 0, userId, "6", null, null, null, phone, null, reason, null, null, date, dept, null, 1);
		requestService.add(request);
		return "add";
	}
	
	//queryDetail
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String queryOtherDetail() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Request request = requestService.queryId(id);
		OtherRequest otherRequest = otherRequestService.queryId(request.getDispose());
		session.put("request", request);
		session.put("requestDept", DeptAction.getDept(request.getDid()));
		session.put("otherRequest", otherRequest);
		return "queryOtherDetail";
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IOtherRequestService getOtherRequestService() {
		return otherRequestService;
	}
	public void setOtherRequestService(IOtherRequestService otherRequestService) {
		this.otherRequestService = otherRequestService;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
