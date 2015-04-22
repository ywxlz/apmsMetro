package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:34:23
 *
 */

public class RequestType {
	private String id;// varchar2(100) primary key,        --id
    private String name;// varchar2(20) not null,          --申请单名称
    private int mark;// number(8) default(1)            --状态(0.删除，1.未删除)
	public RequestType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestType(String id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
