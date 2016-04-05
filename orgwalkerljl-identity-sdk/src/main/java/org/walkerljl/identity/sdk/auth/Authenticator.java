package org.walkerljl.identity.sdk.auth;


/**
 * 权限验证器
 * 
 * @author lijunlin
 */
public interface Authenticator {

	/**
	 * 获取授权类型
	 * @param clazz
	 * @param method
	 * @return
	 */
	AuthType getType(Authentication clazz, Authentication method);
	
	/**
	 * 获取授权码
	 * @param clazz
	 * @param method
	 * @return
	 */
	String getAuthCode(Authentication clazz, Authentication method);
}