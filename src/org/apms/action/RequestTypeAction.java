package org.apms.action;

import java.util.List;

import org.apms.bean.RequestType;
import org.apms.service.IRequestTypeService;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:36:41
 *
 */

public class RequestTypeAction extends ActionSupport {
	private IRequestTypeService requestTypeService;

	public String execute() throws Exception {
		return "";
	}
	
	public IRequestTypeService getRequestTypeService() {
		return requestTypeService;
	}
	public void setRequestTypeService(IRequestTypeService requestTypeService) {
		this.requestTypeService = requestTypeService;
	}
}
