package org.apms.action;

import java.util.List;
import java.util.Map;

import org.apms.bean.ComRequest;
import org.apms.bean.Request;
import org.apms.bean.Users;
import org.apms.service.IComRequestService;
import org.apms.service.IRequestService;
import org.apms.service.IUsersService;
import org.apms.util.GetTime;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:34:31
 *
 */

public class ComRequestAction extends ActionSupport {
	private IComRequestService comRequestService;
	private IUsersService userService;
	private IRequestService requestService;
	private String username;	//申请人
	private String dept;		//部   门
	private String phone;		//联系电话
	private String date;		//申请日期
	private String timeLimit;	//使用期限
	private String header;		//部门签批人
	private String nature;		//施工性质
	private String address;		//施工地点
	private String count;		//数量
	private String reason;		//原因
	private String id;
	
	
	public String execute() throws Exception {
		return "";
	}
	
	public String add() throws Exception {
		String time = GetTime.getTime();
		Users user = userService.queryName(username);
		// 通讯业务申请单 id--施工地址--申请时间--删除状态
		ComRequest comRequest = new ComRequest(null, address, time, 1);
		comRequestService.add(comRequest);
		List<ComRequest> cr = comRequestService.query();
		System.out.println(cr.get(0).getId());
		String crID = null;
		if (cr.size() != 0) {
			crID = cr.get(0).getId();
		}
		// 申请单 id--审批状态--用户id--申请单类型id--审批人id--部门签批人id--通讯申请单id--联系电话--施工性质--原因--数量--申请日期--施工期限--部门id--更新时间--删除状态
		Request request = new Request(null, 0, user.getId(), "1", null, header, crID, phone, nature, reason, count, timeLimit, date, dept, null, 1);
		requestService.add(request);
		return "add";
	}
	
	//queryDetail
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String queryComDeatil() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Request request = requestService.queryId(id);
		ComRequest comRequest = comRequestService.queryId(request.getDispose());
		session.put("request", request);
		session.put("requestDept", DeptAction.getDept(request.getDid()));
		session.put("comRequest", comRequest);
		return "queryComDeatil";
	}
	
	public IComRequestService getComRequestService() {
		return comRequestService;
	}
	public void setComRequestService(IComRequestService comRequestService) {
		this.comRequestService = comRequestService;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
