/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.domain.auth.res;

/**
 * Api
 * @author lijunlin<walkerljl@qq.com>
 */
public class Api extends BaseRes {

	private static final long serialVersionUID = 1L;
	
	/** API地址*/
	private String address;
	
	public Api() {}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
