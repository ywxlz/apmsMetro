package org.apms.action;

import java.util.Map;

import org.apms.bean.Request;
import org.apms.bean.SpaceRequest;
import org.apms.service.IRequestService;
import org.apms.service.ISpaceRequestService;
import org.apms.service.IUsersService;
import org.apms.util.GetTime;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:37:07
 *
 */

public class SpaceRequestAction extends ActionSupport {
	private ISpaceRequestService spaceRequestService;
	private IUsersService userService;
	private IRequestService requestService;
	private String username;		//申请人
	private String dept;			//申请部门
	private String phone;			//联系电话
	private String space;			//所需空间
	private String time;			//使用期限
	private String people;			//部门接口人
	private String reason;			//申请理由
	private String permissions;		//目录访问权限
	private String remark;			//特殊要求
	private String id;
	
	
	public String execute() throws Exception {
		return "";
	}
	
	public String add() throws Exception {
		String time = GetTime.getTime();
		String userId = userService.queryName(username).getId();
		SpaceRequest spaceRequest = new SpaceRequest(null, space, time, people, 1);
		spaceRequestService.add(spaceRequest);
		String SRID = spaceRequestService.query().get(0).getId();
		Request request = new Request(null, 0, userId, "3", null, null, SRID, phone, null, reason, permissions, remark, this.time, dept, null, 1);
		requestService.add(request);
		return "add";
	}

	//queryDetail
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String querySpaceDetail() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Request request = requestService.queryId(id);
		SpaceRequest spaceRequest = spaceRequestService.queryId(request.getDispose());
		session.put("request", request);
		session.put("requestDept", DeptAction.getDept(request.getDid()));
		session.put("spaceRequest", spaceRequest);
		return "querySpaceDetail";
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ISpaceRequestService getSpaceRequestService() {
		return spaceRequestService;
	}
	public void setSpaceRequestService(ISpaceRequestService spaceRequestService) {
		this.spaceRequestService = spaceRequestService;
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

	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
