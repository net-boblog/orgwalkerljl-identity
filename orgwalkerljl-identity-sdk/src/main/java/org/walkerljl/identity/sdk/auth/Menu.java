package org.walkerljl.identity.sdk.auth;

import java.io.Serializable;

/**
 * 菜单 
 *
 * @author lijunlin
 */
public class Menu implements Serializable {
	
	private static final long serialVersionUID = 1L;

	/** ID*/
	private Long id;
	/** 名称*/
	private String name;
	/** 父ID*/
	private Long parentId;
	/** 是否父菜单*/
	private boolean parent;
	/** 顺序值*/
	private Integer order;
	/** URL*/
	private String url;
	/** ICON*/
	private String icon;
	/** CSS 样式*/
	private String css;
	/** 权限码*/
	private String authCode;
	
	/**
	 * 默认构造函数
	 */
	public Menu() {}
	
	/**
	 * 构造函数
	 * @param name 名称
	 * @param url URL
	 */
	public Menu(String name, String url) {
		this(null, name, null, null, url, url, null, null);
	}
	
	/**
	 * 构造函数
	 * @param id ID
	 * @param name 名称
	 * @param parentId 父ID
	 * @param order 顺序值
	 * @param url URL
	 * @param icon ICON图标
	 * @param css CSS样式
	 */
	public Menu(Long id, String name, Long parentId, Integer order, String url, String icon, String css, String authCode) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.order = order;
		this.url = url;
		this.icon = icon;
		this.css = css;
		this.authCode = authCode;
	}

	/**
	 * 获取ID
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 设置ID
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 获取名称
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置名称
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取父ID
	 * @return
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * 设置父ID
	 * @param parentId
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	/**
	 * 是否父菜单
	 * @return
	 */
	public boolean isParent() {
		return parent;
	}

	/**
	 * 设置是否父菜单
	 * @param parent
	 */
	public void setParent(boolean parent) {
		this.parent = parent;
	}

	/**
	 * 获取顺序值
	 * @return
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * 设置顺序值
	 * @param order
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * 获取URL
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置URL
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取ICON图标
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * 设置ICON图标
	 * @param icon
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * 获取CSS样式
	 * @return
	 */
	public String getCss() {
		return css;
	}

	/**
	 * 设置CSS样式
	 * @param css
	 */
	public void setCss(String css) {
		this.css = css;
	}

	/**
	 * 获取权限码
	 * @return
	 */
	public String getAuthCode() {
		return authCode;
	}

	/**
	 * 设置权限码
	 * @param authCode
	 */
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	
	
}