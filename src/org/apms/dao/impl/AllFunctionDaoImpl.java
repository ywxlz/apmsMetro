package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.AllFunction;
import org.apms.dao.IAllFunctionDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午10:09:59
 *
 */

public class AllFunctionDaoImpl extends HibernateDaoSupport implements
		IAllFunctionDao {

	@Override
	public List<AllFunction> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from AllFunction";
		List<AllFunction> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public AllFunction queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from AllFuction where id = ?";
		List<AllFunction> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		// 创建对象用于接收
		AllFunction allFuction = new AllFunction();
		if (list.size() == 1 ) {
			allFuction = list.get(0);
		}
		return allFuction;
	}

	@Override
	public List<AllFunction> queryName(String name) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from AllFunction where name = ?";
		List<AllFunction> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + name + "%"});
		return list;
	}

	@Override
	public void add(AllFunction allFunction) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(allFunction);
	}

	@Override
	public void delete(AllFunction allFuction) {
		// TODO Auto-generated method stub
		// 获取要删除的对象
		AllFunction function = this.queryId(allFuction.getId());
		// 将对象删除标志置为0
		function.setMark(0);
		// 更新
		super.getHibernateTemplate().update(function);
	}

	@Override
	public void update(AllFunction allFuction) {
		// TODO Auto-generated method stub
		// 获取对象
		AllFunction function = this.queryId(allFuction.getId());
		// 修改
		function.setName(allFuction.getName());
		function.setState(allFuction.getState());
		function.setFid(allFuction.getFid());
		function.setRid(allFuction.getRid());
		function.setStatus(allFuction.getStatus());
		function.setUl(allFuction.getUl());
		// 在数据库中修改
		super.getHibernateTemplate().update(function);
	}

}
