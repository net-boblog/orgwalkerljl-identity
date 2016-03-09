package org.walkerljl.identity.service.auth.res.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.res.DataTypeDao;
import org.walkerljl.identity.domain.auth.res.DataType;
import org.walkerljl.identity.service.auth.res.DataTypeService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * DataTypeServiceImpl
 * 
 * @author lijunlin
 */
@Service("dataTypeService")
public class DataTypeServiceImpl extends JqueryDatatableBaseServiceImpl<Long, DataType> implements DataTypeService {

	@Resource private DataTypeDao dataTypeDao;
	
	@Override
	public BaseDao<Long, DataType> getDao() {
		return dataTypeDao;
	}
}