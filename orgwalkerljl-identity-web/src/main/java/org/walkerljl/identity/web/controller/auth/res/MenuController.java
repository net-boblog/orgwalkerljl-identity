package org.walkerljl.identity.web.controller.auth.res;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.commons.auth.Authentication;
import org.walkerljl.smart.mvc.BaseController;

/**
 * MenuController
 * 
 * @author lijunlin
 */
@Controller @Authentication
@RequestMapping(value = "/auth/res/menu", method = {RequestMethod.POST, RequestMethod.GET})
public class MenuController extends BaseController {

}
