package org.walkerljl.identity.service.auth.res.impl;

import java.util.List;

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
public class MenuServiceImpl extends BaseServiceImpl<Long, Menu> implements MenuService {

	@Resource private MenuDao menuDao;
	
	@Override
	public BaseDao<Long, Menu> getDao() {
		return menuDao;
	}

	@Override
	public List<Menu> queryAuthMenusByResCodeIds(List<Long> resCodeIds) {
		return null;
	}
}
