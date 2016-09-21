package com.pt.model.bo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/** 
 * 职位管理BO类
 * 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月10日 下午7:35:23 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
public class JobBO {

	// 账号
	private String username;
	
	// 职位名称
	private String jobtitle;
	
	// 发布起始时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String starttime;
	
	// 发布结束时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String endtime;
	
	// 招聘状态
	private Integer status;
	
	// 认证状态
	private Integer isAuthentication;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public Integer getStatus() {
		return status;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsAuthentication() {
		return isAuthentication;
	}

	public void setIsAuthentication(Integer isAuthentication) {
		this.isAuthentication = isAuthentication;
	}
}
