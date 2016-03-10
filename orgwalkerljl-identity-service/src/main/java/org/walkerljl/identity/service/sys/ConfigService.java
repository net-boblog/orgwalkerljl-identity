package org.walkerljl.identity.service.sys;

import org.walkerljl.identity.domain.sys.Config;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * 应用配置业务接口 
 *
 * @author lijunlin
 */
public interface ConfigService extends JqueryDatatableBaseService<Long, Config> {

	void testTransaction();
}
