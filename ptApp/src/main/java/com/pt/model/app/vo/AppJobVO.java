package com.pt.model.app.vo;

/** 
 * APP 需求职位返回类
 * 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月10日 下午4:52:52 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
public class AppJobVO{
	
	// 职位id
	private String zwId;
	
	// 职位名
	private String zwName;
	
	// 发布时间
	private String time;
	
	// 工资
	private String salary;
	
	// 是否薪资认证（1为是，0为否）
	private String isXZRZ;
	
	// 城市
	private String city;
	
	// 学历
	private String education;
	
	// 性别（男，女，男女不限）
	private String sex;
	
	// 年龄（类似25~40）
	private String age;
	
	// 公司名
	private String company;
	
	// 公司logo图片链接
	private String companyImage;
	
	// 是否直招（1为是，0为否）
	private String isZZ;
	
	// 距离（显示“距2.5km”）
	private String distance;

	public String getZwId() {
		return zwId;
	}

	public void setZwId(String zwId) {
		this.zwId = zwId;
	}

	public String getZwName() {
		return zwName;
	}

	public void setZwName(String zwName) {
		this.zwName = zwName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getIsXZRZ() {
		return isXZRZ;
	}

	public void setIsXZRZ(String isXZRZ) {
		this.isXZRZ = isXZRZ;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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
