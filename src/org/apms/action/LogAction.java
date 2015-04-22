package org.apms.action;

import org.apms.service.ILogService;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:35:49
 *
 */

public class LogAction extends ActionSupport {
	private ILogService logService;
	
	public String execute() throws Exception {
		return "";
	}

	public ILogService getLogService() {
		return logService;
	}
	public void setLogService(ILogService logService) {
		this.logService = logService;
	}
}
