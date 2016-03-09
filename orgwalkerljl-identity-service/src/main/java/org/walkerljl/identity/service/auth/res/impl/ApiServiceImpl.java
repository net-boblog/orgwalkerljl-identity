package org.walkerljl.identity.service.auth.res.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.ApiDao;
import org.walkerljl.identity.domain.auth.res.Api;
import org.walkerljl.identity.service.auth.res.ApiService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * ApiServiceImpl
 * 
 * @author lijunlin
 */
@Service("apiService")
public class ApiServiceImpl extends JqueryDatatableBaseServiceImpl<Long, Api> implements ApiService {

	@Resource private ApiDao apiDao;
	
	@Override
	public BaseDao<Long, Api> getDao() {
		return apiDao;
	}
}