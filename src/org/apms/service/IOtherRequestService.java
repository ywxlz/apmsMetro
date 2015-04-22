package org.apms.service;

import java.util.List;

import org.apms.bean.OtherRequest;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午12:22:47
 *
 */

public interface IOtherRequestService {
	// 1.查全部
	List<OtherRequest> query();
	// 2.查id
	OtherRequest queryId(String id);
	// 3.查描述
	List<OtherRequest> queryDescribe(String describe);
	// 4.查申请单id
	List<OtherRequest> queryRid(String rid);
	// 5.删除
	void delete(OtherRequest otherRequest);
	// 6.添加
	void add(OtherRequest otherRequest);
	// 7.修改
	void update(OtherRequest otherRequest);
}
