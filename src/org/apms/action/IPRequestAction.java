package org.apms.action;

import java.util.Map;

import org.apms.bean.EmailRequest;
import org.apms.bean.IPRequest;
import org.apms.bean.Request;
import org.apms.service.IIPRequestService;
import org.apms.service.IRequestService;
import org.apms.service.IUsersService;
import org.apms.util.GetTime;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:35:36
 *
 */

public class IPRequestAction extends ActionSupport {
	private IIPRequestService ipRequestService;
	private IUsersService userService;
	private IRequestService requestService;
	private String username;	//申请人
	private String dept;		//部   门
	private String reason;		//申请原因
	private int count;			//申请数量
	private String address;		//使用地点
	private String code;		//网口号码
	private String time;		//使用时间
	private String date;		//申请日期
	private String id;
	
	public String execute() throws Exception {
		return "";
	}
	
	public String add() throws Exception {
		String nowTime = GetTime.getTime();
		String userID = userService.queryName(username).getId();
		IPRequest ipRequest = new IPRequest(null, count, address, nowTime, 1);
		ipRequestService.add(ipRequest);
		String IPID = ipRequestService.query().get(0).getId();
		Request request = new Request(null, 0, userID, "5", null, null, IPID, null, null, reason, code, date, time, dept, null, 1);
		requestService.add(request);
		return "add";
	}
	
	//queryDetail
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String queryIPDetail() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Request request = requestService.queryId(id);
		IPRequest IPRequest = ipRequestService.queryId(request.getDispose());
		session.put("request", request);
		session.put("requestDept", DeptAction.getDept(request.getDid()));
		session.put("IPRequest", IPRequest);
		return "queryIPDetail";
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IIPRequestService getIpRequestService() {
		return ipRequestService;
	}
	public void setIpRequestService(IIPRequestService ipRequestService) {
		this.ipRequestService = ipRequestService;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
