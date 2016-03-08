package org.walkerljl.identity.dao.sso.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.sso.LoginInfoDao;
import org.walkerljl.identity.domain.sso.LoginInfo;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * LoginInfoDaoImpl 
 *
 * @author lijunlin
 */
@Repository("loginInfoDao")
public class LoginInfoDaoImpl extends BaseDaoImpl<Long, LoginInfo> implements LoginInfoDao {

}
