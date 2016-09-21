package com.pt.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pt.common.AppSessionPool;
import com.pt.common.Result;
import com.pt.model.User;
import com.pt.service.UserService;

/** 
 * 登录部分接口
 * 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月20日 下午8:56:10 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
@Controller
public class UserLoginController extends BaseController{
	
	@Resource
	private UserService userService;
	
	@Autowired
	AppSessionPool pool;

	/**
	 * 登陆
	 * @param phone
	 * @param password
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("postUserLogin")
	@ResponseBody
	public Object postUserLogin(@RequestParam("phone") String phone, String password, HttpServletRequest req) throws Exception{
		
		Map<String,String> result = new HashMap<String,String>();
		if (!StringUtils.isNotBlank(phone)) {
			return Result.error("请输入用户名或手机号", result);
		}
		if (!StringUtils.isNotBlank(password)) {
			return Result.error("请输入密码", result);
		}
		
		User user = userService.findUser(phone, password);
		
		if (user == null) {
			return Result.error("用户名或密码不正确", result);
		}
		
		result.put("sessionId", pool.createSessionId(user.getUsername()));
		result.put("phone", user.getMobile());
		if(user.getGender()){
			result.put("sex", "女");
		}else{
			result.put("sex", "男");
		}
		result.put("email", user.getMail());
		result.put("headerImgUrl", user.getUsername());
		result.put("userName", user.getUsername());
		
		return Result.ok("", result);
	}
}
