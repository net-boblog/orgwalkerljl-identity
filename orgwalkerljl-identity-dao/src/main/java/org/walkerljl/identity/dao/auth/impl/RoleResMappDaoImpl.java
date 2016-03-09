package org.walkerljl.identity.dao.auth.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.RoleResMappDao;
import org.walkerljl.identity.domain.auth.RoleResMapp;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * RoleResMappDaoImpl
 * 
 * @author lijunlin
 */
@Repository("roleResMappDao")
public class RoleResMappDaoImpl extends BaseDaoImpl<Long, RoleResMapp> implements RoleResMappDao {

}
