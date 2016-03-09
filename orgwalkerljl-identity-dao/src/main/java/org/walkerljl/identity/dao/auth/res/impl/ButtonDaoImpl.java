package org.walkerljl.identity.dao.auth.res.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.res.ButtonDao;
import org.walkerljl.identity.domain.auth.res.Button;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * ButtonDaoImpl
 * 
 * @author lijunlin
 */
@Repository("buttonDao")
public class ButtonDaoImpl extends BaseDaoImpl<Long, Button> implements ButtonDao {

}
