package com.pt.base;

/**
 * 
 * 通用正则表达式
 * 
 * @author vincent han
 * @date 2016年09月01日
 * @version 1.0
 * @copyright XXXXXXXXX,Ltd.copyright 2016
 */
public interface RegexpContants {
	/**手机正则表达式*/
	String MOBIL_EREGEXP = "^1[3|5|7|8|][0-9]{9}$";
	
	/**邮箱正则表达式*/
	String EMAIL_EREGEXP = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
	
	/**身份证正则表达式*/
	String ID_CARD_EREGEXP = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
	
	/**固话正则表达式*/
    String TELEPHONE_EREGEXP = "^(0\\d{2,3}-)?\\d{7,8}(-\\d{3,4})?$";
	
	/**6位商户编号/短信验证码*/
	String MERCHANT_ID_EREGEXP = "^\\d{6}$";
	
	/**经度正则表达式*/
	String LONGITUDE_EREGEXP = "^-?(?:(?:180(?:\\.0{1,6})?)|(?:(?:(?:1[0-7]\\d)|(?:[1-9]?\\d))(?:\\.\\d{1,6})?))$";
	
	/**纬度正则表达式*/
	String LATITUDE_EREGEXP = "^-?(?:90(?:\\.0{1,6})?|(?:[1-8]?\\d(?:\\.\\d{1,6})?))$";
	
	/**密码(6-16位字母、数字)正则表达式*/
//    String PASSWORD_EREGEXP ="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$";
    String PASSWORD_EREGEXP ="^[0-9|A-Z|a-z]{6,16}$";

	/**中文姓名正则表达式*/
	String CHINESE_NAME_EREGEXP = "^[\u4e00-\u9fa5]{2,5}$";
	
	/**金额正则表达式 正整数，不能为小数或者负数*/
	String MONEY_EREGEXP = "^([1-9]\\d*)*$";
	
	/**用户ID正则表达式*/
	String USERID_EREGEXP = "^\\d{1,20}$";
	
	/** 信用卡有效期 MMyy */
	String CARDEXPDATE_EREGEXP = "^([0-1]\\d{3})*$"; 
	
	/** 只能输入数字 0 或 1 */
	String ZERO_OR_ONE_EREGEXP = "^[0-1]{1}$"; 
	
	/** 只能输入数字0-3 */
	String FROM_ZERO_TO_THREE_EREGEXP = "^[0-3]{1}$";
	
	/** 银行卡号 **/
	String BANK_CARD_EREGEXP = "^(\\d{16}|\\d{19})$";
	
	/**年月日 yyyy-mm-dd*/
	String YEAR_MONTH_DAY_EREGXP="^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";

	/** 只能输入男女 */
	String SEX_EREGEXP = "^[男女]$"; 
	
	/**纯数字*/
	String NUMBER_EREGEXP = "^\\d+$";
	
}
