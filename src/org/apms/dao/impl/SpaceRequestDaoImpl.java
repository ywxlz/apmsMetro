package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.SpaceRequest;
import org.apms.dao.ISpaceRequestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午2:56:19
 *
 */

public class SpaceRequestDaoImpl extends HibernateDaoSupport implements
		ISpaceRequestDao {

	@Override
	public List<SpaceRequest> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from SpaceRequest order by time desc";
		List<SpaceRequest> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public SpaceRequest queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from SpaceRequest where id = ?";
		List<SpaceRequest> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		SpaceRequest spaceRequest = new SpaceRequest();
		if (list.size() == 1) {
			spaceRequest = list.get(0);
		}
		return spaceRequest;
	}

	@Override
	public List<SpaceRequest> querySpace(String interSapce) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from SpaceRequest where interSpace = ?";
		List<SpaceRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + interSapce + "%"});
		return list;
	}

	@Override
	public List<SpaceRequest> queryTime(String time) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from SpaceRequest where time = ?";
		List<SpaceRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + time + "%"});
		return list;
	}

	@Override
	public List<SpaceRequest> queryUsername(String username) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from SpaceRequest where username = ?";
		List<SpaceRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + username + "%"});
		return list;
	}

	@Override
	public void add(SpaceRequest spaceRequest) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(spaceRequest);
	}

	@Override
	public void delete(SpaceRequest spaceRequest) {
		// TODO Auto-generated method stub
		// 获取要删除的对象
		SpaceRequest space = this.queryId(spaceRequest.getId());
		// 置0
		space.setMark(0);
		// 保存
		super.getHibernateTemplate().update(space);
	}

	@Override
	public void update(SpaceRequest spaceRequest) {
		// TODO Auto-generated method stub
		// 获取要修改的对象
		SpaceRequest space = this.queryId(spaceRequest.getId());
		// 修改
		space.setInterSpace(spaceRequest.getInterSpace());
		space.setTime(spaceRequest.getTime());
		space.setUsername(spaceRequest.getUsername());
		// 保存
		super.getHibernateTemplate().update(space);
	}

}
