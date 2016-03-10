package org.walkerljl.identity.service.auth.res;

import java.util.List;

import org.walkerljl.commons.data.model.tree.TreeNode;
import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.smart.service.BaseService;

/**
 * 菜单业务逻辑接口
 * 
 * @author lijunlin
 */
public interface MenuService extends BaseService<Long, Menu> {

	/**
	 * 根据应用ID和父ID查询孩子节点
	 * @param appId 应用ID
	 * @param parentId 父ID
	 * @return
	 */
	List<TreeNode> queryChildNodesByAppIdAndParentId(Long appId, Long parentId);
	
	List<Menu> queryAuthMenusByResCodeIds(List<Long> resCodeIds);
}
