package com.pt.model.app.vo;

/** 
 * APP公司VO类
 * 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月19日 下午10:40:52 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
public class AppCompanyVO {

	// 公司id
	private String companyId;
	
	// 在招职位数
	private String zzzwNum;
	
	// 在招人数
	private String zzrsNum;
	
	// 近一个月招聘人数
	private String zprsMonthNum;
	
	// 最近更新时间
	private String time;
	
	// 公司名
	private String company;
	
	// 公司logo图片链接
	private String companyImage;
	
	// 是否直招（1为是，0为否）
	private String isZZ;
	
	// 距离
	private String distance;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getZzzwNum() {
		return zzzwNum;
	}

	public void setZzzwNum(String zzzwNum) {
		this.zzzwNum = zzzwNum;
	}

	public String getZzrsNum() {
		return zzrsNum;
	}

	public void setZzrsNum(String zzrsNum) {
		this.zzrsNum = zzrsNum;
	}

	public String getZprsMonthNum() {
		return zprsMonthNum;
	}

	public void setZprsMonthNum(String zprsMonthNum) {
		this.zprsMonthNum = zprsMonthNum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyImage() {
		return companyImage;
	}

	public void setCompanyImage(String companyImage) {
		this.companyImage = companyImage;
	}

	public String getIsZZ() {
		return isZZ;
	}

	public void setIsZZ(String isZZ) {
		this.isZZ = isZZ;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
}
