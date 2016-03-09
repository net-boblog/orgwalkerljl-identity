/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.domain.auth;

import org.walkerljl.db.api.annotation.Column;
import org.walkerljl.db.api.annotation.Entity;

/**
 * 权限部门
 * 
 * @author lijunlin
 */
@Entity("auth_au_dept")
public class Dept extends BaseAuth {

	private static final long serialVersionUID = 1L;

	/** 名称*/@Column("name")
	private String name;
	/** 编码*/@Column("code")
	private String code;
	/** 父Id*/@Column("parent_id")
	private Long parentId;
	/** 全名*/@Column("full_name")
	private String fullName;
	
	public Dept() {}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}