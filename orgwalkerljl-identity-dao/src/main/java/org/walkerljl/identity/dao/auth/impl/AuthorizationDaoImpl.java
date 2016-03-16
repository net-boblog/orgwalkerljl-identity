package org.walkerljl.identity.dao.auth.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.AuthorizationDao;
import org.walkerljl.identity.domain.auth.Authorization;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * AuthorizationDaoImpl
 * 
 * @author lijunlin
 */
@Repository("authorizationDao")
public class AuthorizationDaoImpl extends BaseDaoImpl<Long, Authorization> implements AuthorizationDao {

}
