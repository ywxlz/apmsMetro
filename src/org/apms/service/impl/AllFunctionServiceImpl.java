package org.apms.service.impl;

import java.util.List;

import org.apms.bean.AllFunction;
import org.apms.dao.IAllFunctionDao;
import org.apms.service.IAllFunctionService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:10:45
 *
 */

public class AllFunctionServiceImpl implements IAllFunctionService {
	private IAllFunctionDao allFunctionDao;
 	
	@Override
	public List<AllFunction> query() {
		// TODO Auto-generated method stub
		return allFunctionDao.query();
	}

	@Override
	public AllFunction queryId(String id) {
		// TODO Auto-generated method stub
		return allFunctionDao.queryId(id);
	}

	@Override
	public List<AllFunction> queryName(String name) {
		// TODO Auto-generated method stub
		return allFunctionDao.queryName(name);
	}

	@Override
	public void add(AllFunction allFunction) {
		// TODO Auto-generated method stub
		allFunctionDao.add(allFunction);
	}

	@Override
	public void delete(AllFunction allFuction) {
		// TODO Auto-generated method stub
		allFunctionDao.delete(allFuction);
	}

	@Override
	public void update(AllFunction allFuction) {
		// TODO Auto-generated method stub
		allFunctionDao.update(allFuction);
	}

	public IAllFunctionDao getAllFunctionDao() {
		return allFunctionDao;
	}

	public void setAllFunctionDao(IAllFunctionDao allFunctionDao) {
		this.allFunctionDao = allFunctionDao;
	}

}
