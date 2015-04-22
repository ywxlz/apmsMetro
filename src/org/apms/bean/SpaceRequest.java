package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:53:28
 *
 */

public class SpaceRequest {
	private String id;// varchar2(100) primary key,        --id
	private String interSpace;// varchar2(30) not null,    --内存
	private String time;// varchar2(50) not null,          --使用时间
	private String username;// varchar2(20) not null,      --使用者姓名
	private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public SpaceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpaceRequest(String id, String interSpace, String time,
			String username, int mark) {
		super();
		this.id = id;
		this.interSpace = interSpace;
		this.time = time;
		this.username = username;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
