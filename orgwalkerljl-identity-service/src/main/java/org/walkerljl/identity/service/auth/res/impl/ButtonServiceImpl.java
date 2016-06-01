package org.walkerljl.identity.service.auth.res.impl;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.ButtonDao;
import org.walkerljl.identity.domain.auth.res.Button;
import org.walkerljl.identity.service.auth.res.ButtonService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

import javax.annotation.Resource;

/**
 * ButtonServiceImpl
 * 
 * @author lijunlin
 */
@Service("buttonService")
public class ButtonServiceImpl extends JqueryDatatableBaseServiceImpl<Long, Button> implements ButtonService {

	@Resource private ButtonDao buttonDao;
	
	@Override
	public BaseDao<Long, Button> getDao() {
		return buttonDao;
	}
}