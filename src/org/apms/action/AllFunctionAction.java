package org.apms.action;

import org.apms.service.IAllFunctionService;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:33:43
 *
 */

public class AllFunctionAction extends ActionSupport {
	private IAllFunctionService allFunctionService;

	public String execute() throws Exception {
		return "";
	}
	
	public IAllFunctionService getAllFunctionService() {
		return allFunctionService;
	}
	public void setAllFunctionService(IAllFunctionService allFunctionService) {
		this.allFunctionService = allFunctionService;
	}
}
