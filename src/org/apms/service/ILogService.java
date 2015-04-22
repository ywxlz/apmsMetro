package org.apms.service;

import java.util.List;

import org.apms.bean.Log;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午12:02:22
 *
 */

public interface ILogService {
	// 1.查全部
	List<Log> query();
	// 2.查id
	Log queryId(String id);
	// 3.查申请单
	List<Log> queryRid(String rid);
	// 4.查操作类型
	List<Log> queryType(String type);
	// 5.查时间
	List<Log> queryTime(String time);
	// 6.查操作用户
	List<Log> queryUser(String userId);
	// 7.查操作内容
	List<Log> queryContext(String context);
	// 8.查备注
	List<Log> queryRemark(String remark);
	// 9.删除
	void delete(Log log);
	// 10.添加
	void add(Log log);
	// 11.修改
	void update(Log log);
}
