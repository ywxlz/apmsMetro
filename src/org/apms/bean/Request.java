package org.apms.bean;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午10:40:38
 *
 */

public class Request {
	private String id;// varchar2(100) primary key,        --id
    private int state;// number(8),                     --状态(待审批(0)，待分配(1)，待处理(2)，待反馈(3)，归档(4)，审批否决(5))
    private String userId;// varchar2(100) not null,          --申请人id
    private String rtid;// varchar2(100) not null,         --申请单类型id
    private String approval;// varchar2(50),               --审批人
    private String assigner;// varchar2(50),               --分配人
    private String dispose;// varchar2(50),                --处理人
    private String phone;// varchar2(50),                  --电话号码
    private String title;// varchar2(500),                 --标题
    private String reason;// varchar2(200),                --原因
    private String appendix;// varchar2(50),               --附件
    private String remark;// varchar2(200),                --备注
    private String time;// varchar2(50),                   --时间
    private String did;// varchar2(100) not null,          --部门id
    private String updateTime;// varchar2(50),             --更新时间
    private int mark;// number(8) default(1)            --状态（0.删除，1.未删除）
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Request(String id, int state, String userId, String rtid,
			String approval, String assigner, String dispose, String phone,
			String title, String reason, String appendix, String remark,
			String time, String did, String updateTime, int mark) {
		super();
		this.id = id;
		this.state = state;
		this.userId = userId;
		this.rtid = rtid;
		this.approval = approval;
		this.assigner = assigner;
		this.dispose = dispose;
		this.phone = phone;
		this.title = title;
		this.reason = reason;
		this.appendix = appendix;
		this.remark = remark;
		this.time = time;
		this.did = did;
		this.updateTime = updateTime;
		this.mark = mark;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRtid() {
		return rtid;
	}
	public void setRtid(String rtid) {
		this.rtid = rtid;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public String getAssigner() {
		return assigner;
	}
	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}
	public String getDispose() {
		return dispose;
	}
	public void setDispose(String dispose) {
		this.dispose = dispose;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getAppendix() {
		return appendix;
	}
	public void setAppendix(String appendix) {
		this.appendix = appendix;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
