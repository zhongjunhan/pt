package com.pt.common;

/** 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月19日 下午5:52:35 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
public class ActionException extends Exception {
	public String returnMessage;
	public ActionException(String returnMessage){
	this.returnMessage = returnMessage;
	}
	public String getReturnMessage(){
		return this.returnMessage;
	}
}
