package com.pt.common;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MD5PasswordEncoder implements PasswordEncoder{

	private Md5PasswordEncoder md5;
	private final Log logger;
	
	public MD5PasswordEncoder(){
		md5 = new Md5PasswordEncoder();
		this.logger = LogFactory.getLog(super.getClass());
	}
	
	@Override
	public String encode(CharSequence rawPassword) {
		return md5.encodePassword(rawPassword.toString(), null);
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		if ((encodedPassword == null) || (encodedPassword.length() == 0)) {
			this.logger.warn("Empty encoded password");
			return false;
		}
		
		String raw = rawPassword.toString();
		if(raw.equals(encodedPassword)){
			return true;
		}
		return encodedPassword.equals(encode(raw));
	}

}
