/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.enums.auth;

/**
 * 授权类型
 * @author lijunlin<walkerljl@qq.com>
 */
public enum AuthType {

	/**
	 * 角色授权
	 */
	ROLE(1, "角色授权"),
	
	/**
	 * 岗位授权
	 */
	POST(2, "岗位授权");
	
	private int value;
	private String name;
	
	private AuthType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
}