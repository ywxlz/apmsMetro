package org.apms.service.impl;

import java.util.List;

import org.apms.bean.Dept;
import org.apms.dao.IDeptDao;
import org.apms.service.IDeptService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:19:28
 *
 */

public class DeptServiceImpl implements IDeptService {
	private IDeptDao deptDao;
	
	@Override
	public List<Dept> query() {
		// TODO Auto-generated method stub
		return deptDao.query();
	}

	@Override
	public List<Dept> queryName(String name) {
		// TODO Auto-generated method stub
		return deptDao.queryName(name);
	}

	@Override
	public List<Dept> queryHeader(String headerName) {
		// TODO Auto-generated method stub
		return deptDao.queryHeader(headerName);
	}

	@Override
	public List<Dept> queryRemark(String remark) {
		// TODO Auto-generated method stub
		return deptDao.queryRemark(remark);
	}

	@Override
	public void delete(Dept dept) {
		// TODO Auto-generated method stub
		deptDao.delete(dept);
	}

	@Override
	public void add(Dept dept) {
		// TODO Auto-generated method stub
		deptDao.add(dept);
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		deptDao.update(dept);
	}

	@Override
	public Dept queryId(String id) {
		// TODO Auto-generated method stub
		return deptDao.queryId(id);
	}

	public IDeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}

}
