package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.Users;
import org.apms.dao.IUsersDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月2日 下午11:38:26
 *
 */

public class UsersDaoImpl extends HibernateDaoSupport implements IUsersDao {

	@Override
	public List<Users> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Users";
		List<Users> userList = super.getHibernateTemplate().find(hql);
		return userList;
	}

	@Override
	public void add(Users user) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(user);
	}

	@Override
	public void delete(Users user) {
		// TODO Auto-generated method stub
		// 将要删除的用户取出
		Users u = this.queryId(user.getId());
		// 将标志置为0
		u.setMark(0);
		// 在数据库中更新
		super.getHibernateTemplate().update(u);
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		// 取出要修改的对象
		Users u = this.queryId(user.getId());
		// 修改
		u.setDid(user.getDid());
		u.setPassword(user.getPassword());
		u.setRealName(user.getRealName());
		u.setRid(user.getRid());
		u.setSrc(user.getSrc());
		u.setUsername(user.getUsername());
		// 在数据库中修改
		super.getHibernateTemplate().update(u);
	}

	@Override
	public Users queryName(String name) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Users where username = ?";
		List<Users> list = super.getHibernateTemplate().find(hql, new Object[]{name});
		// 创建对象接收数据
		Users user = new Users();
		if (list.size() == 1) {
			user = list.get(0);
		}
		return user;
	}

	@Override
	public Users queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Users where id = ?";
		List<Users> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		//创建对象接收
		Users user = new Users();
		if (list.size() == 1) {
			user = list.get(0);
		}
		return user;
	}

	@Override
	public List<Users> queryDept(String dept) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Users where dept = ?";
		List<Users> list = super.getHibernateTemplate().find(hql, new Object[]{dept});
		return list;
	}

	@Override
	public List<Users> queryRole(String role) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Users where role = ?";
		List<Users> list = super.getHibernateTemplate().find(hql, new Object[]{role});
		return list;
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Users where username = ? and password = ?";
		List<Users> list = super.getHibernateTemplate().find(hql, new Object[]{username, password});
		// 创建boolean变量以接收判断
		boolean flag = false;
		if (list.size() == 1) {
			flag = true;
		}
		return flag;
	}

}
