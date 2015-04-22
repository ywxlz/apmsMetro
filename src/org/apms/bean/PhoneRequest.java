package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:55:42
 *
 */

public class PhoneRequest {
	private String id;// varchar2(100) primary key,        --id
	private String address;// varchar2(100) not null,      --会议地址
	private String time;// varchar2(50) not null,          --会议时间
	private String count;// number(8) not null,            --与会人数
	private String device;// varchar2(100) not null,       --设备支持
	private String startTime;// varchar2(50),              --开始时间
	private String closeTime;// varchar2(50),              --结束时间
	private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public PhoneRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhoneRequest(String id, String address, String time, String count,
			String device, String startTime, String closeTime, int mark) {
		super();
		this.id = id;
		this.address = address;
		this.time = time;
		this.count = count;
		this.device = device;
		this.startTime = startTime;
		this.closeTime = closeTime;
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
