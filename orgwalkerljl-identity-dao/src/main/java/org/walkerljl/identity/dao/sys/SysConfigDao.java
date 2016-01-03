package org.walkerljl.identity.dao.sys;

import org.walkerljl.identity.domain.sys.SysConfig;
import org.walkerljl.smart.dao.BaseDao;

/**
 * 系统配置数据访问接口 
 *
 * @author lijunlin
 */
public interface SysConfigDao extends BaseDao<SysConfig, Long> {

	int updateStatusByKey2(String key);
}
