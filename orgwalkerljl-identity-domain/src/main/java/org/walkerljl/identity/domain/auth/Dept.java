/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.domain.auth;

/**
 * 部门
 * 
 * @author lijunlin
 */
public class Dept extends BaseAuth {

	private static final long serialVersionUID = 1L;

	/** 父级部门Id*/
	private Long parentId;
	
	public Dept() {}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
}