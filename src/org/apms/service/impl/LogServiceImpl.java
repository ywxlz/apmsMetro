package org.apms.service.impl;

import java.util.List;

import org.apms.bean.Log;
import org.apms.dao.ILogDao;
import org.apms.service.ILogService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:27:37
 *
 */

public class LogServiceImpl implements ILogService {
	private ILogDao logDao;
	
	@Override
	public List<Log> query() {
		// TODO Auto-generated method stub
		return logDao.query();
	}

	@Override
	public Log queryId(String id) {
		// TODO Auto-generated method stub
		return logDao.queryId(id);
	}

	@Override
	public List<Log> queryRid(String rid) {
		// TODO Auto-generated method stub
		return logDao.queryRid(rid);
	}

	@Override
	public List<Log> queryType(String type) {
		// TODO Auto-generated method stub
		return logDao.queryType(type);
	}

	@Override
	public List<Log> queryTime(String time) {
		// TODO Auto-generated method stub
		return logDao.queryTime(time);
	}

	@Override
	public List<Log> queryUser(String userId) {
		// TODO Auto-generated method stub
		return logDao.queryUser(userId);
	}

	@Override
	public List<Log> queryContext(String context) {
		// TODO Auto-generated method stub
		return logDao.queryContext(context);
	}

	@Override
	public List<Log> queryRemark(String remark) {
		// TODO Auto-generated method stub
		return logDao.queryRemark(remark);
	}

	@Override
	public void delete(Log log) {
		// TODO Auto-generated method stub
		logDao.delete(log);
	}

	@Override
	public void add(Log log) {
		// TODO Auto-generated method stub
		logDao.add(log);
	}

	@Override
	public void update(Log log) {
		// TODO Auto-generated method stub
		logDao.update(log);
	}

	public ILogDao getLogDao() {
		return logDao;
	}

	public void setLogDao(ILogDao logDao) {
		this.logDao = logDao;
	}

}
