package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午11:08:39
 *
 */

public class OtherRequest {
	private String id;// varchar2(100) primary key,        --id
	private String describe;// varchar2(100) not null,     --描述
	private String rid;// varchar2(100) not null,          --申请单id
	private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public OtherRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OtherRequest(String id, String describe, String rid, int mark) {
		super();
		this.id = id;
		this.describe = describe;
		this.rid = rid;
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
