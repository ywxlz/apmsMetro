package org.apms.service.impl;

import java.util.List;

import org.apms.bean.SpaceRequest;
import org.apms.dao.ISpaceRequestDao;
import org.apms.service.ISpaceRequestService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:43:24
 *
 */

public class SpaceRequestServiceImpl implements ISpaceRequestService {
	private ISpaceRequestDao spaceRequestDao;
	
	@Override
	public List<SpaceRequest> query() {
		// TODO Auto-generated method stub
		return spaceRequestDao.query();
	}

	@Override
	public SpaceRequest queryId(String id) {
		// TODO Auto-generated method stub
		return spaceRequestDao.queryId(id);
	}

	@Override
	public List<SpaceRequest> querySpace(String interSapce) {
		// TODO Auto-generated method stub
		return spaceRequestDao.querySpace(interSapce);
	}

	@Override
	public List<SpaceRequest> queryTime(String time) {
		// TODO Auto-generated method stub
		return spaceRequestDao.queryTime(time);
	}

	@Override
	public List<SpaceRequest> queryUsername(String username) {
		// TODO Auto-generated method stub
		return spaceRequestDao.queryUsername(username);
	}

	@Override
	public void add(SpaceRequest spaceRequest) {
		// TODO Auto-generated method stub
		spaceRequestDao.add(spaceRequest);
	}

	@Override
	public void delete(SpaceRequest spaceRequest) {
		// TODO Auto-generated method stub
		spaceRequestDao.delete(spaceRequest);
	}

	@Override
	public void update(SpaceRequest spaceRequest) {
		// TODO Auto-generated method stub
		spaceRequestDao.update(spaceRequest);
	}

	public ISpaceRequestDao getSpaceRequestDao() {
		return spaceRequestDao;
	}

	public void setSpaceRequestDao(ISpaceRequestDao spaceRequestDao) {
		this.spaceRequestDao = spaceRequestDao;
	}

}
