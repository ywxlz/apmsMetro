package org.apms.service;

import java.util.List;

import org.apms.bean.AllFunction;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 上午9:57:07
 *
 */

public interface IAllFunctionService {
	// 1.全部
	List<AllFunction> query();
	// 2.查id
	AllFunction queryId(String id);
	// 3.名字查
	List<AllFunction> queryName(String name);
	// 4.添加
	void add(AllFunction allFunction);
	// 5.删除
	void delete(AllFunction allFuction);
	// 6.改
	void update(AllFunction allFuction);
}
