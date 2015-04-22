package org.apms.service.impl;

import java.util.List;

import org.apms.bean.RequestType;
import org.apms.dao.IRequestTypeDao;
import org.apms.service.IRequestTypeService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:38:02
 *
 */

public class RequestTypeServiceImpl implements IRequestTypeService {
	private IRequestTypeDao requestTypeDao;
	
	@Override
	public List<RequestType> query() {
		// TODO Auto-generated method stub
		return requestTypeDao.query();
	}

	@Override
	public RequestType queryId(String id) {
		// TODO Auto-generated method stub
		return requestTypeDao.queryId(id);
	}

	@Override
	public List<RequestType> queryName(String name) {
		// TODO Auto-generated method stub
		return requestTypeDao.queryName(name);
	}

	@Override
	public void add(RequestType rt) {
		// TODO Auto-generated method stub
		requestTypeDao.add(rt);
	}

	@Override
	public void delete(RequestType rt) {
		// TODO Auto-generated method stub
		requestTypeDao.delete(rt);
	}

	@Override
	public void update(RequestType rt) {
		// TODO Auto-generated method stub
		requestTypeDao.update(rt);
	}

	public IRequestTypeDao getRequestTypeDao() {
		return requestTypeDao;
	}

	public void setRequestTypeDao(IRequestTypeDao requestTypeDao) {
		this.requestTypeDao = requestTypeDao;
	}

}
