package org.walkerljl.identity.service.auth.res;

import java.util.List;

import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.smart.service.BaseService;

/**
 * 菜单业务逻辑接口
 * 
 * @author lijunlin
 */
public interface MenuService extends BaseService<Long, Menu> {

	List<Menu> queryAuthMenusByResCodeIds(List<Long> resCodeIds);
}
