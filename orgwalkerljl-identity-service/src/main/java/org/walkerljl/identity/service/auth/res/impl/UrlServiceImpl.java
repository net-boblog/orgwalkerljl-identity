package org.walkerljl.identity.service.auth.res.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.UrlDao;
import org.walkerljl.identity.domain.auth.res.Url;
import org.walkerljl.identity.service.auth.res.UrlService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * UrlServiceImpl
 * 
 * @author lijunlin
 */
@Service("urlService")
public class UrlServiceImpl extends JqueryDatatableBaseServiceImpl<Long, Url> implements UrlService {

	@Resource private UrlDao urlDao;
	
	@Override
	public BaseDao<Long, Url> getDao() {
		return urlDao;
	}
}