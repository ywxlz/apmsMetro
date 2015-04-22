package org.apms.service.impl;

import java.util.List;

import org.apms.bean.IPRequest;
import org.apms.dao.IIPRequestDao;
import org.apms.service.IIPRequestService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:25:31
 *
 */

public class IPRequestServiceImpl implements IIPRequestService {
	private IIPRequestDao ipRequestDao;
	
	@Override
	public List<IPRequest> query() {
		// TODO Auto-generated method stub
		return ipRequestDao.query();
	}

	@Override
	public IPRequest queryId(String id) {
		// TODO Auto-generated method stub
		return ipRequestDao.queryId(id);
	}

	@Override
	public List<IPRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		return ipRequestDao.queryAddress(address);
	}

	@Override
	public List<IPRequest> queryTime(String time) {
		// TODO Auto-generated method stub
		return ipRequestDao.queryTime(time);
	}

	@Override
	public void delete(IPRequest ip) {
		// TODO Auto-generated method stub
		ipRequestDao.delete(ip);
	}

	@Override
	public void add(IPRequest ip) {
		// TODO Auto-generated method stub
		ipRequestDao.add(ip);
	}

	@Override
	public void update(IPRequest ip) {
		// TODO Auto-generated method stub
		ipRequestDao.update(ip);
	}

	public IIPRequestDao getIpRequestDao() {
		return ipRequestDao;
	}

	public void setIpRequestDao(IIPRequestDao ipRequestDao) {
		this.ipRequestDao = ipRequestDao;
	}

}
