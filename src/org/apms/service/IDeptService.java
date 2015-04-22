package org.apms.service;

import java.util.List;

import org.apms.bean.Dept;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:02:58
 *
 */

public interface IDeptService {
	// 1.查全部
	List<Dept> query();
	// 2.查名称
	List<Dept> queryName(String name);
	// 3.查领导
	List<Dept> queryHeader(String headerName);
	// 4.查备注
	List<Dept> queryRemark(String remark);
	// 5.删除
	void delete(Dept dept);
	// 6.添加
	void add(Dept dept);
	// 7.修改
	void update(Dept dept);
	// 8.查id
	Dept queryId(String id);
}
