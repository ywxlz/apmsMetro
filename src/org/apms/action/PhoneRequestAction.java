package org.apms.action;

import java.util.Map;

import org.apms.bean.PhoneRequest;
import org.apms.bean.Request;
import org.apms.service.IPhoneRequestService;
import org.apms.service.IRequestService;
import org.apms.service.IUsersService;
import org.apms.util.GetTime;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:36:17
 *
 */

public class PhoneRequestAction extends ActionSupport {
	private IPhoneRequestService phoneRequestService;
	private IUsersService userService;
	private IRequestService requestService;
	private String dept;		//申请部门
	private String username;	//申请人
	private String date;		//开会日期
	private String room;		//会议室
	private String phone;		//联系电话
	private String device;		//是否需要提供设备
	private int count;			//与会方数
	private String startTime;	//开始时间
	private String endTime;		//结束时间
	private String remark;		//特殊要求
	private String id;
	
	public String execute() throws Exception {
		return "";
	}
	
	public String add() throws Exception {
		String time = GetTime.getTime();
		String userId = userService.queryName(username).getId();
		PhoneRequest phoneRequest = new PhoneRequest(null, room, time, count + "", device, startTime, endTime, 1);
		phoneRequestService.add(phoneRequest);
		String PRID = phoneRequestService.query().get(0).getId();
		Request request = new Request(null, 0, userId, "2", null, null, PRID, phone, null, remark, room, device, date, dept, null, 1);
		requestService.add(request);
		return "add";
	}

	//queryDetail
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String queryPhoneDetail() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Request request = requestService.queryId(id);
		PhoneRequest phoneRequest = phoneRequestService.queryId(request.getDispose());
		session.put("request", request);
		session.put("requestDept", DeptAction.getDept(request.getDid()));
		session.put("phoneRequest", phoneRequest);
		return "queryPhoneDetail";
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IPhoneRequestService getPhoneRequestService() {
		return phoneRequestService;
	}
	public void setPhoneRequestService(IPhoneRequestService phoneRequestService) {
		this.phoneRequestService = phoneRequestService;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
