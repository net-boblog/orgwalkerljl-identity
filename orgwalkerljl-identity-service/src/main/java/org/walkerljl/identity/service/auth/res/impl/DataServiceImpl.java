package org.walkerljl.identity.service.auth.res.impl;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.DataDao;
import org.walkerljl.identity.domain.auth.res.Data;
import org.walkerljl.identity.service.auth.res.DataService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

import javax.annotation.Resource;

/**
 * DataServiceImpl
 * 
 * @author lijunlin
 */
@Service("dataService")
public class DataServiceImpl extends JqueryDatatableBaseServiceImpl<Long, Data> implements DataService {

	@Resource private DataDao dataDao;
	
	@Override
	public BaseDao<Long, Data> getDao() {
		return dataDao;
	}
}