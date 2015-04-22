package org.apms.dao;

import java.util.List;

import org.apms.bean.RequestType;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午2:29:50
 *
 */

public interface IRequestTypeDao {
	// 1.查全部
	List<RequestType> query();
	// 2.查id
	RequestType queryId(String id);
	// 3.查名称
	List<RequestType> queryName(String name);
	// 4.添加
	void add(RequestType rt);
	// 5.删除
	void delete(RequestType rt);
	// 6.修改
	void update(RequestType rt);
}
