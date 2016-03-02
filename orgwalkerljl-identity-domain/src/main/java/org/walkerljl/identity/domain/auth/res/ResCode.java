/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.domain.auth.res;

import org.walkerljl.db.api.annotation.Column;
import org.walkerljl.db.api.annotation.Entity;
import org.walkerljl.smart.domain.BaseDomain;

/**
 * 资源码
 * 
 * @author lijunlin
 */
@Entity("auth_res_code")
public class ResCode extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	/** 应用Id*/@Column("app_id")
	private Long appId;
	/** 资源码名称*/@Column("name")
	private String name;
	/** 资源码编码*/@Column("code")
	private String code;
	/** 父资源码Id*/@Column("parent_id")
	private Long parentId;
	/** 资源类型*/@Column("res_type")
	private Integer resType;
	/** 资源敏感类型*/@Column("sensitive_type")
	private Byte sensitiveType;
	
	/**
	 * 默认构造函数
	 */
	public ResCode() {}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getResType() {
		return resType;
	}

	public void setResType(Integer resType) {
		this.resType = resType;
	}

	public Byte getSensitiveType() {
		return sensitiveType;
	}

	public void setSensitiveType(Byte sensitiveType) {
		this.sensitiveType = sensitiveType;
	}
}