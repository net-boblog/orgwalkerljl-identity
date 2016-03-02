package org.walkerljl.identity.service.auth.res.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.AppDao;
import org.walkerljl.identity.domain.auth.res.App;
import org.walkerljl.identity.service.auth.res.AppService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * AppServiceImpl
 * 
 * @author lijunlin
 */
@Service("appService")
public class AppServiceImpl extends JqueryDatatableBaseServiceImpl<App, Long> implements AppService {

	@Resource private AppDao appDao;
	
	@Override
	public BaseDao<App, Long> getDao() {
		return appDao;
	}
	
	@Override
	public Long insert(App app) {
		app.setToken("x");
		return super.insert(app);
	}
}