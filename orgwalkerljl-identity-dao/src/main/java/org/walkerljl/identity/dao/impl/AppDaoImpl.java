package org.walkerljl.identity.dao.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.AppDao;
import org.walkerljl.identity.domain.App;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * AppDao
 * 
 * @author lijunlin
 */
@Repository("appDao")
public class AppDaoImpl extends BaseDaoImpl<Long, App> implements AppDao {

}
