package com.pt.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.pt.common.ActionException;

/**
 * 调用秒滴发送短信工具类
 * 
 * @author Vincent Han
 * @date 2016年8月3日 下午2:19:27 
 * @version 1.0 
 * @copyright lxt,Ltd.copyright 2016
 */
public class SMSSendUtils {

	/**
	 * 执行CNSMS发送验证码
	 * 
	 * @param mobileNo
	 * @param verificationCode
	 * @return
	 * 	100 发送成功
	 *	101 验证失败
	 *	102 短信不足
	 *	103 操作失败
	 *	104 非法字符
	 *	105 内容过多
	 *	106 号码过多
	 *	107 频率过快
	 *	108 号码内容空
	 *	109 账号冻结
	 *	110 禁止频繁单条发送
	 *	111 系统暂定发送
	 *	112 号码不正确
	 *	120 系统升级
	 */
	public static String executeCNSMS(String mobileNo, String content){
		
		// 返回发送结果
		String resultstr = "";
		
		//发送内容
//		String content = "您的验证码为 "+verificationCode+",请于10分钟内完成验证,请勿将验证码泄露给他人!";
		
		// 创建StringBuffer对象用来操作字符串
		StringBuffer sb = new StringBuffer("http://api.wxduanxin.com/?");

		// 向StringBuffer追加用户名
		sb.append("ac=send&uid=70305135");

		// 向StringBuffer追加密码（密码采用MD5 32位 小写）
		sb.append("&pwd=e10adc3949ba59abbe56e057f20f883e");

		// 向StringBuffer追加手机号码
		sb.append("&&mobile="+mobileNo);

		// 向StringBuffer追加消息内容转URL标准码
		sb.append("&content="+URLEncoder.encode(content));
		
		sb.append("&encode=utf8");

		try{
			// 创建url对象
			URL url = new URL(sb.toString());

			// 打开url连接
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// 设置url请求方式 ‘get’ 或者 ‘post’
			connection.setRequestMethod("POST");

			// 发送
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			// 返回发送结果
			String inputline = in.readLine();
			
//			switch(Integer.parseInt(inputline)){
//				case 100:
//					reslutStr = "00000";// 100 发送成功
//					break;
//				case 107:
//					reslutStr = "107";// 107频率过快
//					break;
//				case 108:
//					reslutStr = "108";// 108 号码内容空
//					break;
//				case 112:
//					reslutStr = "112";// 112号码不正确
//					break;
//				case 110:
//					reslutStr = "110";// 110 禁止频繁单条发送
//					break;
//				default:
//					reslutStr = execute(mobileNo,verificationCode);
//			}
			
				resultstr = inputline; // 100 发送成功 107频率过快
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return resultstr;
	}

	public static void main(String[] args) throws ActionException {
		
		try{
			if(!"100".equals(executeCNSMS("17751520035","123456")))
			throw new ActionException("a > b");
			}catch(Exception ae){
				ae.printStackTrace();
			}
	}
}
