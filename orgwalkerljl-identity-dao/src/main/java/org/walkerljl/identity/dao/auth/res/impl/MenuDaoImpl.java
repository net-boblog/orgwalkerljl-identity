package org.walkerljl.identity.dao.auth.res.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.walkerljl.commons.collection.MapUtils;
import org.walkerljl.commons.data.model.tree.TreeNode;
import org.walkerljl.identity.dao.auth.res.MenuDao;
import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.smart.dao.impl.BaseDaoImpl;

/**
 * MenuDao
 * 
 * @author lijunlin
 */
@Repository("menuDao")
public class MenuDaoImpl extends BaseDaoImpl<Long, Menu> implements MenuDao {

	public MenuDaoImpl() {
		super.baseNameSpace = "org.walkerljl.identity.dao.auth.res.MenuDao";
	}
	
	@Override
	public List<TreeNode> selectChildNodesByAppIdAndParentId(Long appId, Long parentId) {
		if (appId == null || parentId == null) {
			return null;
		}
		Map<String, Object> params = MapUtils.newHashMap();
		params.put("appId", appId);
		params.put("parentId", parentId);
		return selectList(getNameSpace("selectChildNodesByAppIdAndParentId"), params);
	}
}