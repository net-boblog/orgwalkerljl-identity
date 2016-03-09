package org.walkerljl.identity.service.auth.res.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.ResCodeDao;
import org.walkerljl.identity.domain.auth.res.ResCode;
import org.walkerljl.identity.service.auth.res.ResCodeService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * ResCodeServiceImpl
 * 
 * @author lijunlin
 */
@Service("resCodeService")
public class ResCodeServiceImpl extends JqueryDatatableBaseServiceImpl<Long, ResCode> implements ResCodeService {

	@Resource private ResCodeDao resCodeDao;
	
	@Override
	public BaseDao<Long, ResCode> getDao() {
		return resCodeDao;
	}
}