package org.walkerljl.identity.web.controller.sso;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.commons.auth.AuthType;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.commons.auth.Menu;
import org.walkerljl.identity.domain.sso.LoginInfo;
import org.walkerljl.identity.service.sso.LoginInfoService;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * LoginInfoController 
 *
 * @author lijunlin
 */
@Controller @Authentication(type = AuthType.CODE, code = "sso-logininfo")
@RequestMapping(value = "/sso/loginInfo", method = {RequestMethod.POST, RequestMethod.GET})
public class LoginInfoController extends JqueryDatatableCurdTemplate<LoginInfo> {

	@Resource private LoginInfoService loginInfoService;
	
	public LoginInfoController() {
		setPageTitle("登录信息");
		setTemplateBasePath("/sso/loginInfo");
		setParentMenus(new Menu("单点登录", null));
		//禁用按钮
		setButtonActives(new Integer[]{0,0,0,1,0,0,0});
	}

	@Override
	public JqueryDatatableBaseService<LoginInfo, Long> getJqueryDatatableBaseService() {
		return loginInfoService;
	}
}