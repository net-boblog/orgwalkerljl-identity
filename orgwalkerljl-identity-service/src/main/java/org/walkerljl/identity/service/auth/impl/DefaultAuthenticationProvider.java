package org.walkerljl.identity.service.auth.impl;

import java.util.List;

import javax.annotation.Resource;

import org.walkerljl.commons.auth.AuthenticationProvider;
import org.walkerljl.commons.auth.Button;
import org.walkerljl.commons.auth.Menu;
import org.walkerljl.commons.collection.CollectionUtils;
import org.walkerljl.commons.collection.ListUtils;
import org.walkerljl.commons.util.StringUtils;
import org.walkerljl.identity.domain.auth.Authorization;
import org.walkerljl.identity.domain.auth.PostRoleMapp;
import org.walkerljl.identity.domain.auth.res.App;
import org.walkerljl.identity.service.auth.AuthorizationService;
import org.walkerljl.identity.service.auth.PostRoleMappService;
import org.walkerljl.identity.service.auth.PostService;
import org.walkerljl.identity.service.auth.RoleResMappService;
import org.walkerljl.identity.service.auth.res.MenuService;

/**
 * 默认的权限提供者
 *
 * @author lijunlin
 */
public class DefaultAuthenticationProvider implements AuthenticationProvider {

	@Resource private MenuService menuService;
	@Resource private AuthorizationService authorizationService;
	@Resource private RoleResMappService roleResMappService;
	@Resource private PostService postService;
	@Resource private PostRoleMappService postRoleMappService;
	
	@Override
	public List<Menu> getUserAuthMenus(String userId) {
		if (StringUtils.isBlank(userId)) {
			return null;
		}
		App app = getCurApp();
		List<Long> authRoleIds = ListUtils.newArrayList();
//		if (app.getUsePostAuth()) {
//			authorizationService.queryPostAuthsByUserId(userId);
//		}
		authorizationService.queryRoleAuthsByUserId(userId);
		return null;
	}
	
	private App getCurApp() {
		return null;	
	}
	
	private List<Long> getAuthRoleIds(String userId) {
		List<Authorization> auths = authorizationService.querytPostAuthsByUserId(userId);
		if (CollectionUtils.isEmpty(auths)) {
			return null;
		}
		List<Long> authIds = ListUtils.newArrayList();
		for (Authorization auth : auths) {
			if (auth.isEnabled()) {
				authIds.add(auth.getAuthId());
			}
		}
		if (CollectionUtils.isEmpty(authIds)) {
			return null;
		}
		List<PostRoleMapp> postRoleMapps = postRoleMappService.selectByPostIds(authIds);
		if (CollectionUtils.isEmpty(postRoleMapps)) {
			return null;
		}
		List<Long> roleIds = ListUtils.newArrayList();
		for (PostRoleMapp postRoleMapp : postRoleMapps) {
			if (postRoleMapp.isEnabled()) {
				roleIds.add(postRoleMapp.getRoleId());
			}
		}
		return roleIds;
	}

	@Override
	public List<Menu> getUserAuthRootMenus(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> getUserAuthChildMenus(String userId, Long menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Button> getUserAuthButtons(String userId, Long menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUserAuthCodes(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateUserAuth(String userId, String authCode) {
		// TODO Auto-generated method stub
		return false;
	}
}