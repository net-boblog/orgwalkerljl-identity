package org.walkerljl.identity.web.controller.sys;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.walkerljl.identity.domain.sys.Config;
import org.walkerljl.identity.sdk.auth.Authentication;
import org.walkerljl.identity.sdk.auth.Menu;
import org.walkerljl.identity.service.sys.ConfigService;
import org.walkerljl.smart.mvc.ObjectIdentifier;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * 应用配置 
 *
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/sys/config", method = {RequestMethod.POST, RequestMethod.GET})
public class ConfigController extends JqueryDatatableCurdTemplate<Config> {

	@Resource private ConfigService configService;
	
	public ConfigController() {
		ObjectIdentifier objectIdentifier = new ObjectIdentifier("配置信息管理", "/sys/config");
		objectIdentifier.setParentMenus(new Menu[]{new Menu("系统设置", null)});
		setObjectIdentifier(objectIdentifier);
	}
	
	@Override
	public JqueryDatatableBaseService<Long, Config> getJqueryDatatableBaseService() {
		return configService;
	}
	
	@RequestMapping(value = "testTransaction")
	public ModelAndView testTransaction() {
		configService.testTransaction();
		return toJSON("testTransaction");
	}
}