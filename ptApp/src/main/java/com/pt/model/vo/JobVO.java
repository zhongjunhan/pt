package com.pt.model.vo;

import com.pt.model.Job;

/** 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月10日 下午4:52:52 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
public class JobVO extends Job{

	private String companyname;
	
	private String username;
	
	private String logo;
	
	private int companySize;
	
	private String companyaddress;

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getCompanySize() {
		return companySize;
	}

	public void setCompanySize(int companySize) {
		this.companySize = companySize;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
}
