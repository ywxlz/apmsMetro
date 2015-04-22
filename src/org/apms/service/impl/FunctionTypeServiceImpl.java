package org.apms.service.impl;

import java.util.List;

import org.apms.bean.FunctionType;
import org.apms.dao.IFunctionTypeDao;
import org.apms.service.IFunctionTypeService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:23:42
 *
 */

public class FunctionTypeServiceImpl implements IFunctionTypeService {
	private IFunctionTypeDao functionTypeDao;
	
	@Override
	public List<FunctionType> query() {
		// TODO Auto-generated method stub
		return functionTypeDao.query();
	}

	@Override
	public FunctionType queryId(String id) {
		// TODO Auto-generated method stub
		return functionTypeDao.queryId(id);
	}

	@Override
	public List<FunctionType> queryName(String name) {
		// TODO Auto-generated method stub
		return functionTypeDao.queryName(name);
	}

	@Override
	public void delete(FunctionType ft) {
		// TODO Auto-generated method stub
		functionTypeDao.delete(ft);
	}

	@Override
	public void add(FunctionType ft) {
		// TODO Auto-generated method stub
		functionTypeDao.add(ft);
	}

	@Override
	public void update(FunctionType ft) {
		// TODO Auto-generated method stub
		functionTypeDao.update(ft);
	}

	public IFunctionTypeDao getFunctionTypeDao() {
		return functionTypeDao;
	}

	public void setFunctionTypeDao(IFunctionTypeDao functionTypeDao) {
		this.functionTypeDao = functionTypeDao;
	}

}
