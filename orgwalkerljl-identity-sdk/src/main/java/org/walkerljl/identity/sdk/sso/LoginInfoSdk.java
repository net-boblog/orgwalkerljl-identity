package org.walkerljl.identity.sdk.sso;

import java.util.List;

import org.walkerljl.identity.sdk.sso.dto.LoginInfoDto;
import org.walkerljl.identity.sdk.sso.request.LoginInfoRequest;
import org.walkerljl.remoting.api.annotation.RemotingService;
import org.walkerljl.remoting.api.response.RemotingResponse;

/**
 * 登录信息业务接口
 *
 * @author lijunlin
 */
@RemotingService("/loginInfoSdk")
public interface LoginInfoSdk {
	
	/**
	 * 获取登录信息
	 * @param request
	 * @return
	 */
	RemotingResponse<List<LoginInfoDto>> getLoginInfos(LoginInfoRequest request);
}