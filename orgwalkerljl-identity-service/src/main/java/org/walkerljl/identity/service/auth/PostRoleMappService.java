package org.walkerljl.identity.service.auth;

import org.walkerljl.identity.domain.auth.PostRoleMapp;
import org.walkerljl.smart.service.BaseService;

import java.util.List;

/**
 * 岗位、角色映射业务接口
 *
 * @author lijunlin
 */
public interface PostRoleMappService extends BaseService<Long, PostRoleMapp> {

	/**
	 * 通过岗位ID列表查询岗位、角色映射列表
	 * @param postIds
	 * @return
	 */
	List<PostRoleMapp> selectByPostIds(List<Long> postIds);
}
