package org.apms.dao;

import java.util.List;

import org.apms.bean.Request;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午1:51:30
 *
 */

public interface IRequestDao {
	// 1.查全部
	List<Request> query();
	// 2.查状态
	List<Request> queryState(int state);
	// 3.查用户id
	List<Request> queryUser(String userId);
	// 4.查申请单类型id
	List<Request> queryRtid(String trid);
	// 5.查审批人
	List<Request> queryApproval(String approval);
	// 6.查分配人
	List<Request> queryAssigner(String assigner);
	// 7.查处理人
	List<Request> queryDispose(String dispose);
	// 8.查电话
	List<Request> queryPhone(String phone);
	// 9.查标题
	List<Request> queryTitle(String title);
	// 10.查原因
	List<Request> queryReason(String reason);
	// 11.查附件
	List<Request> queryAppendix(String appendix);
	// 12.查备注
	List<Request> queryRemark(String remark);
	// 13.查时间
	List<Request> queryTime(String time);
	// 14.查部门id
	List<Request> queryDid(String did);
	// 15.更新时间
	List<Request> queryUpdate(String updateTime);
	// 16.添加
	void add(Request request);
	// 17.删除
	void delete(Request request);
	// 18.修改
	void update(Request request);
	// 19.查id
	Request queryId(String id);
}
