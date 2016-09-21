package com.pt.mapper.extend;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pt.model.User;
import com.pt.model.vo.UserVO;

public interface UserMapperExtend {
	UserVO findUser(@Param("username") String username, @Param("password") String password) throws Exception;
	
	/**
	 * 
	 * 列出用户
	 * @param userName
	 * @param mobile
	 * @param startTime
	 * @param endTime
	 * @param state
	 * @return
	 * @throws Exception
	 * @author chenjie
	 * @create 2016年9月12日 下午1:01:39
	 */
	public List<User> findAll(@Param("userName")String userName,
			@Param("mobile")String mobile,@Param("startTime")Date startTime,
			@Param("endTime")Date endTime,@Param("state")Integer state) throws Exception;
}