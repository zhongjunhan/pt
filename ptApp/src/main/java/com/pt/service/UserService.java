package com.pt.service;

import com.github.pagehelper.PageInfo;
import com.pt.base.Page;
import com.pt.model.User;
import com.pt.model.vo.UserVO;

/** 
 * @author Vincent Han
 * @date 2016年8月31日 上午10:29:00 
 * @version 1.0 
 * @copyright lxt,Ltd.copyright 2016
 */
public interface UserService {

	public User findUser(String username, String password) throws Exception;
	
	/**
	 * 
	 * 列出用户
	 * @param page
	 * @param userName
	 * @param mobile
	 * @param startTime
	 * @param endTime
	 * @param state
	 * @return
	 * @throws Exception
	 * @author chenjie
	 * @create 2016年9月12日 下午12:58:09
	 */
	public PageInfo<User> listUsers(Page page,String userName,
			String mobile,String startTime,String endTime,Integer state) throws Exception;
}
