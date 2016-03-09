package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.DataTypeDao;
import org.walkerljl.identity.domain.auth.res.DataType;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * DataTypeDaoImpl
 * 
 * @author lijunlin
 */
@Repository("dataTypeDao")
public class DataTypeDaoImpl extends BaseDaoImpl<Long, DataType> implements DataTypeDao {

}
