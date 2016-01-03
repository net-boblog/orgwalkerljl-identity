package org.walkerljl.identity.service.sys;

import org.walkerljl.identity.domain.sys.SysConfig;
import org.walkerljl.smart.service.JqueryDatatableBaseService;

/**
 * 系统配置业务接口 
 *
 * @author lijunlin
 */
public interface SysConfigService extends JqueryDatatableBaseService<SysConfig, Long> {

	void testTransaction();
}
