package org.apms.service;

import java.util.List;

import org.apms.bean.Role;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午2:41:17
 *
 */

public interface IRoleService {
	// 1.查全部
	List<Role> query();
	// 2.查id
	Role queryId(String id);
	// 3.查名称
	List<Role> queryName(String name);
	// 4.添加
	void add(Role role);
	// 5.删除
	void delete(Role role);
	// 6.修改
	void update(Role role);
}
