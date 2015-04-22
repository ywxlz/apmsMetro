package org.apms.action;

import org.apms.service.IFunctionTypeService;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:35:22
 *
 */

public class FunctionTypeAction extends ActionSupport {
	private IFunctionTypeService functionTypeService;
	
	public String execute() throws Exception {
		return "";
	}

	public IFunctionTypeService getFunctionTypeService() {
		return functionTypeService;
	}
	public void setFunctionTypeService(IFunctionTypeService functionTypeService) {
		this.functionTypeService = functionTypeService;
	}
}
