package org.walkerljl.identity.sdk.auth.defaults;

import org.walkerljl.identity.sdk.auth.AuthType;
import org.walkerljl.identity.sdk.auth.Authentication;
import org.walkerljl.identity.sdk.auth.Authenticator;

/**
 * 默认的权限验证器
 * 
 * @author lijunlin
 */
public class DefaultAuthenticator implements Authenticator {

	private static final String CODE_SEPERATOR = "-";
	
	/**
	 * 校验权限码的合法性
	 * @param authentication
	 * @return
	 */
	private boolean validateAuthCode(Authentication authentication) {
		return authentication != null && !"".equals(authentication.code());
	}

	@Override
	public AuthType getType(Authentication clazz, Authentication method) {
		AuthType authType = null;
		if (clazz != null && method != null) {
			if (!method.exclude()) {
				authType = method.type();
			}
		} else if (clazz == null && method != null) {
			authType = method.type();
		} else if (clazz != null && method == null) {
			authType = clazz.type();
		}
		return authType;
	}

	@Override
	public String getAuthCode(Authentication clazz, Authentication method) {
		String authCode = "";
		if (validateAuthCode(clazz) && validateAuthCode(method)) {
			authCode = clazz.code() + CODE_SEPERATOR + method.code();
		} else if (!validateAuthCode(clazz) && validateAuthCode(method)) {
			authCode = method.code();
		} else if (validateAuthCode(clazz) && !validateAuthCode(method)) {
			authCode = clazz.code();
		}
		return authCode;
	}
}