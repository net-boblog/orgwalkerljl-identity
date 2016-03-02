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
	
	/** URL*/@Column("url")
	private String url;
	/** 菜单图标*/@Column("icon")
	private String icon;
	/** 层叠样式*/@Column("css")
	private String css;
	/** 排序值*/@Column("order")
	private Integer order;
	
	//======扩展属性
	
	/**
	 * 默认构造函数
	 */
	public Menu() {
		super();
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
}