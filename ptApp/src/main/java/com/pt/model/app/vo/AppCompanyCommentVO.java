package com.pt.model.app.vo;

/** 
 * APP 求职——企业首页——企业评价VO类
 * 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月19日 下午10:54:08 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
public class AppCompanyCommentVO {

	// 评价id（举报用）
	private String id;
	
	// 评价内容
	private String content;
	
	// 评价时间
	private String time;
	
	// 评价人头像链接
	private String userImage;
	
	// 评价人昵称
	private String nickName;
	
	// 评价人所在公司
	private String company;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
