package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.UrlDao;
import org.walkerljl.identity.domain.auth.res.Url;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * UrlDaoImpl
 * 
 * @author lijunlin
 */
@Repository("urlDao")
public class UrlDaoImpl extends BaseDaoImpl<Long, Url> implements UrlDao {

}
