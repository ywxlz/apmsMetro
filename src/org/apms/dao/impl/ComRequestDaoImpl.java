package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.ComRequest;
import org.apms.dao.IComRequestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午10:50:17
 *
 */

public class ComRequestDaoImpl extends HibernateDaoSupport implements
		IComRequestDao {

	@Override
	public List<ComRequest> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from ComRequest order by time desc";
		List<ComRequest> comList = super.getHibernateTemplate().find(hql);
		return comList;
	}

	@Override
	public List<ComRequest> queryTime(String time) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from ComRequest where time = ?";
		List<ComRequest> comList = super.getHibernateTemplate().find(hql, new Object[]{"%" + time + "%"});
		return comList;
	}

	@Override
	public List<ComRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from ComRequest where address = ?";
		List<ComRequest> comList = super.getHibernateTemplate().find(hql, new Object[]{"%" + address + "%"});
		return comList;
	}

	@Override
	public ComRequest queryId(String id) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from ComRequest where id = ?";
		List<ComRequest> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		// 创建对象接收
		ComRequest comRequest = new ComRequest();
		if (list.size() == 1) {
			comRequest = list.get(0);
		}
		return comRequest;
	}

	@Override
	public void delete(ComRequest comRequest) {
		// TODO Auto-generated method stub
		// 获取要删除对象
		ComRequest cr = this.queryId(comRequest.getId());
		// 删除标识符置为0
		cr.setMark(0);
		// 在数据库中修改
		super.getHibernateTemplate().update(cr);
	}

	@Override
	public void add(ComRequest comRequest) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(comRequest);
	}

	@Override
	public void update(ComRequest comRequest) {
		// TODO Auto-generated method stub
		// 获取对象
		ComRequest cr = this.queryId(comRequest.getId());
		cr.setAddress(comRequest.getAddress());
		cr.setTime(comRequest.getTime());
		super.getHibernateTemplate().update(cr);
	}

}
