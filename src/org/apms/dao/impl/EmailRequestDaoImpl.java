package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.EmailRequest;
import org.apms.dao.IEmailRequestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:21:50
 *
 */

public class EmailRequestDaoImpl extends HibernateDaoSupport implements
		IEmailRequestDao {

	@Override
	public List<EmailRequest> query() {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from EmailRequest order by time desc";
		List<EmailRequest> emailList = super.getHibernateTemplate().find(hql);
		return emailList;
	}

	@Override
	public EmailRequest queryId(String id) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from EmailRequest where id = ?";
		List<EmailRequest> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		// 创建对象用于接收
		EmailRequest emailRequest = new EmailRequest();
		if (list.size() == 1) {
			emailRequest = list.get(0);
		}
		return emailRequest;
	}

	@Override
	public List<EmailRequest> querySpace(String interSpace) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from EmailRequest where interSpace = ?";
		List<EmailRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + interSpace + "%"});
		return list;
	}

	@Override
	public List<EmailRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from EmailRequest where address = ?";
		List<EmailRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + address + "%"});
		return list;
	}

	@Override
	public List<EmailRequest> queryUsername(String username) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from EmailRequest where username = ?";
		List<EmailRequest> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + username + "%"});
		return list;
	}

	@Override
	public void add(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(emailRequest);
	}

	@Override
	public void delete(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		// 获取要删除对象
		EmailRequest er = this.queryId(emailRequest.getId());
		// 置删除标志为0
		er.setMark(0);
		// 在数据库中修改
		super.getHibernateTemplate().update(er);
	}

	@Override
	public void update(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		// 获取要修改对象
		EmailRequest er = this.queryId(emailRequest.getId());
		// 修改对象
		er.setAddress(emailRequest.getAddress());
		er.setInterSpace(emailRequest.getInterSpace());
		er.setUsername(emailRequest.getUsername());
		// 在数据库中修改
		super.getHibernateTemplate().update(er);
	}

}
