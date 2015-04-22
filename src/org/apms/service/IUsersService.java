package org.apms.service;

import java.util.List;

import org.apms.bean.Users;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午11:54:32
 *
 */

public interface IUsersService {
	// 1.查询用户
	List<Users> query();
	// 2.添加用户
	void add(Users user);
	// 3.删除用户
	void delete(Users user);
	// 4.修改用户
	void update(Users user);
	// 5.以名字查询
	Users queryName(String name);
	// 6.以id查询
	Users queryId(String id);
	// 7.以部门查询
	List<Users> queryDept(String dept);
	// 8.以角色查询
	List<Users> queryRole(String role);
	// 9.登陆
	boolean login(String username, String password);
}
