package org.walkerljl.identity.web.controller.auth.res;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.smart.mvc.BaseController;

/**
 * 权限资源管理
 * 
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/auth/res", method = {RequestMethod.POST, RequestMethod.GET})
public class ResController extends BaseController {

	public ResController() {
		setTemplateBasePath("/auth/res");
	}
	
	@RequestMapping(value = "", method = {RequestMethod.GET})
	public ModelAndView index(Long appId) {
		return toViewResult(getTemplate("index"));
	}
}