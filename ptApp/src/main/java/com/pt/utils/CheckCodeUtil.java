package com.pt.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.pt.common.AppSessionPool;
import com.pt.common.Result;


public class CheckCodeUtil {

	public static Result checkCode(String code, String mobile, String sessionId,AppSessionPool pool){
		
		Map<String,String> returnMap = new HashMap<String,String>();
		
		if (StringUtils.isBlank(code)) {
			return Result.error("请填写验证码",returnMap);
		}

		String mobileCode = pool.getAttribute(sessionId, "mobileCode") + "";
		String phone = pool.getAttribute(sessionId, "mobile") + "";
		long sendMobileCodeTime = 0;
		if(!"".equals(pool.getAttribute(sessionId, "sendMobileCodeTime"))){
			sendMobileCodeTime = Long.parseLong(pool.getAttribute(sessionId, "sendMobileCodeTime") + "");
		}

		if (phone.equals(mobileCode)) {
			return Result.error("请重新获取验证码", returnMap);
		}

		if (!phone.equals(mobile)) {
			return Result.error("请填写接收短信的手机号", returnMap);
		}

		long now = System.currentTimeMillis();
		
		if(sendMobileCodeTime!=0){
			if (sendMobileCodeTime + 3600 * 500 < now) {
				return Result.error("验证码过期，请重新发送验证码", returnMap);
			}
		}

		if (!code.equals(mobileCode)) {
			return Result.error("验证码不正确", returnMap);
		}
		
		pool.setAttribute(sessionId, "mobile", "");
		pool.setAttribute(sessionId, "mobileCode", "");
		pool.setAttribute(sessionId, "sendMobileCodeTime", "");
		
		return Result.ok("", returnMap);
	}
}
