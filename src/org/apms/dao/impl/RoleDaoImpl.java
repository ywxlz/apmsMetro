package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.Role;
import org.apms.dao.IRoleDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午2:43:46
 *
 */

public class RoleDaoImpl extends HibernateDaoSupport implements IRoleDao {

	@Override
	public List<Role> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Role";
		List<Role> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public Role queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Role where id = ?";
		List<Role> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		Role role = new Role();
		if (list.size() == 1) {
			role = list.get(0);
		}
		return role;
	}

	@Override
	public List<Role> queryName(String name) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Role where name = ?";
		List<Role> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + name + "%"});
		return list;
	}

	@Override
	public void add(Role role) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(role);
	}

	@Override
	public void delete(Role role) {
		// TODO Auto-generated method stub
		// 获取要删除对象
		Role r = this.queryId(role.getId());
		//置0
		r.setMark(0);
		// 保存
		super.getHibernateTemplate().update(r);
	}

	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		// 获取要删除对象
		Role r = this.queryId(role.getId());
		// 修改
		r.setName(role.getName());
		// 保存
		super.getHibernateTemplate().update(r);
	}

}
