package org.walkerljl.identity.dao.sso.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.sso.UserDao;
import org.walkerljl.identity.domain.sso.User;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 *
 * UserDaoImpl
 *
 * @author lijunlin
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<Long, User> implements UserDao {

	public UserDaoImpl() {
		super.baseNameSpace = "org.walkerljl.sso.dao.UserDao";
	}
}