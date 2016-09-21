package com.pt.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.pt.utils.StringUtil;

@Service
public class AppSessionPool {
	private static final Logger log4j = Logger.getLogger(AppSessionPool.class);
	private long SESSION_TIME_OUT = 10 * 3600 *1000; //过期时间：10小时
	private Map<String, Session> sessions = new HashMap<String, Session>();

	@Scheduled(cron = "0 */5 * * * *") //每5分钟检查一下是否有过期的session
	public void check(){
		log4j.info("Start to check sessions, total: " + this.sessions.size());
		long now = System.currentTimeMillis();
		Map<String, Session> sessions = new HashMap<String, Session>(this.sessions);
		for(Entry<String, Session> en : sessions.entrySet()){
			Session s = en.getValue();
			if(s.lastModified + SESSION_TIME_OUT < now){
				this.sessions.remove(en.getKey());
			}
		}
		log4j.info("Finish checking, remaining:" + this.sessions.size());
	}
	
	
	public String createSessionId(String username){
		String sessionId = StringUtil.getStrongUniqueCode();
		Session s = new Session();
		s.lastModified = System.currentTimeMillis();
		s.username = username;
		sessions.put(sessionId, s);
		return sessionId;
	}
	
	public boolean exist(String sessionId){
		
		Session s = sessions.get(sessionId);
		if(s == null){
			return false;
		}
		s.lastModified = System.currentTimeMillis();
		return true;
	}
	
	public String getUsername(String sessionId){
		Session session = sessions.get(sessionId);
		if (session != null) {
			return sessions.get(sessionId).username;	
		}
		return "";
	}
	
	public String getCookie(HttpServletRequest req,String name){
		
		String value = "";
		
		Cookie[] cookies = req.getCookies();
		
		if(cookies!=null){
			for(Cookie cookieTemp : cookies){   
				String cookieIdentity = cookieTemp.getName();
				if(cookieIdentity.equals(name)) {
					value=cookieTemp.getValue();   
				} 
			}
		}
		
		return value;
	}
	
	public void invalidate(String sessionId){
		sessions.remove(sessionId);
	}
	
	public void setAttribute(String sessionId, String key, Object value){
		sessions.get(sessionId).attributes.put(key, value);
	}
	
	public Object getAttribute(String sessionId, String key){
		return sessions.get(sessionId).attributes.get(key);
	}
	
	private static class Session{
		long lastModified;
		String username;
		Map<String, Object> attributes = new HashMap<String, Object>();;
	}
	
}
