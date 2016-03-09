package org.walkerljl.identity.web.controller.auth.res;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.identity.service.auth.res.MenuService;
import org.walkerljl.smart.mvc.BaseController;

/**
 * MenuController
 * 
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/auth/res/menu", method = {RequestMethod.POST, RequestMethod.GET})
public class MenuController extends BaseController {

	@Resource private MenuService menuService;
	
	@RequestMapping(value = "/loadMenuTree", method = {RequestMethod.GET})
	public ModelAndView loadMenuTree(Long appId) {
		List<Menu> menus = null;
		return toSimpleJSON(menus);
	}
}