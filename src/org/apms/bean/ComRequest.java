package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午11:03:13
 *
 */

public class ComRequest {
	private String id;// varchar2(100) primary key,        --id
	private String address;// varchar2(100) not null,      --地址
	private String time;// varchar2(50) not null,          --时间
	private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public ComRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComRequest(String id, String address, String time, int mark) {
		super();
		this.id = id;
		this.address = address;
		this.time = time;
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
