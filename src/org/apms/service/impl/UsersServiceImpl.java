package org.apms.service.impl;

import java.util.List;

import org.apms.bean.Users;
import org.apms.dao.IUsersDao;
import org.apms.service.IUsersService;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午11:56:02
 *
 */

public class UsersServiceImpl implements IUsersService {
	private IUsersDao userDao;
	
	@Override
	public List<Users> query() {
		// TODO Auto-generated method stub
		return userDao.query();
	}

	@Override
	public void add(Users user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	@Override
	public void delete(Users user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public Users queryName(String name) {
		// TODO Auto-generated method stub
		return userDao.queryName(name);
	}

	@Override
	public Users queryId(String id) {
		// TODO Auto-generated method stub
		return userDao.queryId(id);
	}

	@Override
	public List<Users> queryDept(String dept) {
		// TODO Auto-generated method stub
		return userDao.queryDept(dept);
	}

	@Override
	public List<Users> queryRole(String role) {
		// TODO Auto-generated method stub
		return userDao.queryRole(role);
	}
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.login(username, password);
	}
	
	public IUsersDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUsersDao userDao) {
		this.userDao = userDao;
	}

}
