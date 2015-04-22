package org.apms.service.impl;

import java.util.List;

import org.apms.bean.ComRequest;
import org.apms.dao.IComRequestDao;
import org.apms.service.IComRequestService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:13:03
 *
 */

public class ComRequestServiceImpl implements IComRequestService {
	private IComRequestDao comRequestDao;
	
	@Override
	public List<ComRequest> query() {
		// TODO Auto-generated method stub
		return comRequestDao.query();
	}

	@Override
	public List<ComRequest> queryTime(String time) {
		// TODO Auto-generated method stub
		return comRequestDao.queryTime(time);
	}

	@Override
	public List<ComRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		return comRequestDao.queryAddress(address);
	}

	@Override
	public ComRequest queryId(String id) {
		// TODO Auto-generated method stub
		return comRequestDao.queryId(id);
	}

	@Override
	public void delete(ComRequest comRequest) {
		// TODO Auto-generated method stub
		comRequestDao.delete(comRequest);
	}

	@Override
	public void add(ComRequest comRequest) {
		// TODO Auto-generated method stub
		comRequestDao.add(comRequest);
	}

	@Override
	public void update(ComRequest comRequest) {
		// TODO Auto-generated method stub
		comRequestDao.update(comRequest);
	}

	public IComRequestDao getComRequestDao() {
		return comRequestDao;
	}

	public void setComRequestDao(IComRequestDao comRequestDao) {
		this.comRequestDao = comRequestDao;
	}

}
