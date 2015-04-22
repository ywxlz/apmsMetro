package org.apms.dao;

import java.util.List;

import org.apms.bean.FunctionType;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午11:32:22
 *
 */

public interface IFunctionTypeDao {
	// 1.查全部
	List<FunctionType> query();
	// 2.查id
	FunctionType queryId(String id);
	// 3.查名称
	List<FunctionType> queryName(String name);
	// 4.删除
	void delete(FunctionType ft);
	// 5.添加
	void add(FunctionType ft);
	// 6.修改
	void update(FunctionType ft);
}
