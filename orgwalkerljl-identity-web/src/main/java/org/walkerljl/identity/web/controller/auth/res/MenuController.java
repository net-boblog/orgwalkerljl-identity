package org.walkerljl.identity.web.controller.auth.res;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.commons.data.model.tree.TreeNode;
import org.walkerljl.commons.util.NumUtils;
import org.walkerljl.identity.domain.App;
import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.identity.service.AppService;
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
	@Resource private AppService appService;
	
	@RequestMapping(value = "/loadMenuTree")
	public ModelAndView loadMenuTree(Long appId, Long id) {		
		if (id == null) {
			App app = appService.selectByKey(appId);
			TreeNode node = null;
			if (app != null) {
				node = new TreeNode();
				node.setId("0");
				node.setParentId("-1");
				node.setName(app.getName());
				node.setIcon("dir");
				node.setParent(true);
			}
			return toSimpleJSON(node, TreeNode.getZtreeNodeFormat());
		} else {
			Menu condition = new Menu();
			condition.setParentId(id);
			List<Menu> menus = menuService.selectList(condition);
			return toSimpleJSON(menus, TreeNode.getZtreeNodeFormat());
		}	
	}
}