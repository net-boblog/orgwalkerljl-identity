package org.walkerljl.identity.web.controller.auth.res;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.commons.auth.Menu;
import org.walkerljl.identity.domain.auth.res.App;
import org.walkerljl.identity.service.auth.res.AppService;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * AppController
 * 
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/auth/res/app", method = {RequestMethod.POST, RequestMethod.GET})
public class AppController extends JqueryDatatableCurdTemplate<App> {

	@Resource private AppService appService;
	
	public AppController() {
		setPageTitle("应用管理");
		setObjectIdentifer("authResApp");
		setTemplateBasePath("/auth/res/app");
		setParentMenus(new Menu("权限管理", null));
	}
	
	@Override
	public JqueryDatatableBaseService<Long, App> getJqueryDatatableBaseService() {
		return appService;
	}
}