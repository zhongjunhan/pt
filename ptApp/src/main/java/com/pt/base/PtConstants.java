package com.pt.base;

public class PtConstants {

	public final static String CURRENT_USER = "current_user";

	public final static String SESSIONID_V3 = "sessionId";
	public final static String SESSIONID 	= "sessionID"; // 老版本使用

	// 每页显示的个数
	public final static int PERPAGE = 10;

	// 默认推荐商家活动数量
	public final static int RECOMMENDSTORE_NUM = 15;

	public final static String DATEFORMAT = "yyyy-MM-dd HH:mm";

	// 默认为上海市
	public final static int SH = 828;

	public final static Long LONG_MAXID = 9223372036854775807l;

	public final static int ACT_PERPAGE = 6;
	
	public final static String CATEGORY="教育培训";
	
	// 数据记录更新的版本类型
	public final static int DATA_VER_TYPE = 1; // 区域数据更新版本类型
	
	// 默认根据坐标检索周边商户
	public final static int SEARCH_SHOP_BY_COORDINATE_NUM = 50;
	
	// 默认用户抽奖次数每天3
	public final static int USER_WHEEL_MAX = 3;
	
	// 用户经验值
	public final static int FIRST_INVITER 	= 100; // 直接邀请
	public final static int SECOND_INVITER 	= 20; // 间接邀请
	public final static int MODIFY_NICKNAME	= 100; // 修改昵称
	
	public final static String URL_HOME = "/root/tomcat8/update";
	
	// OSS起始路径 店铺活动等
	public final static String startUrl = "http://lxt-store.";
	
	// OSS起始路径 用户头像
	public final static String headerUrl = "http://lxt-header.";
	
	// OSS起始路径 用户头像
	public final static String activityUrl = "http://lxt-activity.";
	
	// OSS起始路径 社区
	public final static String communityUrl = "http://lxt-community.";
	
	// OSS中间路劲
	public final static String midUrl = "oss-cn-shanghai.aliyuncs.com/";
	
	// OSS水印中间路径
	public final static String watemarkUrl = "img-cn-shanghai.aliyuncs.com/";
	
	// OSSobject对应的水印base64
	public final static String base64 = "c2h1aXlpbi5wbmc=";
	
	// OSS加水印
	public final static String watermarEndUrl = "watermark=1&object=c2h1aXlpbi5wbmc=&t=90&p=9&x=10&y=10";
	
	// OSS大图比例
	public final static String bigImage = "@600h_800w";
	
	// OSS大图比例
	public final static String smallImage = "@120h_200w";
	
	// OSS大图比例
	public final static String headImage = "@60h_60w";
	
}
