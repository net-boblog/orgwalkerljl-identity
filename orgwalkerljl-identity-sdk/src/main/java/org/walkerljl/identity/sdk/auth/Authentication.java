package org.walkerljl.identity.sdk.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限注解
 * 
 * @author lijunlin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Authentication {

	/**
	 * 权限验证类型,默认为登录验证
	 * @return
	 */
	AuthType type() default AuthType.LOGIN;
	
	/**
	 * 权限码
	 * @return
	 */
	String code() default "";
	
	/**
	 * 排除当前权限验证
	 * 
	 * @return
	 */
	boolean exclude() default false;
}