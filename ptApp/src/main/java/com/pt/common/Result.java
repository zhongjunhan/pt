package com.pt.common;

import java.util.HashMap;

public class Result {

	public static Result ok(String message, Object data) {
		Result r = new Result();
		r.success = "0";
		r.message = message;
		r.data = data;
		return r;
	}

	public static Result error(String message, Object data) {
		Result r = new Result();
		r.success = "1";
		r.message = message;
		r.data = data;
		return r;
	}

	public static Result noAuth() {
		Result r = new Result();
		r.success = "2";
		r.message = "登录超时,请重新登录";
		r.data = new HashMap<String,String>();
		return r;
	}
	
	public static Result userError(String num,String message, Object data){
		Result r = new Result();
		r.success = num;
		r.message = message;
		r.data = data;
		return r;
	}

	private String success;

	private String message;

	private Object data;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// /**
	// * 汉字转unicode
	// *
	// * @param string
	// * @return
	// */
	// public static String string2Unicode(String string) {
	// StringBuffer unicode = new StringBuffer();
	// for (int i = 0; i < string.length(); i++) {
	// char c = string.charAt(i);
	// // 转换为unicode
	// unicode.append("\\u" + Integer.toHexString(c));
	// }
	// String result = unicode.toString();
	// return StringUtil.loadConvert(result.toCharArray(), 0, result.length(),
	// new char[0]);
	// }
	//
	// public static void main(String[] args) {
	// System.out.println(string2Unicode("中国人"));
	// }
}
