package org.walkerljl.identity.service.auth;

import java.util.List;

import org.walkerljl.identity.domain.auth.RoleResMapp;
import org.walkerljl.smart.service.BaseService;

/**
 * 角色、资源映射业务接口
 *
 * @author lijunlin
 */
public interface RoleResMappService extends BaseService<Long, RoleResMapp> {

	/**
	 * 根据角色ID列表获取角色、资源授权
	 */
	List<RoleResMapp> queryByRoleIds(List<Long> roleIds);
	
	/**
	 * 根据角色ID列表获取授权的资源码ID列表
	 * @param roleIds
	 * @return
	 */
	List<Long> queryAuthResCodeIdsByRoleIds(List<Long> roleIds);
}
