
package org.walkerljl.identity.web;

import java.util.List;

import org.walkerljl.commons.collection.ListUtils;
import org.walkerljl.smart.domain.sys.Menu;
import org.walkerljl.smart.mvc.DefaultMvcSupporter;

/**
 * CustomizedMvcSupporter 
 *
 * @author lijunlin
 */
public class CustomizedMvcSupporter extends DefaultMvcSupporter {
	
	@Override
	public List<Menu> queryCurrentUserAuthMenus(String userId) {
		List<Menu> menus = ListUtils.newArrayList();
		
		menus.add(new Menu(1L, "首页", -1L, 1, "/", "icon-desktop", null));
		menus.add(new Menu(1000L, "系统设置", -1L, 1000, null, "icon-dashboard", null));
		menus.add(new Menu(1001L, "系统配置信息", 1000L, 1001, "/sys/config", "icon-cog", null));
		menus.add(new Menu(50L, "单点登录", -1L, 1, "/", "icon-desktop", null));
		menus.add(new Menu(51L, "用户信息", 50L, 1, "/sso/user", "icon-desktop", null));
		menus.add(new Menu(52L, "登录信息", 50L, 2, "/sso/loginInfo", "icon-desktop", null));
		return menus;
	}
}