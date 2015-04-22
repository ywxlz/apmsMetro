package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:45:42
 *
 */

public class IPRequest {
	private String id;// varchar2(100) primary key,        --id
    private int count;// number(8) not null,            --申请数量
    private String address;// varchar2(100) not null,      --申请地址
    private String time;// varchar2(50),                   --时间
    private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public IPRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IPRequest(String id, int count, String address, String time, int mark) {
		super();
		this.id = id;
		this.count = count;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
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
