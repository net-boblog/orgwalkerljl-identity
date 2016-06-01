package org.walkerljl.identity.service.sso.impl;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.sso.LoginInfoDao;
import org.walkerljl.identity.domain.sso.LoginInfo;
import org.walkerljl.identity.service.sso.LoginInfoService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

import javax.annotation.Resource;

/**
 * LoginInfoServiceImpl 
 *
 * @author lijunlin
 */
@Service("loginInfoService")
public class LoginInfoServiceImpl extends JqueryDatatableBaseServiceImpl<Long, LoginInfo> implements LoginInfoService {

	@Resource private LoginInfoDao loginInfoDao;
	
	@Override
	public BaseDao<Long, LoginInfo> getDao() {
		return loginInfoDao;
	}
}