/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.domain.auth.res;

import org.walkerljl.smart.domain.BaseDomain;

/**
 * AppInfoBindIp
 * 
 * @author lijunlin
 */
public class AppInfoBindIp extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	/** 业务系统Id*/
	private Long appInfoId;
	/** 绑定的Ip*/
	private String ip;
	
	public AppInfoBindIp() {}

	public Long getAppInfoId() {
		return appInfoId;
	}

	public void setAppInfoId(Long appInfoId) {
		this.appInfoId = appInfoId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}