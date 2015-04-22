package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:32:10
 *
 */

public class Users {
	private String id;// varchar2(100) primary key,        --id
    private String username;// varchar2(20) not null,      --用户名
    private String password;// varchar2(20) not null,      --密码
    private String realName;// varchar2(20),               --真实姓名
    private String rid;// varchar2(100) not null,          --角色id
    private String did;// varchar2(100) not null,          --部门id
    private String src;// varchar2(500),                   --照片路径消息
    private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String id, String username, String password, String realName,
			String rid, String did, String src, int mark) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.realName = realName;
		this.rid = rid;
		this.did = did;
		this.src = src;
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
