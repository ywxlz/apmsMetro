package org.apms.service.impl;

import java.util.List;

import org.apms.bean.PhoneRequest;
import org.apms.dao.IPhoneRequestDao;
import org.apms.service.IPhoneRequestService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:32:01
 *
 */

public class PhoneRequestServiceImpl implements IPhoneRequestService {
	private IPhoneRequestDao phoneRequestDao;
	
	@Override
	public List<PhoneRequest> query() {
		// TODO Auto-generated method stub
		return phoneRequestDao.query();
	}

	@Override
	public PhoneRequest queryId(String id) {
		// TODO Auto-generated method stub
		return phoneRequestDao.queryId(id);
	}

	@Override
	public List<PhoneRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		return phoneRequestDao.queryAddress(address);
	}

	@Override
	public List<PhoneRequest> queryTime(String Time) {
		// TODO Auto-generated method stub
		return phoneRequestDao.queryTime(Time);
	}

	@Override
	public List<PhoneRequest> queryDevice(String device) {
		// TODO Auto-generated method stub
		return phoneRequestDao.queryDevice(device);
	}

	@Override
	public PhoneRequest queryDate(String date) {
		// TODO Auto-generated method stub
		return phoneRequestDao.queryDate(date);
	}

	@Override
	public void add(PhoneRequest pr) {
		// TODO Auto-generated method stub
		phoneRequestDao.add(pr);
	}

	@Override
	public void delete(PhoneRequest pr) {
		// TODO Auto-generated method stub
		phoneRequestDao.delete(pr);
	}

	@Override
	public void update(PhoneRequest pr) {
		// TODO Auto-generated method stub
		phoneRequestDao.update(pr);
	}

	public IPhoneRequestDao getPhoneRequestDao() {
		return phoneRequestDao;
	}

	public void setPhoneRequestDao(IPhoneRequestDao phoneRequestDao) {
		this.phoneRequestDao = phoneRequestDao;
	}

}
