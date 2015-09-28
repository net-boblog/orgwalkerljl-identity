/*
 * Copyright (c) 2010-2015 www.walkerljl.org All Rights Reserved.
 * The software source code all copyright belongs to the author, 
 * without permission shall not be any reproduction and transmission.
 */
package org.walkerljl.identity.web;

import java.util.Map;

import org.walkerljl.commons.collection.MapUtils;
import org.walkerljl.commons.datetime.DateUtils;
import org.walkerljl.commons.mvc.DefaultMvcSupporter;
import org.walkerljl.commons.service.config.Configurator;
import org.walkerljl.commons.service.config.impl.AbstractConfigurator;

/**
 * CustomizedMvcSupporter 
 *
 * @author lijunlin<walkerljl@qq.com>
 */
public class CustomizedMvcSupporter extends DefaultMvcSupporter {
	
	private static final Map<String, Object> PROPERTIES_MAP = MapUtils.newHashMap();
	
	static {
		PROPERTIES_MAP.put("administrators", "jarvis");
	}
	
	@Override
	public Configurator getConfigurator() {
		return new AbstractConfigurator() {
			@Override
			public Object getProperty(String key) {
				return PROPERTIES_MAP.get(key);
			}
		};
	}
	
	@Override
	public Map<String, Object> getBussinessContext() {
		Map<String, Object> context = MapUtils.newHashMap();
		context.put("dateUtils", DateUtils.class);
		context.put("isLogin", isLogin());
		return context;
	}
}