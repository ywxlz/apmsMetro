package org.apms.action;

import org.apache.struts2.json.annotations.JSON;
import org.apms.service.IUsersService;
import org.apms.util.SecurityCode;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年4月14日 下午1:53:53
 *
 */

public class ValiUserNameAction extends ActionSupport {
	private String registerUsername;
	private IUsersService userService;
	private boolean registerFlag;
	
	@Override
	public String execute() throws Exception {
		if (userService.queryName(registerUsername).getUsername() != null) {
			registerFlag = false;
		} else {
			registerFlag = true;
		}
		return SUCCESS;
	}

	@JSON(serialize=false)
	public String getRegisterUsername() {
		return registerUsername;
	}
	public void setRegisterUsername(String registerUsername) {
		this.registerUsername = registerUsername;
	}
	@JSON(serialize=false)
	public IUsersService getUserService() {
		return userService;
	}
	public void setUserService(IUsersService userService) {
		this.userService = userService;
	}
	@JSON(name="registerFlag")
	public boolean getRegisterFlag() {
		return registerFlag;
	}
	public void setRegisterFlag(boolean registerFlag) {
		this.registerFlag = registerFlag;
	}
}