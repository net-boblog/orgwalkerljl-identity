package org.walkerljl.identity.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.commons.mvc.DefaultIndexController;

/**
 * IndexController 
 *
 * @author lijunlin
 */
@Controller
@RequestMapping(value = "", method = {RequestMethod.POST, RequestMethod.GET})
public class IndexController extends DefaultIndexController {
	
}
