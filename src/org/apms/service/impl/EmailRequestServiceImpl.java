package org.apms.service.impl;

import java.util.List;

import org.apms.bean.EmailRequest;
import org.apms.dao.IEmailRequestDao;
import org.apms.dao.impl.EmailRequestDaoImpl;
import org.apms.service.IEmailRequestService;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午3:21:25
 *
 */

public class EmailRequestServiceImpl implements IEmailRequestService {
	private IEmailRequestDao emailRequestDao;
	
	@Override
	public List<EmailRequest> query() {
		// TODO Auto-generated method stub
		return emailRequestDao.query();
	}

	@Override
	public EmailRequest queryId(String id) {
		// TODO Auto-generated method stub
		return emailRequestDao.queryId(id);
	}

	@Override
	public List<EmailRequest> querySpace(String interSpace) {
		// TODO Auto-generated method stub
		return emailRequestDao.querySpace(interSpace);
	}

	@Override
	public List<EmailRequest> queryAddress(String address) {
		// TODO Auto-generated method stub
		return emailRequestDao.queryAddress(address);
	}

	@Override
	public List<EmailRequest> queryUsername(String username) {
		// TODO Auto-generated method stub
		return emailRequestDao.queryUsername(username);
	}

	@Override
	public void add(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		emailRequestDao.add(emailRequest);
	}

	@Override
	public void delete(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		emailRequestDao.delete(emailRequest);
	}

	@Override
	public void update(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		emailRequestDao.update(emailRequest);
	}

	public IEmailRequestDao getEmailRequestDao() {
		return emailRequestDao;
	}

	public void setEmailRequestDao(IEmailRequestDao emailRequestDao) {
		this.emailRequestDao = emailRequestDao;
	}

}
