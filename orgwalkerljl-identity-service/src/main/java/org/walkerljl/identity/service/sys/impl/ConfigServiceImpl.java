package org.walkerljl.identity.service.sys.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.walkerljl.identity.dao.sys.ConfigDao;
import org.walkerljl.identity.domain.sys.Config;
import org.walkerljl.identity.service.sys.ConfigService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

import javax.annotation.Resource;
import java.util.Date;

/**
 * ConfigServiceImpl 
 *
 * @author lijunlin
 */
@Service("configService")
public class ConfigServiceImpl extends JqueryDatatableBaseServiceImpl<Long, Config> implements ConfigService {

	@Resource private ConfigDao configDao;
	
	@Override
	public BaseDao<Long, Config> getDao() {
		return configDao;
	}

	@Override @Transactional(rollbackFor = Exception.class)
	public void testTransaction() {
		configDao.updateStatusByKey2("system.upgrading");
		
		for (int i = 1; i <= 2; i++) {
			Config sysConfig = new Config();
			sysConfig.setName(i + "");
			sysConfig.setKey(i + "");
			sysConfig.setValue(i + "");
			sysConfig.setRemark(i + "");
			sysConfig.setStatus(1);
			sysConfig.setCreator("lijunlin");
			sysConfig.setCreated(new Date());
			sysConfig.setModifier(sysConfig.getModifier());
			sysConfig.setModified(sysConfig.getCreated());
			if (i == 2) {
				throw new RuntimeException("testTransaction");
			}
		}
	}
}
