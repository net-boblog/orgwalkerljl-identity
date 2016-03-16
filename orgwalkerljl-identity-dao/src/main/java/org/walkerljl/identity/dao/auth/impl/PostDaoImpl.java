package org.walkerljl.identity.dao.auth.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.PostDao;
import org.walkerljl.identity.domain.auth.Post;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * PostDaoImpl
 * 
 * @author lijunlin
 */
@Repository("postDao")
public class PostDaoImpl extends BaseDaoImpl<Long, Post> implements PostDao {

}
