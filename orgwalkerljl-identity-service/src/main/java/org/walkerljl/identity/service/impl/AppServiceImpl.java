package org.walkerljl.identity.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.AppDao;
import org.walkerljl.identity.domain.App;
import org.walkerljl.identity.service.AppService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * AppServiceImpl
 * 
 * @author lijunlin
 */
@Service("appService")
public class AppServiceImpl extends JqueryDatatableBaseServiceImpl<Long, App> implements AppService {

	@Resource private AppDao appDao;
	
	@Override
	public BaseDao<Long, App> getDao() {
		return appDao;
	}
	
	@Override
	public Long insert(App app) {
		app.setToken("x");
		return super.insert(app);
	}
}