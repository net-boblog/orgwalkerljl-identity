package org.walkerljl.identity.dao.sys;

import org.walkerljl.identity.domain.sys.Config;
import org.walkerljl.smart.dao.BaseDao;

/**
 * 配置信息数据访问接口 
 *
 * @author lijunlin
 */
public interface ConfigDao extends BaseDao<Long, Config> {

	int updateStatusByKey2(String key);
}
