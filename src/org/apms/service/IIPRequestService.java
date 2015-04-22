package org.apms.service;

import java.util.List;

import org.apms.bean.IPRequest;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:43:24
 *
 */

public interface IIPRequestService {
	// 1.查全部
	List<IPRequest> query();
	// 2.查id
	IPRequest queryId(String id);
	// 3.查地址
	List<IPRequest> queryAddress(String address);
	// 4.查时间
	List<IPRequest> queryTime(String time);
	// 5.删除
	void delete(IPRequest ip);
	// 6.添加
	void add(IPRequest ip);
	// 7.修改
	void update(IPRequest ip);
}
