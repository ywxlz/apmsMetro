package org.apms.service.impl;

import java.util.List;

import org.apms.bean.Request;
import org.apms.dao.IRequestDao;
import org.apms.service.IRequestService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:33:56
 *
 */

public class RequestServiceImpl implements IRequestService {
	private IRequestDao requestDao;
	
	@Override
	public List<Request> query() {
		// TODO Auto-generated method stub
		return requestDao.query();
	}

	@Override
	public List<Request> queryState(int state) {
		// TODO Auto-generated method stub
		return requestDao.queryState(state);
	}

	@Override
	public List<Request> queryUser(String userId) {
		// TODO Auto-generated method stub
		return requestDao.queryUser(userId);
	}

	@Override
	public List<Request> queryRtid(String trid) {
		// TODO Auto-generated method stub
		return requestDao.queryRtid(trid);
	}

	@Override
	public List<Request> queryApproval(String approval) {
		// TODO Auto-generated method stub
		return requestDao.queryApproval(approval);
	}

	@Override
	public List<Request> queryAssigner(String assigner) {
		// TODO Auto-generated method stub
		return requestDao.queryAssigner(assigner);
	}

	@Override
	public List<Request> queryDispose(String dispose) {
		// TODO Auto-generated method stub
		return requestDao.queryDispose(dispose);
	}

	@Override
	public List<Request> queryPhone(String phone) {
		// TODO Auto-generated method stub
		return requestDao.queryPhone(phone);
	}

	@Override
	public List<Request> queryTitle(String title) {
		// TODO Auto-generated method stub
		return requestDao.queryTitle(title);
	}

	@Override
	public List<Request> queryReason(String reason) {
		// TODO Auto-generated method stub
		return requestDao.queryReason(reason);
	}

	@Override
	public List<Request> queryAppendix(String appendix) {
		// TODO Auto-generated method stub
		return requestDao.queryAppendix(appendix);
	}

	@Override
	public List<Request> queryRemark(String remark) {
		// TODO Auto-generated method stub
		return requestDao.queryRemark(remark);
	}

	@Override
	public List<Request> queryTime(String time) {
		// TODO Auto-generated method stub
		return requestDao.queryTime(time);
	}

	@Override
	public List<Request> queryDid(String did) {
		// TODO Auto-generated method stub
		return requestDao.queryDid(did);
	}

	@Override
	public List<Request> queryUpdate(String updateTime) {
		// TODO Auto-generated method stub
		return requestDao.queryUpdate(updateTime);
	}

	@Override
	public void add(Request request) {
		// TODO Auto-generated method stub
		requestDao.add(request);
	}

	@Override
	public void delete(Request request) {
		// TODO Auto-generated method stub
		requestDao.delete(request);
	}

	@Override
	public void update(Request request) {
		// TODO Auto-generated method stub
		requestDao.update(request);
	}

	@Override
	public Request queryId(String id) {
		// TODO Auto-generated method stub
		return requestDao.queryId(id);
	}

	public IRequestDao getRequestDao() {
		return requestDao;
	}

	public void setRequestDao(IRequestDao requestDao) {
		this.requestDao = requestDao;
	}

}
