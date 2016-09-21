package com.pt.model.vo;

import com.pt.model.User;

/** 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月10日 下午3:47:26 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
public class UserVO extends User {

	private int companyid;
	
	private String companyname;

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
}
