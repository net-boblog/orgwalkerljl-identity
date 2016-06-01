package org.walkerljl.identity.service.auth.impl;

import org.springframework.stereotype.Service;
import org.walkerljl.identity.dao.auth.PostDao;
import org.walkerljl.identity.domain.auth.Post;
import org.walkerljl.identity.service.auth.PostService;
import org.walkerljl.smart.dao.BaseDao;
import org.walkerljl.smart.service.impl.BaseServiceImpl;

import javax.annotation.Resource;

/**
 * PostServiceImpl
 *
 * @author lijunlin
 */
@Service("postService")
public class PostServiceImpl extends BaseServiceImpl<Long, Post> implements PostService {

	@Resource private PostDao postDao;
	
	@Override
	public BaseDao<Long, Post> getDao() {
		return postDao;
	}
}