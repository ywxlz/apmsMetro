package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:30:30
 *
 */

public class Dept {
	private String id;// varchar2(100) primary key,        --id
    private String name;// varchar2(20) not null,          --部门名称
    private String headerName;// varchar2(20) not null,    --部门领导名
    private String remark;// varchar2(500),                --备注
    private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(String id, String name, String headerName, String remark,
			int mark) {
		super();
		this.id = id;
		this.name = name;
		this.headerName = headerName;
		this.remark = remark;
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
	public String getHeaderName() {
		return headerName;
	}
	public void setHeaderName(String headerName) {
		this.headerName = headerName;
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
