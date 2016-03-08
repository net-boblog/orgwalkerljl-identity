package org.walkerljl.identity.service.auth.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.AuthorizationDao;
import org.walkerljl.identity.domain.auth.Authorization;
import org.walkerljl.identity.enums.auth.AuthObjectType;
import org.walkerljl.identity.enums.auth.AuthType;
import org.walkerljl.identity.service.auth.AuthorizationService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.enums.Status;
import org.walkerljl.smart.service.impl.BaseServiceImpl;

/**
 * AuthorizationServiceImpl
 *
 * @author lijunlin
 */
@Service("authorizationService")
public class AuthorizationServiceImpl extends BaseServiceImpl<Long, Authorization> implements AuthorizationService {

	@Resource private AuthorizationDao authorizationDao;
	
	@Override
	public BaseDao<Long, Authorization> getDao() {
		return authorizationDao;
	}

	@Override
	public List<Authorization> queryPostAuthsByUserId(String userId) {
		Authorization condition = new Authorization();
		condition.setObjectType(AuthObjectType.USER.getValue());
		condition.setObjectId(userId);
		condition.setAuthType(AuthType.POST.getValue());
		condition.setStatus(Status.ENABLED.getValue());
		return selectList(condition);
	}

	@Override
	public List<Authorization> queryRoleAuthsByUserId(String userId) {
		Authorization condition = new Authorization();
		condition.setObjectType(AuthObjectType.USER.getValue());
		condition.setObjectId(userId);
		condition.setAuthType(AuthType.ROLE.getValue());
		condition.setStatus(Status.ENABLED.getValue());
		return selectList(condition);
	}
}