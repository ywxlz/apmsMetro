package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午11:11:34
 *
 */

public class Log {
	private String id;// varchar2(100) primary key,        --id
	private String rid;// varchar2(100) not null,          --申请单id
	private String type;// varchar2(20) not null,          --操作类型
	private String time;// varchar2(50) not null,          --操作时间
	private String userId;// varchar2(100) not null,       --用户id
	private String context;// varchar2(200),               --操作内容
	private String remark;// varchar2(200),                --备注
	private int mark;// number(8)                       --状态（0.删除，1.未删除）
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Log(String id, String rid, String type, String time, String userId,
			String context, String remark, int mark) {
		super();
		this.id = id;
		this.rid = rid;
		this.type = type;
		this.time = time;
		this.userId = userId;
		this.context = context;
		this.remark = remark;
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
