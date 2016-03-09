package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.DataDao;
import org.walkerljl.identity.domain.auth.res.Data;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * DataDaoImpl
 * 
 * @author lijunlin
 */
@Repository("dataDao")
public class DataDaoImpl extends BaseDaoImpl<Long, Data> implements DataDao {

}
