package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.RequestType;
import org.apms.dao.IRequestTypeDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午2:33:46
 *
 */

public class RequestTypeDaoImpl extends HibernateDaoSupport implements
		IRequestTypeDao {

	@Override
	public List<RequestType> query() {
		// TODO Auto-generated method stub
		// hql
		String hql = "from RequestType";
		List<RequestType> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public RequestType queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from RequestType where id = ?";
		List<RequestType> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		RequestType rt = new RequestType();
		if (list.size() == 1) {
			rt = list.get(0);
		}
		return rt;
	}

	@Override
	public List<RequestType> queryName(String name) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from RequestType where name = ?";
		List<RequestType> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + name + "%"});
		return list;
	}

	@Override
	public void add(RequestType rt) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(rt);
	}

	@Override
	public void delete(RequestType rt) {
		// TODO Auto-generated method stub
		// 获取要删除的对象
		RequestType requestType = this.queryId(rt.getId());
		// 置0
		requestType.setMark(0);
		//保存
		super.getHibernateTemplate().update(requestType);
	}

	@Override
	public void update(RequestType rt) {
		// TODO Auto-generated method stub
		// 获取要修改的对象
		RequestType requestType = this.queryId(rt.getId());
		//修改
		requestType.setName(rt.getName());
		// 保存
		super.getHibernateTemplate().update(requestType);
	}

}
