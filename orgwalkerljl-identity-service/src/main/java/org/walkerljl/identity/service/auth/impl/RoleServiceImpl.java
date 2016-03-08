package org.walkerljl.identity.service.auth.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.RoleDao;
import org.walkerljl.identity.domain.auth.Role;
import org.walkerljl.identity.service.auth.RoleService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.BaseServiceImpl;

/**
 * RoleServiceImpl
 *
 * @author lijunlin
 */
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Long, Role> implements RoleService {

	@Resource private RoleDao roleDao;
	
	@Override
	public BaseDao<Long, Role> getDao() {
		return roleDao;
	}
}