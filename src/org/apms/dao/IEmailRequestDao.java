package org.apms.dao;

import java.util.List;

import org.apms.bean.EmailRequest;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:17:10
 *
 */

public interface IEmailRequestDao {
	// 1.查全部
	List<EmailRequest> query();
	// 2.查id
	EmailRequest queryId(String id);
	// 3.查内存空间
	List<EmailRequest> querySpace(String interSpace);
	// 4.查地址
	List<EmailRequest> queryAddress(String address);
	// 5.查用户名
	List<EmailRequest> queryUsername(String username);
	// 6.添加
	void add(EmailRequest emailRequest);
	// 7.删除
	void delete(EmailRequest emailRequest);
	// 8.修改
	void update(EmailRequest emailRequest);
}
