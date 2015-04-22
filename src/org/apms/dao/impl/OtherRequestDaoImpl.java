package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.OtherRequest;
import org.apms.dao.IOtherRequestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午12:27:11
 *
 */

public class OtherRequestDaoImpl extends HibernateDaoSupport implements
		IOtherRequestDao {

	@Override
	public List<OtherRequest> query() {
		// TODO Auto-generated method stub
		// hql
		String hql = "from OtherRequest order by describe desc";
		List<OtherRequest> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public OtherRequest queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from OtherRequest where id = ?";
		List<OtherRequest> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		// 创建对象以接受
		OtherRequest otherRequest = new OtherRequest();
		//判断
		if (list.size() == 1) {
			otherRequest = list.get(0);
		}
		return otherRequest;
	}

	@Override
	public List<OtherRequest> queryDescribe(String describe) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from OtherRequest where describe = ?";
		List<OtherRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + describe + "%"});		
		return list;
	}

	@Override
	public List<OtherRequest> queryRid(String rid) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from OtherRequest where rid = ?";
		List<OtherRequest> list = super.getHibernateTemplate().find(hql, new Object[]{rid});		
		return list;
	}

	@Override
	public void delete(OtherRequest otherRequest) {
		// TODO Auto-generated method stub
		// 获取对象
		OtherRequest other = this.queryId(otherRequest.getId());
		// 置0
		other.setMark(0);
		// 保存
		super.getHibernateTemplate().update(other);
	}

	@Override
	public void add(OtherRequest otherRequest) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(otherRequest);
	}

	@Override
	public void update(OtherRequest otherRequest) {
		// TODO Auto-generated method stub
		// 获取对象
		OtherRequest other = this.queryId(otherRequest.getId());
		// 修改
		other.setDescribe(otherRequest.getDescribe());
		other.setRid(otherRequest.getRid());
		// 保存
		super.getHibernateTemplate().update(other);
	}

}
