package org.apms.action;

import org.apms.service.IRoleService;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:36:54
 *
 */

public class RoleAction extends ActionSupport {
	private IRoleService roleService;
	
	public String execute() throws Exception {
		return "";
	}

	public IRoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(IRoleService roleService) {
		this.roleService = roleService;
	}
}
