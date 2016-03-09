package org.walkerljl.identity.service.auth.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.DeptDao;
import org.walkerljl.identity.domain.auth.Dept;
import org.walkerljl.identity.service.auth.DeptService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * DeptServiceImpl
 *
 * @author lijunlin
 */
@Service("deptService")
public class DeptServiceImpl extends JqueryDatatableBaseServiceImpl<Long, Dept> implements DeptService {

	@Resource private DeptDao deptDao;
	
	@Override
	public BaseDao<Long, Dept> getDao() {
		return deptDao;
	}
}