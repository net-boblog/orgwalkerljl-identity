/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.enums.auth;

/**
 * 授权对象类型
 * @author lijunlin<walkerljl@qq.com>
 */
public enum AuthObjectType {

	/**
	 * 用户
	 */
	USER(1, "用户"),
	
	/**
	 * 应用/接入的业务系统
	 */
	APP(2, "应用");
	
	private int value;
	private String name;
	
	private AuthObjectType(int value, String name) {
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