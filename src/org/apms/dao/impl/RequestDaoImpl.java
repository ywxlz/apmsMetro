package org.apms.dao.impl;

import java.util.List;

import org.apms.bean.Request;
import org.apms.dao.IRequestDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 *@author lwxyz
 *@version 2015年3月3日 下午2:08:20
 *
 */

public class RequestDaoImpl extends HibernateDaoSupport implements IRequestDao {

	@Override
	public List<Request> query() {
		// TODO Auto-generated method stub
		// hql
		String hql = "from Request";
		List<Request> list = super.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public List<Request> queryState(int state) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where state = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{state});
		return list;
	}

	@Override
	public List<Request> queryUser(String userId) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where userId = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{userId});
		return list;
	}

	@Override
	public List<Request> queryRtid(String trid) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where rtid = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{trid});
		return list;
	}

	@Override
	public List<Request> queryApproval(String approval) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where approval = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + approval + "%"});
		return list;
	}

	@Override
	public List<Request> queryAssigner(String assigner) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where assigner = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + assigner + "%"});
		return list;
	}

	@Override
	public List<Request> queryDispose(String dispose) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where dispose = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + dispose + "%"});
		return list;
	}

	@Override
	public List<Request> queryPhone(String phone) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where phone = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{phone});
		return list;
	}

	@Override
	public List<Request> queryTitle(String title) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where title = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + title + "%"});
		return list;
	}

	@Override
	public List<Request> queryReason(String reason) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where reason = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + reason + "%"});
		return list;
	}

	@Override
	public List<Request> queryAppendix(String appendix) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where appendix = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + appendix + "%"});
		return list;
	}

	@Override
	public List<Request> queryRemark(String remark) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where remark = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + remark + "%"});
		return list;
	}

	@Override
	public List<Request> queryTime(String time) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where time = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + time + "%"});
		return list;
	}

	@Override
	public List<Request> queryDid(String did) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where did = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{did});
		return list;
	}

	@Override
	public List<Request> queryUpdate(String updateTime) {
		// TODO Auto-generated method stub
		// hql 
		String hql = "from Request where updateTime = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{"%" + updateTime + "%"});
		return list;
	}

	@Override
	public void add(Request request) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(request);
	}

	@Override
	public void delete(Request request) {
		// TODO Auto-generated method stub
		// 获取要删除对象
		Request r = this.queryId(request.getId());
		// 置0
		r.setMark(0);
		// 保存
		super.getHibernateTemplate().update(r);
	}

	@Override
	public void update(Request request) {
		// TODO Auto-generated method stub
		// 获取修改对象
		Request r = this.queryId(request.getId());
		// 修改
		r.setAppendix(request.getAppendix());
		r.setApproval(request.getApproval());
		r.setAssigner(request.getAssigner());
		r.setDid(request.getDid());
		r.setDispose(request.getDispose());
		r.setPhone(request.getPhone());
		r.setReason(request.getReason());
		r.setRemark(request.getRemark());
		r.setRtid(request.getRtid());
		r.setState(request.getState());
		r.setTime(request.getTime());
		r.setTitle(request.getTitle());
		r.setUpdateTime(request.getUpdateTime());
		r.setUserId(request.getUserId());
		// 保存
		super.getHibernateTemplate().update(r);
	}

	@Override
	public Request queryId(String id) {
		// TODO Auto-generated method stub
		// hql
		String hql = "from Request where id = ?";
		List<Request> list = super.getHibernateTemplate().find(hql, new Object[]{id});
		Request request = new Request();
		if (list.size() == 1) {
			request = list.get(0);
		}
		return request;
	}

}
