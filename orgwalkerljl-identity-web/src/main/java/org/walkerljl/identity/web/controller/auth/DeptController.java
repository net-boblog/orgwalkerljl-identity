package org.walkerljl.identity.web.controller.auth;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.walkerljl.identity.domain.auth.Dept;
import org.walkerljl.identity.sdk.auth.AuthType;
import org.walkerljl.identity.sdk.auth.Authentication;
import org.walkerljl.identity.service.auth.DeptService;
import org.walkerljl.smart.mvc.template.JqueryDatatableCurdTemplate;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * 权限部门
 * 
 * @author lijunlin
 */
@Controller @Authentication(type = AuthType.CODE, code="auth-dept")
@RequestMapping(value = "/identity/auth/dept", method = {RequestMethod.POST, RequestMethod.GET})
public class DeptController extends JqueryDatatableCurdTemplate<Dept> {

	@Resource DeptService deptService;
	
	@Override
	public JqueryDatatableBaseService<Long, Dept> getJqueryDatatableBaseService() {
		return deptService;
	}
}