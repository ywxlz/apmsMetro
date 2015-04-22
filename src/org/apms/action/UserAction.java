package org.apms.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apms.bean.Dept;
import org.apms.bean.Role;
import org.apms.bean.Users;
import org.apms.service.IDeptService;
import org.apms.service.IRoleService;
import org.apms.service.IUsersService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:37:21
 *
 */

public class UserAction extends ActionSupport {
	private IUsersService userService;
	private IDeptService deptService;
	private IRoleService roleService;
	private String username;
	private String password;
	private String veriCode;
	private String loginStatus;
	private String registerUsername;
	private String registerRealName;
	private String registerPassword;
	private String id;
	private String realName;
	
	public String execute() throws Exception {
		return "";
	}
	
	//用户登陆
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String login() throws Exception {
		boolean flag = userService.login(username, password);
		Users user = userService.queryName(username);
		List list = new ArrayList();
		Dept userDept = deptService.queryId(user.getDid());
		Role userRole = roleService.queryId(user.getRid());
		list.add(user);
		list.add(userDept);
		list.add(userRole);
		if (flag) {
			List<Dept> dept = deptService.query();
			ActionContext.getContext().getSession().put("dept", dept);
			ActionContext.getContext().getSession().put("username", username);
			ActionContext.getContext().getSession().put("loginStatus", "success");
			ActionContext.getContext().getSession().put("userInfoList", list);
			loginStatus = "success";
			return "login";
		}
		return "loginFailed";
	}
	
	//用户注销
	public String logout() throws Exception {
		ActionContext.getContext().getSession().put("username", null);
		ActionContext.getContext().getSession().put("loginStatus", null);
		return "logout";
	}
	
	//用户注册
	public String register() throws Exception {
		//如果没填真实姓名则置空
		if (registerRealName == null || registerRealName == "" || "".equals(registerRealName)) {
			registerRealName = "";
		}
		System.out.println(registerUsername + "||" + registerPassword + "||" + registerRealName);
		Users user = new Users(null, registerUsername, registerPassword, registerRealName, "1", "1", "", 1);
		userService.add(user);
		return "register";
	}
	
	//u用户资料修改
	public String userInfoEdit() throws Exception {
		Users admin = userService.queryId(id);
		if (!admin.getUsername().equals(username) && userService.queryName(username) != null) {
			//当用户名与当前用户名不同，并且用户名存在的时候
			return "userInfoFailed";
		}
		admin.setUsername(username);
		admin.setRealName(realName);
		admin.setPassword(password);
		userService.update(admin);
		return "userInfoEdit";
	}
	
	@SuppressWarnings({ "unused" })
	public String adminLogin() throws Exception {
		boolean flag = userService.login(username, password);
		Users user = userService.queryName(username);
		if (user.getRid() == "0" || "0".equals(user.getRid())) {
			ActionContext.getContext().getSession().put("adminName", username);
			ActionContext.getContext().getSession().put("adminUser", user);
			return "adminLogin";
		}
		return "loginFailed";
	}
	
	//管理员注销
	public String adminLogout() throws Exception {
		ActionContext.getContext().getSession().put("adminLogout", null);
		ActionContext.getContext().getSession().put("adminUser", null);
		return "adminLogout";
	}
	
	//管理员queryUser
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String queryUser() throws Exception {
		List<Users> userList = userService.query();
		List list = new ArrayList();
		Map map = new HashMap();
		for (Users users : userList) {
			list.add(deptService.queryId(users.getDid()));
			list.add(roleService.queryId(users.getRid()));
			map.put(users, list);
		}
		ActionContext.getContext().getSession().put("userList", map);
		return "queryUser";
	}
	
	//userInfo
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String adminInfo() throws Exception {
		Users admin = (Users) ActionContext.getContext().getSession().get("adminUser");
		Dept adminDept = deptService.queryId(admin.getDid());
		Role adminRole = roleService.queryId(admin.getRid());
		List adminList = new ArrayList();
		adminList.add(admin);
		adminList.add(adminDept);
		adminList.add(adminRole);
		ActionContext.getContext().getSession().put("adminList", adminList);
		return "adminInfo";
	}
	
	//adminInfoEdit
	public String adminInfoEdit() throws Exception {
		Users admin = userService.queryId(id);
		if (!admin.getUsername().equals(username) && userService.queryName(username) != null) {
			//当用户名与当前用户名不同，并且用户名存在的时候
			return "adminInfoFailed";
		}
		admin.setUsername(username);
		admin.setRealName(realName);
		admin.setPassword(password);
		userService.update(admin);
		return "adminInfoEdit";
	}

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public IUsersService getUserService() {
		return userService;
	}
	public void setUserService(IUsersService userService) {
		this.userService = userService;
	}
	public IDeptService getDeptService() {
		return deptService;
	}
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
	public String getVeriCode() {
		return veriCode;
	}
	public void setVeriCode(String veriCode) {
		this.veriCode = veriCode;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getRegisterUsername() {
		return registerUsername;
	}
	public void setRegisterUsername(String registerUsername) {
		this.registerUsername = registerUsername;
	}
	public String getRegisterRealName() {
		return registerRealName;
	}
	public void setRegisterRealName(String registerRealName) {
		this.registerRealName = registerRealName;
	}
	public String getRegisterPassword() {
		return registerPassword;
	}
	public void setRegisterPassword(String registerPassword) {
		this.registerPassword = registerPassword;
	}
	public IRoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
}
