package org.walkerljl.identity.service.auth.res;

import java.util.List;

import org.walkerljl.identity.domain.auth.res.Menu;
import org.walkerljl.smart.service.BaseService;

/**
 * MenuService
 * 
 * @author lijunlin
 */
public interface MenuService extends BaseService<Menu, Long> {

	List<Menu> queryAuthMenusByResCodeIds(List<Long> resCodeIds);
}
