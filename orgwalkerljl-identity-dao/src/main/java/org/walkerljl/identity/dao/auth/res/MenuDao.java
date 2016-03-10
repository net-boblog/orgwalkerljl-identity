/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.dao.auth.res;

import java.util.List;

import org.walkerljl.commons.data.model.tree.TreeNode;
import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.smart.dao.BaseDao;

/**
 * 菜单数据访问接口
 * 
 * @author lijunlin
 */
public interface MenuDao extends BaseDao<Long, Menu> {

	/**
	 * 根据应用ID和父ID查询孩子节点	
	 * @param appId 应用ID
	 * @param parentId 父ID
	 * @return
	 */
	List<TreeNode> selectChildNodesByAppIdAndParentId(Long appId, Long parentId);
}
