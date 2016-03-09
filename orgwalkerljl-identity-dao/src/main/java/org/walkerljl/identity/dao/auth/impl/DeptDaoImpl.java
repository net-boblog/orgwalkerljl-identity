package org.walkerljl.identity.dao.auth.impl;

import org.springframework.stereotype.Repository;
import org.walkerljl.identity.dao.auth.DeptDao;
import org.walkerljl.identity.domain.auth.Dept;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * DeptDaoImpl
 * 
 * @author lijunlin
 */
@Repository("deptDao")
public class DeptDaoImpl extends BaseDaoImpl<Long, Dept> implements DeptDao {

}
