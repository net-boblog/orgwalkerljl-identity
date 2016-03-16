/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.domain.auth.res;

import org.walkerljl.db.api.annotation.Column;
import org.walkerljl.db.api.annotation.Entity;

/**
 * 菜单
 * 
 * @author lijunlin
 */
@Entity("auth_res_menu")
public class Menu extends BaseRes {

	private static final long serialVersionUID = 1L;
	
	/** 父ID*/@Column("parent_id")
	private Long parentId;
	/** URL*/@Column("url")
	private String url;
	/** 菜单图标*/@Column("icon")
	private String icon;
	/** 层叠样式*/@Column("css")
	private String css;
	/** 排序值*/@Column("order")
	private Integer order;
	
	//======扩展属性
	/** 是否*/
	private Boolean isParent;
	
	/**
	 * 默认构造函数
	 */
	public Menu() {
		super();
	}

	public Long getParentId() {
		return parentId;
	}
	
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}
}