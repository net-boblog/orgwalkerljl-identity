package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.MenuDao;
import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * MenuDao
 * 
 * @author lijunlin
 */
@Repository("menuDao")
public class MenuDaoImpl extends BaseDaoImpl<Menu, Long> implements MenuDao {

}
