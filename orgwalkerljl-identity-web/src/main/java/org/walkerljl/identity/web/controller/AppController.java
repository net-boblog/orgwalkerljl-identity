package org.walkerljl.identity.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.identity.domain.App;
import org.walkerljl.identity.sdk.auth.Authentication;
import org.walkerljl.identity.sdk.auth.Menu;
import org.walkerljl.identity.service.AppService;
import org.walkerljl.smart.mvc.ObjectIdentifier;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

import javax.annotation.Resource;

/**
 * 应用
 * 
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/identity/app", method = {RequestMethod.POST, RequestMethod.GET})
public class AppController extends JqueryDatatableCurdTemplate<App> {

	@Resource private AppService appService;
	
	public AppController() {
		ObjectIdentifier objectIdentifier = new ObjectIdentifier("应用管理", "/identity/app");
		objectIdentifier.setParentMenus(new Menu[]{new Menu("权限管理", null)});
		setObjectIdentifier(objectIdentifier);
	}
	
	@Override
	public JqueryDatatableBaseService<Long, App> getJqueryDatatableBaseService() {
		return appService;
	}
}