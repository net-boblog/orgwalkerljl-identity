package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.ApiDao;
import org.walkerljl.identity.domain.auth.res.Api;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * ApiDaoImpl
 * 
 * @author lijunlin
 */
@Repository("apiDao")
public class ApiDaoImpl extends BaseDaoImpl<Long, Api> implements ApiDao {

}
