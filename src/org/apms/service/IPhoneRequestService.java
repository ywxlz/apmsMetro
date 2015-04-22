package org.apms.service;

import java.util.List;

import org.apms.bean.PhoneRequest;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午12:35:28
 *
 */

public interface IPhoneRequestService {
	// 1.查全部
	List<PhoneRequest> query();
	// 2.查id
	PhoneRequest queryId(String id);
	// 3.查地址
	List<PhoneRequest> queryAddress(String address);
	// 4.查预约时间
	List<PhoneRequest> queryTime(String Time);
	// 5.查设备
	List<PhoneRequest> queryDevice(String device);
	// 6.查时间区间
	PhoneRequest queryDate(String date);
	// 7.添加 
	void add(PhoneRequest pr);
	// 8.删除
	void delete(PhoneRequest pr);
	// 9.修改
	void update(PhoneRequest pr);
}
