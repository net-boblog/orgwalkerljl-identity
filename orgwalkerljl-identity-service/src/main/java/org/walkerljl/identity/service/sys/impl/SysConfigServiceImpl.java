package org.walkerljl.identity.service.sys.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.walkerljl.identity.dao.sys.SysConfigDao;
import org.walkerljl.identity.domain.sys.SysConfig;
import org.walkerljl.identity.service.sys.SysConfigService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.JqueryDatatableBaseServiceImpl;

/**
 * SysConfigServiceImpl 
 *
 * @author lijunlin
 */
@Service("sysConfigService")
public class SysConfigServiceImpl extends JqueryDatatableBaseServiceImpl<Long, SysConfig> implements SysConfigService {

	@Resource private SysConfigDao sysConfigDao;
	
	@Override
	public BaseDao<Long, SysConfig> getDao() {
		return sysConfigDao;
	}

	@Override @Transactional(rollbackFor = Exception.class)
	public void testTransaction() {
		sysConfigDao.updateStatusByKey2("system.upgrading");
		
		for (int i = 1; i <= 2; i++) {
			SysConfig sysConfig = new SysConfig();
			sysConfig.setName(i + "");
			sysConfig.setKey(i + "");
			sysConfig.setValue(i + "");
			sysConfig.setRemark(i + "");
			sysConfig.setStatus(1);
			sysConfig.setCreator("lijunlin");
			sysConfig.setCreatedTime(new Date());
			sysConfig.setModifier(sysConfig.getModifier());
			sysConfig.setModifiedTime(sysConfig.getModifiedTime());
			if (i == 2) {
				throw new RuntimeException("testTransaction");
			}
		}
	}
}
