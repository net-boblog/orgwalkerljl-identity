package org.walkerljl.identity.service.auth.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.walkerljl.commons.collection.CollectionUtils;
import org.walkerljl.commons.collection.ListUtils;
import org.walkerljl.identity.dao.auth.RoleResMappDao;
import org.walkerljl.identity.domain.auth.RoleResMapp;
import org.walkerljl.identity.service.auth.RoleResMappService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.BaseServiceImpl;

/**
 * RoleResMappServiceImpl
 *
 * @author lijunlin
 */
@Service("roleResMappService")
public class RoleResMappServiceImpl extends BaseServiceImpl<Long, RoleResMapp> implements RoleResMappService {

	@Resource private RoleResMappDao roleResMappDao;
	
	@Override
	public BaseDao<Long, RoleResMapp> getDao() {
		return roleResMappDao;
	}

	@Override
	public List<RoleResMapp> queryByRoleIds(List<Long> roleIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Long> queryAuthResCodeIdsByRoleIds(List<Long> roleIds) {
		if (CollectionUtils.isEmpty(roleIds)) {
			return null;
		}
		List<RoleResMapp> roleResMapps = queryByRoleIds(roleIds);
		if (CollectionUtils.isEmpty(roleResMapps)) {
			return null;
		}
		List<Long> resCodeIds = ListUtils.newArrayList();
		for (RoleResMapp roleResMapp : roleResMapps) {
			if (roleResMapp.isEnabled()) {
				resCodeIds.add(roleResMapp.getResCodeId());
			}
		}
		return resCodeIds;
	}
}