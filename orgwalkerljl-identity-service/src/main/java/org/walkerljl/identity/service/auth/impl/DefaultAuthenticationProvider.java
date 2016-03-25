package org.walkerljl.identity.service.auth.impl;

import java.util.List;

import javax.annotation.Resource;

import org.walkerljl.commons.collection.CollectionUtils;
import org.walkerljl.commons.collection.ListUtils;
import org.walkerljl.commons.util.StringUtils;
import org.walkerljl.identity.sdk.auth.AuthenticationProvider;
import org.walkerljl.identity.sdk.auth.Button;
import org.walkerljl.identity.sdk.auth.Menu;
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

	/** appId*/
	private Long appId;
	/** token*/
	private String token;
	
	@Resource private MenuService menuService;
	@Resource private AuthorizationService authorizationService;
	@Resource private RoleResMappService roleResMappService;
	@Resource private PostService postService;
	@Resource private PostRoleMappService postRoleMappService;
	
	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public List<Menu> getUserAuthMenus(String userId) {
		if (StringUtils.isBlank(userId)) {
			return null;
		}
		org.walkerljl.identity.domain.auth.res.Menu condition = new org.walkerljl.identity.domain.auth.res.Menu();
		List<org.walkerljl.identity.domain.auth.res.Menu> authMenus = menuService.selectList(condition);
		if (CollectionUtils.isEmpty(authMenus)) {
			return null;
		}
		List<Menu> menus = ListUtils.newArrayList();
		for (org.walkerljl.identity.domain.auth.res.Menu authMenu : authMenus) {
			menus.add(new Menu(authMenu.getId(), authMenu.getName(), authMenu.getParentId(), 
					authMenu.getOrder(), authMenu.getUrl(), authMenu.getIcon(), 
					authMenu.getCss(), authMenu.getResCodeStr()));
		}
		return menus;
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
		return true;
	}
}