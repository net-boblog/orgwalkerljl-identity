package org.walkerljl.identity.service.auth.impl;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.PostRoleMappDao;
import org.walkerljl.identity.domain.auth.PostRoleMapp;
import org.walkerljl.identity.service.auth.PostRoleMappService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.BaseServiceImpl;

import javax.annotation.Resource;
import java.util.List;

/**
 * PostRoleMappServiceImpl
 *
 * @author lijunlin
 */
@Service("postRoleMappService")
public class PostRoleMappServiceImpl extends BaseServiceImpl<Long, PostRoleMapp> implements PostRoleMappService {

	@Resource private PostRoleMappDao postRoleMappDao;
	
	@Override
	public BaseDao<Long, PostRoleMapp> getDao() {
		return postRoleMappDao;
	}

	@Override
	public List<PostRoleMapp> selectByPostIds(List<Long> postIds) {
		// TODO Auto-generated method stub
		return null;
	}
}