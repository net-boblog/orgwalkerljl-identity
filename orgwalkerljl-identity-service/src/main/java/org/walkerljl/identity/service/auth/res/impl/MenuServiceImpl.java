package org.walkerljl.identity.service.auth.res.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.MenuDao;
import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.identity.service.auth.res.MenuService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.BaseServiceImpl;

/**
 * MenuServiceImpl
 * 
 * @author lijunlin
 */
@Service("menuService")
public class MenuServiceImpl extends BaseServiceImpl<Menu, Long> implements MenuService {

	@Resource private MenuDao menuDao;
	
	@Override
	public BaseDao<Menu, Long> getDao() {
		return menuDao;
	}

}
