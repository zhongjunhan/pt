package com.pt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pt.base.ErrorContants;
import com.pt.common.Result;

/**
 * 
 * 基础Controller
 * 
 * @author dancy
 * @date 2016年06月22日
 * @version 1.0
 * @copyright XXXXXXXXX,Ltd.copyright 2016
 */
public class BaseController {

	
	/**
	 * 
	 * 服务器异常处理
	 * 
	 * @param request
	 * @param ex
	 * @return
	 * @throws Exception 
	 */
	@ExceptionHandler
	@ResponseBody
	public Object exp(HttpServletRequest request, Exception ex) throws Exception {
        //输出异常
		ex.printStackTrace();
		return Result.error(ErrorContants.SYS_EXCEPTION, "");
	}
}