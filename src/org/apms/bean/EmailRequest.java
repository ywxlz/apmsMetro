package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:48:35
 *
 */

public class EmailRequest {
	private String id;// varchar2(100) primary key,        --id
    private String interSpace;// varchar2(30) not null,    --内存
    private String address;// varchar2(100) not null,      --邮件地址
    private String username;// varchar2(20) not null,      --使用者姓名
    private String time;	//添加时间
    private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public EmailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailRequest(String id, String interSpace, String address,
			String username, String time, int mark) {
		super();
		this.id = id;
		this.interSpace = interSpace;
		this.address = address;
		this.username = username;
		this.time = time;
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInterSpace() {
		return interSpace;
	}
	public void setInterSpace(String interSpace) {
		this.interSpace = interSpace;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
