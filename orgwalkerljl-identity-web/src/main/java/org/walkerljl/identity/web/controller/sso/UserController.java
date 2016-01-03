package org.walkerljl.identity.web.controller.sso;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.commons.auth.AuthType;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.identity.domain.sso.User;
import org.walkerljl.identity.service.sso.UserService;
import org.walkerljl.smart.domain.sys.Menu;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * UserController 
 *
 * @author lijunlin
 */
@Controller @Authentication(type = AuthType.CODE, code="sso-user")
@RequestMapping(value = "/sso/user", method = {RequestMethod.POST, RequestMethod.GET})
public class UserController extends JqueryDatatableCurdTemplate<User> {

	@Resource private UserService userService;
	
	public UserController() {
		setPageTitle("用户信息");
		setTemplateBasePath("/sso/user");
		setParentMenus(new Menu("单点登录", null));
	}

	@Override
	public JqueryDatatableBaseService<User, Long> getJqueryDatatableBaseService() {
		return userService;
	}
}