package org.walkerljl.identity.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.commons.auth.Menu;
import org.walkerljl.identity.domain.App;
import org.walkerljl.identity.service.AppService;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * 应用
 * 
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/app", method = {RequestMethod.POST, RequestMethod.GET})
public class AppController extends JqueryDatatableCurdTemplate<App> {

	@Resource private AppService appService;
	
	public AppController() {
		setPageTitle("应用管理");
		setObjectIdentifer("app");
		setTemplateBasePath("/app");
		setParentMenus(new Menu("权限管理", null));
	}
	
	@Override
	public JqueryDatatableBaseService<Long, App> getJqueryDatatableBaseService() {
		return appService;
	}
}