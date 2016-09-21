package com.pt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pt.base.Page;
import com.pt.mapper.extend.UserMapperExtend;
import com.pt.model.Resume;
import com.pt.model.User;
import com.pt.model.vo.UserVO;
import com.pt.service.UserService;
import com.pt.utils.DateUtil;

/** 
 * @author Vincent Han
 * @date 2016年8月31日 上午10:29:30 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapperExtend userMapperExtend;
	
	public User findUser(String username, String password) throws Exception {
		return userMapperExtend.findUser(username, password);
	}

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
	 * @create 2016年9月12日 下午12:59:11
	 */
	@Override
	public PageInfo<User> listUsers(Page page, String userName, String mobile,
			String startTime, String endTime, Integer state) throws Exception {
		PageHelper.startPage(page.getCurrentPage(), page.getNumPerPage());
		Date startDate = null;
		if(startTime != null && !"".equals(startTime.trim())){
			startDate = DateUtil.fomatDate(startTime+" 00:00:00","yyyy-MM-dd HH:mm:ss");
		}
		Date endDate = null;
		if(endTime != null && !"".equals(endTime.trim())){
			endDate = DateUtil.fomatDate(endTime+" 23:59:59","yyyy-MM-dd HH:mm:ss");
		}
		if(userName != null && !"".equals(userName.trim())){
			userName = "%"+userName.trim()+"%";
		}else{
			userName = null;
		}
		if(mobile != null && !"".equals(mobile.trim())){
			mobile = "%"+mobile.trim()+"%";
		}else{
			mobile = null;
		}
		List<User> list = userMapperExtend.findAll(userName, mobile, startDate, endDate, state);
		PageInfo<User> pageInfo=new PageInfo<User>(list);
		page.setRowsCount((int) pageInfo.getTotal());
		return pageInfo;
	}

	
}
