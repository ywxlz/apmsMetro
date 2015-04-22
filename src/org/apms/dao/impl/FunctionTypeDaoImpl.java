package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.FunctionType;
import org.apms.dao.IFunctionTypeDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:36:27
 *
 */

public class FunctionTypeDaoImpl extends HibernateDaoSupport implements
		IFunctionTypeDao {

	@Override
	public List<FunctionType> query() {
		// TODO Auto-generated method stub
		// hql
		String hql = "from FunctionType";
		List<FunctionType> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public FunctionType queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from FunctionType where id = ?";
		List<FunctionType> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		FunctionType functionType = new FunctionType();
		if (list.size() == 1) {
			functionType = list.get(0);
		}
		return functionType;
	}

	@Override
	public List<FunctionType> queryName(String name) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from FunctionType where name = ?";
		List<FunctionType> list = super.getHibernateTemplate().find(hql, new Object[]{name});
		return list;
	}

	@Override
	public void delete(FunctionType ft) {
		// TODO Auto-generated method stub
		// 获取要删除的对象
		FunctionType functionType = this.queryId(ft.getId());
		//修改
		functionType.setMark(0);
		//在数据库中修改
		super.getHibernateTemplate().update(functionType);
	}

	@Override
	public void add(FunctionType ft) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(ft);
	}

	@Override
	public void update(FunctionType ft) {
		// TODO Auto-generated method stub
		// 获取要更新对象
		FunctionType functionType = this.queryId(ft.getId());
		// 修改 
		functionType.setName(ft.getName());
		// 在数据库中修改
		super.getHibernateTemplate().update(functionType);
	}

}
