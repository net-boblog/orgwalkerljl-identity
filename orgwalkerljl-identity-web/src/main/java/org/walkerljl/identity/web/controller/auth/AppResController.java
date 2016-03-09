package org.walkerljl.identity.web.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.smart.mvc.BaseController;

/**
 * 应用资源管理
 * 
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/auth/res", method = {RequestMethod.POST, RequestMethod.GET})
public class AppResController extends BaseController {

	@RequestMapping(value = "", method = {RequestMethod.GET})
	public ModelAndView index(Long appId) {
		return null;
	}
}
