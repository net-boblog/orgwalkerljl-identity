package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.AppDao;
import org.walkerljl.identity.domain.auth.res.App;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * AppDao
 * 
 * @author lijunlin
 */
@Repository("appDao")
public class AppDaoImpl extends BaseDaoImpl<App, Long> implements AppDao {

}
