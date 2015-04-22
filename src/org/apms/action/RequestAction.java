package org.apms.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apms.bean.Request;
import org.apms.bean.RequestType;
import org.apms.bean.Users;
import org.apms.service.IComRequestService;
import org.apms.service.IDeptService;
import org.apms.service.IEmailRequestService;
import org.apms.service.IIPRequestService;
import org.apms.service.IOtherRequestService;
import org.apms.service.IPhoneRequestService;
import org.apms.service.IRequestService;
import org.apms.service.IRequestTypeService;
import org.apms.service.ISpaceRequestService;
import org.apms.service.IUsersService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:36:29
 *
 */

@SuppressWarnings("serial")
public class RequestAction extends ActionSupport {
	private IRequestService requestService;
	private IUsersService userService;
	private IRequestTypeService requestTypeService;
	private IPhoneRequestService phoneRequestService;
	private IOtherRequestService otherRequestService;
	private IIPRequestService ipRequestService;
	private IEmailRequestService emailRequestService;
	private IComRequestService comRequestService;
	private ISpaceRequestService spaceRequestService;
	private IDeptService deptService;
	private String id;
	
	public String execute() throws Exception {
		return "";
	}
	
	//查询所有申请单
	public String query() throws Exception {
		List<Request> requestList = requestService.query();
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : requestList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("requestList", requestList);
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		return "query";
	}
	
	//requestDetail
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String requestDetail() throws Exception {
		//创建map集合用于存储申请单
		Map map = new HashMap();
		map.clear();
		Map session = ActionContext.getContext().getSession();
		Request request = requestService.queryId(id);
		session.put("username", userService.queryId(request.getUserId()).getUsername());
		session.put("dept", deptService.queryId(request.getUserId()).getName());
		String RTID = request.getRtid();
		if ("1".equals(RTID)) {
			//通讯业务申请单
			map.put(request, comRequestService.queryId(request.getDispose()));
			session.put("map", map);
			return "comDetail";
		}
		if ("2".equals(RTID)) {
			//电话会议申请单
			map.put(request, phoneRequestService.queryId(request.getDispose()));
			session.put("map", map);
			return "phoneDetail";
		}
		if ("3".equals(RTID)) {
			//存储空间申请单
			map.put(request, spaceRequestService.queryId(request.getDispose()));
			session.put("map", map);
			return "spaceDetail";
		}
		if ("4".equals(RTID)) {
			//邮件申请单
			map.put(request, emailRequestService.queryId(request.getDispose()));
			session.put("map", map);
			return "emailDetail";
		}
		if ("5".equals(RTID)) {
			//IP申请单
			map.put(request, ipRequestService.queryId(request.getDispose()));
			session.put("map", map);
			return "IPDetail";
		}
		if ("6".equals(RTID)) {
			//其他申请单
			map.put(request, otherRequestService.queryId(request.getDispose()));
			session.put("map", map);
			return "otherDetail";
		}
		return "requestDetail";
	}
	
	//approvalRequestAction
	public String approvalRequestAction() throws Exception {
		Request request = requestService.queryId(id);
		Users admin = (Users) ActionContext.getContext().getSession().get("adminUser");
		request.setState(1);
		request.setApproval(admin.getId());
		requestService.update(request);
		return "approvalRequestAction";
	}
	
	//approval
	public String approvalRequest() throws Exception {
		List<Request> approvalList = requestService.queryState(0);
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : approvalList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		ActionContext.getContext().getSession().put("approvalList", approvalList);
		return "approval";
	}
	
	//queryComRequest
	public String queryComRequest() throws Exception {
		List<Request> comList = requestService.queryRtid("1");
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : comList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		ActionContext.getContext().getSession().put("requestList", comList);
		return "queryComRequest";
	}
	
	//queryEmailRequest
	public String queryEmailRequest() throws Exception {
		List<Request> emailList = requestService.queryRtid("4");
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : emailList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		ActionContext.getContext().getSession().put("requestList", emailList);
		return "queryEmailRequest";
	}
	
	//queryIPRequest
	public String queryIPRequest() throws Exception {
		List<Request> IPList = requestService.queryRtid("5");
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : IPList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		ActionContext.getContext().getSession().put("requestList", IPList);
		return "queryIPRequest";
	}
	
	//queryOtherRequest
	public String queryOtherRequest() throws Exception {
		List<Request> otherList = requestService.queryRtid("6");
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : otherList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		ActionContext.getContext().getSession().put("requestList", otherList);
		return "queryOtherRequest";
	}
	
	//queryPhoneRequest
	public String queryPhoneRequest() throws Exception {
		List<Request> phoneList = requestService.queryRtid("2");
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : phoneList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		ActionContext.getContext().getSession().put("requestList", phoneList);
		return "queryPhoneRequest";
	}
	
	//querySpaceRequest
	public String querySpaceRequest() throws Exception {
		List<Request> spaceList = requestService.queryRtid("3");
		List<Users> userList = new ArrayList<Users>();
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : spaceList) {
			userList.add(userService.queryId(request.getUserId()));
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		ActionContext.getContext().getSession().put("userList", userList);
		ActionContext.getContext().getSession().put("typeList", typeList);
		ActionContext.getContext().getSession().put("requestList", spaceList);
		return "querySpaceRequest";
	}
	
	//userQueryRequest
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String userQueryRequest() throws Exception {
		Map session = ActionContext.getContext().getSession();
		List list = (List) session.get("userInfoList");
		Users user = (Users) list.get(0);
		List<Request> userRequest = requestService.queryUser(user.getId());
		List<RequestType> typeList = new ArrayList<RequestType>();
		for (Request request : userRequest) {
			typeList.add(requestTypeService.queryId(request.getRtid()));
		}
		session.put("userRequest", userRequest);
		session.put("typeList", typeList);
		return "userQueryRequest";
	}
	

	public IRequestService getRequestService() {
		return requestService;
	}
	public void setRequestService(IRequestService requestService) {
		this.requestService = requestService;
	}
	public IUsersService getUserService() {
		return userService;
	}
	public void setUserService(IUsersService userService) {
		this.userService = userService;
	}
	public IRequestTypeService getRequestTypeService() {
		return requestTypeService;
	}
	public void setRequestTypeService(IRequestTypeService requestTypeService) {
		this.requestTypeService = requestTypeService;
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
	public IOtherRequestService getOtherRequestService() {
		return otherRequestService;
	}
	public void setOtherRequestService(IOtherRequestService otherRequestService) {
		this.otherRequestService = otherRequestService;
	}
	public IIPRequestService getIpRequestService() {
		return ipRequestService;
	}
	public void setIpRequestService(IIPRequestService ipRequestService) {
		this.ipRequestService = ipRequestService;
	}
	public IEmailRequestService getEmailRequestService() {
		return emailRequestService;
	}
	public void setEmailRequestService(IEmailRequestService emailRequestService) {
		this.emailRequestService = emailRequestService;
	}
	public IComRequestService getComRequestService() {
		return comRequestService;
	}
	public void setComRequestService(IComRequestService comRequestService) {
		this.comRequestService = comRequestService;
	}
	public ISpaceRequestService getSpaceRequestService() {
		return spaceRequestService;
	}
	public void setSpaceRequestService(ISpaceRequestService spaceRequestService) {
		this.spaceRequestService = spaceRequestService;
	}
	public IDeptService getDeptService() {
		return deptService;
	}
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
}
