package org.apms.service;

import java.util.List;

import org.apms.bean.ComRequest;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午10:44:34
 *
 */

public interface IComRequestService {
	// 1.查所有
	List<ComRequest> query();
	// 2.查时间
	List<ComRequest> queryTime(String time);
	// 3.查地址
	List<ComRequest> queryAddress(String address);
	// 4.查id
	ComRequest queryId(String id);
	// 5.删除
	void delete(ComRequest comRequest);
	// 6.添加
	void add(ComRequest comRequest);
	// 7.修改
	void update(ComRequest comRequest);
}
