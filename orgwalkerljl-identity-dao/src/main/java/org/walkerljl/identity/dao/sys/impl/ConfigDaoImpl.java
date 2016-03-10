package org.walkerljl.identity.dao.sys.impl;

import org.springframework.stereotype.Component;
import org.walkerljl.identity.dao.sys.ConfigDao;
import org.walkerljl.identity.domain.sys.Config;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * ConfigDaoImpl
 *
 * @author lijunlin
 */
@Component("configDao")
public class ConfigDaoImpl extends BaseDaoImpl<Long, Config> implements ConfigDao {

	public ConfigDaoImpl() {
		super.baseNameSpace = "org.walkerljl.smart.dao.configDao";
	}

	public int updateStatusByKey2(String key) {
		return update(getNameSpace("updateStatusByKey"), key);
	}
}
