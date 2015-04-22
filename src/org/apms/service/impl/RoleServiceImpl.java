package org.apms.service.impl;

import java.util.List;

import org.apms.bean.Role;
import org.apms.dao.IRoleDao;
import org.apms.service.IRoleService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:41:02
 *
 */

public class RoleServiceImpl implements IRoleService {
	private IRoleDao roleDao;
	
	@Override
	public List<Role> query() {
		// TODO Auto-generated method stub
		return roleDao.query();
	}

	@Override
	public Role queryId(String id) {
		// TODO Auto-generated method stub
		return roleDao.queryId(id);
	}

	@Override
	public List<Role> queryName(String name) {
		// TODO Auto-generated method stub
		return roleDao.queryName(name);
	}

	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		roleDao.add(role);
	}

	@Override
	public void delete(Role role) {
		// TODO Auto-generated method stub
		roleDao.delete(role);
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		roleDao.update(role);
	}

	public IRoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}

}
