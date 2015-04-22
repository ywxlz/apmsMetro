package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.Dept;
import org.apms.dao.IDeptDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:08:09
 *
 */

public class DeptDaoImpl extends HibernateDaoSupport implements IDeptDao {

	@Override
	public List<Dept> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Dept";
		List<Dept> deptList = super.getHibernateTemplate().find(hql);
		return deptList;
	}

	@Override
	public List<Dept> queryName(String name) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from Dept where name = ?";
		List<Dept> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + name + "%"});
		return list;
	}

	@Override
	public List<Dept> queryHeader(String headerName) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from Dept where headerName = ?";
		List<Dept> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + headerName + "%"});
		return list;
	}

	@Override
	public List<Dept> queryRemark(String remark) {
		// TODO Auto-generated method stub
		String hql = "from Dept where remark = ?";
		List<Dept> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + remark + "%"});
		return list;
	}

	@Override
	public void delete(Dept dept) {
		// TODO Auto-generated method stub
		// 获取对象
		Dept d = this.queryId(dept.getId());
		// 置删除标志为0
		d.setMark(0);
		// 从数据库中修改
		super.getHibernateTemplate().update(d);
	}

	@Override
	public void add(Dept dept) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(dept);
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		// 获取对象
		Dept d = this.queryId(dept.getId());
		// 修改
		d.setHeaderName(dept.getHeaderName());
		d.setName(dept.getName());
		d.setRemark(dept.getRemark());
		// 在数据库中修改
		super.getHibernateTemplate().update(d);
	}

	@Override
	public Dept queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Dept where id = ?";
		List<Dept> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		// 创建对象yi接收
		Dept dept = new Dept();
		if (list.size() == 1) {
			dept = list.get(0);
		}
		return dept;
	}

}
