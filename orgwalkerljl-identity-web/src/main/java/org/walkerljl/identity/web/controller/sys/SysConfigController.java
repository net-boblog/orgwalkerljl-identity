package org.walkerljl.identity.web.controller.sys;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.commons.auth.Menu;
import org.walkerljl.identity.domain.sys.SysConfig;
import org.walkerljl.identity.service.sys.SysConfigService;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * 系统配置 
 *
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/sys/config", method = {RequestMethod.POST, RequestMethod.GET})
public class SysConfigController extends JqueryDatatableCurdTemplate<SysConfig> {

	@Resource private SysConfigService sysConfigService;
	
	public SysConfigController() {
		setPageTitle("系统配置管理");
		setObjectIdentifer("sysConfig");
		setTemplateBasePath("/sys/config");
		setParentMenus(new Menu("系统设置", null));
	}
	
	@Override
	public JqueryDatatableBaseService<Long, SysConfig> getJqueryDatatableBaseService() {
		return sysConfigService;
	}
	
	@RequestMapping(value = "testTransaction")
	public ModelAndView testTransaction() {
		sysConfigService.testTransaction();
		return toJSON("testTransaction");
	}
}