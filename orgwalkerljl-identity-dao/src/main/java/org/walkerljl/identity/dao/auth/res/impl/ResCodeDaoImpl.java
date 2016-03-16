package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.ResCodeDao;
import org.walkerljl.identity.domain.auth.res.ResCode;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * ResCodeDaoImpl
 * 
 * @author lijunlin
 */
@Repository("resCodeDao")
public class ResCodeDaoImpl extends BaseDaoImpl<Long, ResCode> implements ResCodeDao {

}
