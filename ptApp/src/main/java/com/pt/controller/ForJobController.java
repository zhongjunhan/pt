package com.pt.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pt.base.Page;
import com.pt.common.Result;
import com.pt.model.app.vo.AppCompanyCommentVO;
import com.pt.model.app.vo.AppCompanyVO;
import com.pt.model.app.vo.AppJobVO;
import com.pt.model.vo.CompanyVO;
import com.pt.model.vo.JobVO;

/** 
 * 求职类controller层
 * 
 * @author  作者 vincent han
 * @date 创建时间：2016年9月19日 下午9:39:51 
 * @version 1.0 
 * @copyright pt,Ltd.copyright 2016
 */
@Controller
public class ForJobController extends BaseController{

	/**
	 * 获取求职模块的职位列表（非搜索）
	 * 
	 * @param sessionId
	 * @param page
	 * @param sort 排序（0为综合排序，1为薪资高到低，2为薪资低到高，3为时间近到远，4为时间远到近，5为距离近到远，6为距离远到近）
	 * @param coordinate
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getQZZWList")
	@ResponseBody
	public Object getQZZWList(@RequestParam(value="sessionId", required=false) String sessionId, @RequestParam(value="page",defaultValue="1") Integer page, 
			@RequestParam(value="sort",defaultValue="0") Integer sort, @RequestParam(value="coordinate",required=false) String coordinate,
			HttpServletRequest req) throws Exception{
		
		Page pages = new Page(page, 10);
		
		List<AppJobVO> list = new ArrayList<AppJobVO>();
		
		return Result.ok("", list);
	}
	

	/**
	 * 获取求职模块的职位列表（搜索）
	 * 
	 * @param sessionId
	 * @param page
	 * @param sort 排序（0为综合排序，1为薪资高到低，2为薪资低到高，3为时间近到远，4为时间远到近，5为距离近到远，6为距离远到近）
	 * @param coordinate
	 * @param keyword
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getQZZWSearchList")
	@ResponseBody
	public Object getQZZWSearchList(@RequestParam(value="sessionId", required=false) String sessionId, @RequestParam(value="page",defaultValue="1") Integer page, 
			@RequestParam(value="sort",defaultValue="0") Integer sort, @RequestParam(value="coordinate",required=false) String coordinate,
			@RequestParam(value="keyword") String keyword, HttpServletRequest req) throws Exception{
		
		Page pages = new Page(page, 10);
		
		List<AppJobVO> list = new ArrayList<AppJobVO>();
		
		return Result.ok("", list);
	}
	
	/**
	 * 获取求职模块的公司列表（非搜索）
	 * 
	 * @param sessionId
	 * @param page
	 * @param coordinate
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getQZGSList")
	@ResponseBody
	public Object getQZGSList(@RequestParam(value="sessionId", required=false) String sessionId, @RequestParam(value="page", defaultValue="1") Integer page,
			@RequestParam(value="coordinate",required=false) String coordinate, HttpServletRequest req) throws Exception{
		
		Page pages = new Page(page, 10);
		
		List<AppCompanyVO> list = new ArrayList<AppCompanyVO>();
		
		return Result.ok("", list);
	}
	
	/**
	 * 获取求职模块的公司列表（非搜索）
	 * 
	 * @param sessionId
	 * @param page
	 * @param coordinate
	 * @param keyword
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getQZGSSearchList")
	@ResponseBody
	public Object getQZGSSearchList(@RequestParam(value="sessionId", required=false) String sessionId, @RequestParam(value="page", defaultValue="1") Integer page,
			@RequestParam(value="coordinate",required=false) String coordinate, @RequestParam(value="keyword") String keyword,HttpServletRequest req) throws Exception{
		
		Page pages = new Page(page, 10);
		
		List<AppCompanyVO> list = new ArrayList<AppCompanyVO>();
		
		return Result.ok("", list);
	}
	
	/**
	 * 求职——企业首页——企业评价
	 * 
	 * @param page
	 * @param company
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getQYPJList")
	@ResponseBody
	public Object getQYPJList(@RequestParam(value="page", defaultValue="1") Integer page, @RequestParam(value="company") Integer company, HttpServletRequest req) throws Exception{
		
		Page pages = new Page(page, 10);
		
		List<AppCompanyCommentVO> list = new ArrayList<AppCompanyCommentVO>();
		
		return Result.ok("", list);
	}
	
	/**
	 * 获取企业介绍
	 * 
	 * @param sessionId
	 * @param companyId
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getQYJS")
	@ResponseBody
	public Object getQYJS(@RequestParam(value="sessionId",required=false) String sessionId, @RequestParam(value="companyId") Integer companyId,
			HttpServletRequest req) throws Exception{
		
		List<Map<String, String>> result = new ArrayList<Map<String,String>>();
		
		List<CompanyVO> list = new ArrayList<CompanyVO>();
		
		for(CompanyVO vo:list){
			Map<String, String> map = new HashMap<String, String>();
			
			map.put("isCollect", vo.getIsCollect()+"");
			
			result.add(map);
		}
		
		return Result.ok("", result);
	}
	
	/**
	 * 关键字搜索职位和公司数量
	 * 
	 * @param keyword
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getSearch")
	@ResponseBody
	public Object getSearch(@RequestParam(value="keyword") String keyword, HttpServletRequest req) throws Exception{
		
		Map<String, String> result = new HashMap<String, String>();
		
		result.put("zwNum", "");
		result.put("gsNum", "");
		
		return Result.ok("", result);
	}
	
	/**
	 * 获取公司招聘职位列表
	 * 
	 * @param companyId
	 * @param page
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getGSZPZWList")
	@ResponseBody
	public Object getGSZPZWList(@RequestParam(value="companyId") Integer companyId, @RequestParam(value="page") Integer page,
			HttpServletRequest req) throws Exception{
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		result.put("xysj", "");
		result.put("dzrs", "");
		
		List<JobVO> list = new ArrayList<JobVO>();
		List<Map<String, String>> dataList = new ArrayList<Map<String,String>>();
		
		for(JobVO vo:list){
			Map<String, String> map = new HashMap<String, String>();
			
			dataList.add(map);
		}
		
		result.put("dataList", dataList);
		
		return Result.ok("", result);
	}
	
	/**
	 * 求职——职位详情——关注职位
	 * 
	 * @param sessionId
	 * @param zwId
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="postFollowZW",method=RequestMethod.POST)
	@ResponseBody
	public Object postFollowZW(@RequestParam(value="sessionId") String sessionId, @RequestParam(value="zwId") Integer zwId,
			HttpServletRequest req) throws Exception{
		return null;
	}
	
	/**
	 * 求职——职位详情——申请职位
	 * 
	 * @param sessionId
	 * @param zwId
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="postApply", method=RequestMethod.POST)
	@ResponseBody
	public Object postApply(@RequestParam(value="sessionId") String sessionId, @RequestParam(value="zwId") Integer zwId,
			HttpServletRequest req) throws Exception{
		return null;
	}
	
	/**
	 * 企业首页——关注企业
	 * 
	 * @param sessionId
	 * @param companyId
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="postFollowGS",method=RequestMethod.POST)
	@ResponseBody
	public Object postFollowGS(@RequestParam(value="sessionId") String sessionId, @RequestParam("companyId") Integer companyId,
			HttpServletRequest req) throws Exception{
		return null;
	}
	
	/**
	 * 求职——获取职位详情
	 * 
	 * @param sessionId
	 * @param zwId
	 * @param req
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getZWXQ")
	@ResponseBody
	public Object getZWXQ(@RequestParam(value="sessionId") String sessionId, @RequestParam(value="zwId") Integer zwId,
			HttpServletRequest req) throws Exception{
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<JobVO> list= new ArrayList<JobVO>();
		
		List<Map<String, String>> dataList = new ArrayList<Map<String,String>>();
		
		for(JobVO vo:list){
			
		}
		
		result.put("dataList", dataList);
		
		return Result.ok("", result);
	}
}
