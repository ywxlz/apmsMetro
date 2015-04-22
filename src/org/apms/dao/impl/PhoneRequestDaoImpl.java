package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.PhoneRequest;
import org.apms.dao.IPhoneRequestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午1:38:31
 *
 */

public class PhoneRequestDaoImpl extends HibernateDaoSupport implements
		IPhoneRequestDao {

	@Override
	public List<PhoneRequest> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from PhoneRequest order by time desc";
		List<PhoneRequest> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public PhoneRequest queryId(String id) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from PhoneRequest where id = ?";
		List<PhoneRequest> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		// 创建对象 以接受
		PhoneRequest phoneRequest = new PhoneRequest();
		if (list.size() == 1) {
			phoneRequest = list.get(0);
		}
		return phoneRequest;
	}

	@Override
	public List<PhoneRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from PhoneRequest where address = ?";
		List<PhoneRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + address + "%"});
		return list;
	}

	@Override
	public List<PhoneRequest> queryTime(String time) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from PhoneRequest where time = ?";
		List<PhoneRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + time + "%"});
		return list;
	}

	@Override
	public List<PhoneRequest> queryDevice(String device) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from PhoneRequest where device = ?";
		List<PhoneRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + device + "%"});
		return list;
	}

	@Override
	public PhoneRequest queryDate(String date) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from PhoneRequest where startTime < ? and closeTime > ?";
		List<PhoneRequest> list = super.getHibernateTemplate().find(hql, new Object[]{date, date});
		PhoneRequest phoneRequest = new PhoneRequest();
		if (list.size() == 1) {
			phoneRequest = list.get(0);
		}
		return phoneRequest;
	}

	@Override
	public void add(PhoneRequest pr) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(pr);
	}

	@Override
	public void delete(PhoneRequest pr) {
		// TODO Auto-generated method stub
		// 获取要删除的对象
		PhoneRequest phoneRequest = this.queryId(pr.getId());
		// 置0
		phoneRequest.setMark(0);
		// 保存
		super.getHibernateTemplate().update(phoneRequest);
	}

	@Override
	public void update(PhoneRequest pr) {
		// TODO Auto-generated method stub
		// 获取要更新对象
		PhoneRequest phoneRequest = this.queryId(pr.getId());
		// 修改
		phoneRequest.setAddress(pr.getAddress());
		phoneRequest.setCloseTime(pr.getCloseTime());
		phoneRequest.setCount(pr.getCount());
		phoneRequest.setDevice(pr.getDevice());
		phoneRequest.setStartTime(pr.getStartTime());
		phoneRequest.setTime(pr.getTime());
		// 更新数据库
		super.getHibernateTemplate().update(phoneRequest);
	}

}
