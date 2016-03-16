package org.walkerljl.identity.dao.auth.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.RoleDao;
import org.walkerljl.identity.domain.auth.Role;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * RoleDaoImpl
 * 
 * @author lijunlin
 */
@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Long, Role> implements RoleDao {

}
