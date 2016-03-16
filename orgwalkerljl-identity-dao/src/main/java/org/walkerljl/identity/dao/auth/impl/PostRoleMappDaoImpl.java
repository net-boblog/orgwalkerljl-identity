package org.walkerljl.identity.dao.auth.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.PostRoleMappDao;
import org.walkerljl.identity.domain.auth.PostRoleMapp;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * PostRoleMappDaoImpl
 * 
 * @author lijunlin
 */
@Repository("postRoleMappDao")
public class PostRoleMappDaoImpl extends BaseDaoImpl<Long, PostRoleMapp> implements PostRoleMappDao {

}
