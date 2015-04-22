package org.apms.dao;

import java.util.List;

import org.apms.bean.SpaceRequest;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午2:51:29
 *
 */

public interface ISpaceRequestDao {
	// 1.查全部
	List<SpaceRequest> query();
	// 2.查id
	SpaceRequest queryId(String id);
	// 3.查内存空间
	List<SpaceRequest> querySpace(String interSapce);
	// 4.查时间
	List<SpaceRequest> queryTime(String time);
	// 5.查用户名
	List<SpaceRequest> queryUsername(String username);
	// 6.添加
	void add(SpaceRequest spaceRequest);
	// 7.删除
	void delete(SpaceRequest spaceRequest);
	// 8.修改
	void update(SpaceRequest spaceRequest);
}
