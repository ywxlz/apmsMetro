package org.apms.action;

import org.apms.bean.Dept;
import org.apms.service.IDeptService;
import org.apms.service.impl.DeptServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午4:34:46
 *
 */

public class DeptAction extends ActionSupport {
	private static IDeptService deptService;
	
	public String execute() throws Exception {
		return "";
	}
	
	public static Dept getDept(String id){
		return deptService.queryId(id);
	}

	public IDeptService getDeptService() {
		return deptService;
	}
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
}
