package com.pt.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {

	public synchronized static String getUniqueCode() {
		Long time = new Date().getTime() / 1000;
		return Long.toHexString(time).toUpperCase();
	}
	
	public synchronized static String getStrongUniqueCode() {
		Long time = new Date().getTime();
		return Long.toHexString(time).toUpperCase();
	}

	// 确保order id是个12位数
	public static String getOrderId(Long id) {
		String idstr = id + "";
		int added = 12 - idstr.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < added; i++) {
			sb.append('0');
		}
		sb.append(idstr);
		return sb.toString();
	}
	/**
	 * <P>把字符串转换成日期</P>
	 * @param value
	 * @param format
	 * @return
	 */
	public static Date convertString2Date(String value, String format) {
		SimpleDateFormat smFormat = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = smFormat.parse(value);
		} catch (Exception e) {
			
		}
		return date;
	}
	
	/**
	 * <P>把日期转换成指定格式的字符串</P>
	 * @param value
	 * @param format
	 * @return
	 */
	public static String convertDate2String(Date date, String format) {
		SimpleDateFormat smFormat = new SimpleDateFormat(format);
		return smFormat.format(date);
	}	
}
