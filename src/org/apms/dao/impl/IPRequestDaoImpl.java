package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.IPRequest;
import org.apms.dao.IIPRequestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:53:17
 *
 */

public class IPRequestDaoImpl extends HibernateDaoSupport implements
		IIPRequestDao {

	@Override
	public List<IPRequest> query() {
		// TODO Auto-generated method stub
		// hql
		String hql = "from IPRequest order by time desc";
		List<IPRequest> ipList = super.getHibernateTemplate().find(hql);
		return ipList;
	}

	@Override
	public IPRequest queryId(String id) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from IPRequest where id = ?";
		List<IPRequest> ipList = super.getHibernateTemplate().find(hql, new Object[]{id});
		IPRequest ip = new IPRequest();
		if (ipList.size() == 1) {
			ip = ipList.get(0);
		}
		return ip;
	}

	@Override
	public List<IPRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from IPRequest where address = ?";
		List<IPRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + address + "%"});
		return list;
	}

	@Override
	public List<IPRequest> queryTime(String time) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from IPRequest where time = ?";
		List<IPRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + time + "%"});
		return list;
	}

	@Override
	public void delete(IPRequest ip) {
		// TODO Auto-generated method stub
		// 获取要删除对象
		IPRequest ipRequest = this.queryId(ip.getId());
		// 置0
		ipRequest.setMark(0);
		//修改
		super.getHibernateTemplate().update(ipRequest);
	}

	@Override
	public void add(IPRequest ip) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(ip);
	}

	@Override
	public void update(IPRequest ip) {
		// TODO Auto-generated method stub
		// 获取要修改对象
		IPRequest ipr = this.queryId(ip.getId());
		// 修改
		ipr.setAddress(ip.getAddress());
		ipr.setCount(ip.getCount());
		ipr.setTime(ip.getTime());
		//数据库操作
		super.getHibernateTemplate().update(ipr);
	}

}
