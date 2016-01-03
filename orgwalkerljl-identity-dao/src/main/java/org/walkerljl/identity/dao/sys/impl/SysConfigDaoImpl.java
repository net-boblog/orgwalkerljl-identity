package org.walkerljl.identity.dao.sys.impl;

import org.springframework.stereotype.Component;
import org.walkerljl.identity.dao.sys.SysConfigDao;
import org.walkerljl.identity.domain.sys.SysConfig;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * SysConfigDaoImpl
 *
 * @author lijunlin
 */
@Component("sysConfigDao")
public class SysConfigDaoImpl extends BaseDaoImpl<SysConfig, Long> implements SysConfigDao {

	public SysConfigDaoImpl() {
		super.baseNameSpace = "org.walkerljl.smart.dao.sys.SysConfigDao";
	}

	public int updateStatusByKey2(String key) {
		return update(getNameSpace("updateStatusByKey"), key);
	}
}
