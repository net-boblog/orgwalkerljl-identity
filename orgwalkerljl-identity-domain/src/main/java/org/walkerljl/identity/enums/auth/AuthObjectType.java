/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.enums.auth;

/**
 * 授权对象类型
 * 
 * @author lijunlin
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
	
	/** 类型值*/
	private final Integer value;
	/** 类型名称*/
	private final String name;
	
	/**
	 * 私有构造函数
	 * @param value 类型值
	 * @param name 类型名称
	 */
	private AuthObjectType(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	/**
	 * 获取类型值
	 * @return
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * 获取类型名称
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 获取类型对象
	 * @param value
	 * @return
	 */
	public static AuthObjectType getType(Integer value) {
		if (value == null || value.intValue() == 0) {
			return null;
		}
		for (AuthObjectType element : AuthObjectType.values()) {
			if (element.getValue().intValue() == value.intValue()) {
				return element;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return getValue().toString();
	}
}