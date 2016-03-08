package org.walkerljl.identity.service.auth;

import java.util.List;

import org.walkerljl.identity.domain.auth.Authorization;
import org.walkerljl.smart.service.BaseService;

/**
 * 授权业务接口
 *
 * @author lijunlin
 */
public interface AuthorizationService extends BaseService<Long, Authorization> {

	/**
	 * 根据用户ID查询岗位授权
	 * @param userId
	 * @return
	 */
	List<Authorization> queryPostAuthsByUserId(String userId);
	
	/**
	 * 根据用户ID查询角色授权
	 * @param userId
	 * @return
	 */
	List<Authorization> queryRoleAuthsByUserId(String userId);
}
