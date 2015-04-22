package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午11:17:13
 *
 */

public class AllFunction {
	private String id;// varchar2(100) primary key,        --id
	private String name;// varchar2(50),                   --功能名称
	private String ul;// varchar2(100),                    --备用
	private String fid;// varchar2(100) not null,          --功能类型id
	private String rid;// varchar2(100) not null,          --角色id
	private int status;// number(8),                    --状态（1.显示，2.不显示）
	private int state;// number(8),                     --状态(待审批(0)，待分配(1)，待处理(2)，待反馈(3)，归档(4)，审批否决(5))
	private int mark;// number(8)                       --状态（0.删除，1.未删除）
	public AllFunction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllFunction(String id, String name, String ul, String fid,
			String rid, int status, int state, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.ul = ul;
		this.fid = fid;
		this.rid = rid;
		this.status = status;
		this.state = state;
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
	public String getUl() {
		return ul;
	}
	public void setUl(String ul) {
		this.ul = ul;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
