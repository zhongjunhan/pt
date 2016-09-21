package com.pt.model.vo;

import com.pt.model.Company;

public class CompanyVO extends Company{
    private String auditor;
    
    // 是否已关注
    private Integer isCollect;

	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public Integer getIsCollect() {
		return isCollect;
	}
	public void setIsCollect(Integer isCollect) {
		this.isCollect = isCollect;
	}

}