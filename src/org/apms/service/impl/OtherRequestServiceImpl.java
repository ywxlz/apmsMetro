package org.apms.service.impl;

import java.util.List;

import org.apms.bean.OtherRequest;
import org.apms.dao.IOtherRequestDao;
import org.apms.service.IOtherRequestService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:30:19
 *
 */

public class OtherRequestServiceImpl implements IOtherRequestService {
	private IOtherRequestDao otherRequestDao;
	
	@Override
	public List<OtherRequest> query() {
		// TODO Auto-generated method stub
		return otherRequestDao.query();
	}

	@Override
	public OtherRequest queryId(String id) {
		// TODO Auto-generated method stub
		return otherRequestDao.queryId(id);
	}

	@Override
	public List<OtherRequest> queryDescribe(String describe) {
		// TODO Auto-generated method stub
		return otherRequestDao.queryDescribe(describe);
	}

	@Override
	public List<OtherRequest> queryRid(String rid) {
		// TODO Auto-generated method stub
		return otherRequestDao.queryRid(rid);
	}

	@Override
	public void delete(OtherRequest otherRequest) {
		// TODO Auto-generated method stub
		otherRequestDao.delete(otherRequest);
	}

	@Override
	public void add(OtherRequest otherRequest) {
		// TODO Auto-generated method stub
		otherRequestDao.add(otherRequest);
	}

	@Override
	public void update(OtherRequest otherRequest) {
		// TODO Auto-generated method stub
		otherRequestDao.update(otherRequest);
	}

	public IOtherRequestDao getOtherRequestDao() {
		return otherRequestDao;
	}

	public void setOtherRequestDao(IOtherRequestDao otherRequestDao) {
		this.otherRequestDao = otherRequestDao;
	}

}
