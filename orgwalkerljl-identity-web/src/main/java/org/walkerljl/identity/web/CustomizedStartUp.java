/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.web;

import org.walkerljl.commons.mvc.init.DefaultStartUp;

/**
 * CustomizedStartUp 
 *
 * @author lijunlin<walkerljl@qq.com>
 */
public class CustomizedStartUp extends DefaultStartUp {
	
	static  {
		System.setProperty("orgwalkerljl.commons.log", "slf4j");
	}
	@Override
	public void subProcess() {
	
	}
}
