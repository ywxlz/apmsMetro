package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.Log;
import org.apms.dao.ILogDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午12:09:34
 *
 */

public class LogDaoImpl extends HibernateDaoSupport implements ILogDao {

	@Override
	public List<Log> query() {
		// TODO Auto-generated method stub
		// hql
		String hql = "from Log";
		List<Log> logList = super.getHibernateTemplate().find(hql);
		return logList;
	}

	@Override
	public Log queryId(String id) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from Log where id = ?";
		List<Log> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		Log log = new Log();
		if (list.size() == 1) {
			log = list.get(0);
		}
		return log;
	}

	@Override
	public List<Log> queryRid(String rid) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from Log where rid = ?";
		List<Log> list = super.getHibernateTemplate().find(hql, new Object[]{rid});
		return list;
	}

	@Override
	public List<Log> queryType(String type) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Log where type = ?";
		List<Log> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + type + "%"});
		return list;
	}

	@Override
	public List<Log> queryTime(String time) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Log where time = ?";
		List<Log> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + time + "%"});
		return list;
	}

	@Override
	public List<Log> queryUser(String userId) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Log where userId = ?";
		List<Log> list = super.getHibernateTemplate().find(hql, new Object[]{userId});
		return list;
	}

	@Override
	public List<Log> queryContext(String context) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Log where context = ?";
		List<Log> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + context + "%"});
		return list;
	}

	@Override
	public List<Log> queryRemark(String remark) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Log where remark = ?";
		List<Log> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + remark + "%"});
		return list;
	}

	@Override
	public void delete(Log log) {
		// TODO Auto-generated method stub
		// 获取要删除对象
		Log l = this.queryId(log.getId());
		// 置0
		l.setMark(0);
		// 保存
		super.getHibernateTemplate().update(l);
	}

	@Override
	public void add(Log log) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(log);
	}

	/**
	 * 修改Log ， 一般来说是不允许调用的
	 */
	@Override
	public void update(Log log) {
		// TODO Auto-generated method stub
		// 获取要修改对象
		Log l = this.queryId(log.getId());
		// 修改
		l.setContext(log.getContext());
		l.setRemark(log.getRemark());
		l.setRid(log.getRid());
		l.setTime(log.getTime());
		l.setType(log.getType());
		l.setUserId(log.getUserId());
		// 保存
		super.getHibernateTemplate().update(l);
	}

}
