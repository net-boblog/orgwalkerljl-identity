package org.walkerljl.identity.domain.sys;

import org.walkerljl.db.api.annotation.Column;
import org.walkerljl.db.api.annotation.Entity;
import org.walkerljl.smart.domain.JqueryDatatableBaseDomain;

/**
 * 应用配置
 *
 * @author lijunlin
 */
@Entity("idm_config")
public class Config extends JqueryDatatableBaseDomain {

	private static final long serialVersionUID = 1L;
	
	/** 应用ID*/
	@Column("app_id")
	private Long appId;
	/** 名称*/
	@Column("name")
	private String name;
	/** 配置Key*/
	@Column("key")
	private String key;
	@Column("value")/** 配置Value*/
	private String value;
	
	/**
	 * 默认构造函数
	 */
	public Config() {}
	
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

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AppConfig [key=" + key + ", value=" + value + "]";
	}
}