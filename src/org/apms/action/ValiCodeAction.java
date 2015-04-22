package org.apms.action;

import org.apache.struts2.json.annotations.JSON;
import org.apms.util.SecurityCode;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 *@author lwxyz
 *@version 2015年4月14日 下午1:53:53
 *
 */

public class ValiCodeAction extends ActionSupport {
	private String flag;
	private String veriCode;
	
	@Override
	public String execute() throws Exception {
		String code = (String) ActionContext.getContext().getSession().get("SESSION_SECURITY_CODE");
		if (veriCode == code || code.equals(veriCode)) {
			flag = "true";
		} else {
			flag = "false";
		}
		ActionContext.getContext().getSession().put("flag", flag);
		return SUCCESS;
	}
	
	@JSON(name="flag")
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@JSON(serialize=false)
	public String getVeriCode() {
		return veriCode;
	}
	public void setVeriCode(String veriCode) {
		this.veriCode = veriCode;
	}
}
