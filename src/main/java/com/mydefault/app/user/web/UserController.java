package com.mydefault.app.user.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mydefault.app.common.util.StringUtil;
import com.mydefault.app.generic.response.DefaultResponseMap;
import com.mydefault.app.generic.web.GenericController;
import com.mydefault.app.user.response.UserCategoryResponse;
import com.mydefault.app.user.response.UserFollowResponse;
import com.mydefault.app.user.response.UserFriendResponse;
import com.mydefault.app.user.response.UserGroupResponse;
import com.mydefault.app.user.response.UserIgnoreResponse;
import com.mydefault.app.user.response.UserLoginResponse;
import com.mydefault.app.user.service.UserService;
import com.mydefault.app.user.service.UserVO;

@Controller
@RequestMapping("/user/*")
public class UserController extends GenericController<UserVO,UserService>{
	protected static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	protected UserController() {
		super(UserVO.class , UserService.class);
	}
	
	/** 
	 * [POST] LOGIN 
	 * request example >> http://localhost:8080/app/user/login?userId=guest&userPw=1234
	 * response example >>
	 * {
		  "result": {
		    "userNickname": "guest",
		    "userSi": "인천시",
		    "userGu": "계양구",
		    "userDong": "용종동",
		    "registDate": 1600908867000,
		    "updateDate": 1600908867000,
		    "userToken": "qwerasdf"
		  },
		  "errorMessage": null,
		  "message": null,
		  "status": 200
		}
	 */
	@ResponseBody
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public DefaultResponseMap<UserLoginResponse> login(UserVO entity, HttpServletRequest request ) throws Exception {
		logger.info("Input = {}" , entity);
		DefaultResponseMap<UserLoginResponse> dr = new DefaultResponseMap<UserLoginResponse>();
		
		try {
			UserVO result = service.login(entity);
			logger.info("Query Result = {}" , result);
			if ( result != null 
					&& StringUtil.isNotNullNotEmpty(result.getUserId())
					&& StringUtil.isNotNullNotEmpty(result.getUserPw())
					&& StringUtil.isNotNullNotEmpty(result.getUserToken())
					)  {
				UserLoginResponse ulr = new UserLoginResponse();
				
				ulr.setUserId(result.getUserId());
				ulr.setUserToken(result.getUserToken());
				ulr.setUserNickname(result.getUserNickname());
				ulr.setUserSi(result.getUserSi());
				ulr.setUserGu(result.getUserGu());
				ulr.setUserDong(result.getUserDong());
				ulr.setRegistDate(result.getRegistDate());
				ulr.setUpdateDate(result.getUpdateDate());
				
				dr.setResult(ulr);
				
			} else { 
				dr.setMessage("NOT FOUND");
				dr.setStatus(DefaultResponseMap.NOT_FOUND_RESULT);
			}
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
			dr.setMessage("SERVER ERROR");
			dr.setStatus(DefaultResponseMap.SERVER_ERROR_STATUS);
		}
		
		logger.info("Output = {}",dr);
		return dr ; 
	}
	
	/** 
	 * [GET] FRIEND 
	 * request example >> http://localhost:8080/app/user/friend?userId=guest1
	 * response example >>
	 * {
		  "result": [
		    {
		      "friendId": "guest2",
		      "friendNickname": "guest2",
		      "registDate": 1600911593000,
		      "updateDate": 1600911593000
		    }
		  ],
		  "errorMessage": null,
		  "message": null,
		  "status": 200
		}
	 */
	@ResponseBody
	@RequestMapping(value = "/friend" , method = RequestMethod.GET)
	public DefaultResponseMap<List<UserFriendResponse>> friend(UserVO entity, HttpServletRequest request ) throws Exception {
		logger.info("Input = {}" , entity);
		DefaultResponseMap<List<UserFriendResponse>> dr = new DefaultResponseMap<List<UserFriendResponse>>();
		
		try {
			List<UserVO> result = service.friend(entity);
			logger.info("Query Result = {}" , result);
			if ( result != null )  {
				List<UserFriendResponse> list = new ArrayList<UserFriendResponse>();
				
				for ( UserVO uv : result ) { 
					UserFriendResponse res = new UserFriendResponse();
					res.setFriendId(uv.getFriendId());
					res.setFriendNickname(uv.getFriendNickname());
					res.setRegistDate(uv.getRegistDate());
					res.setUpdateDate(uv.getUpdateDate());
					list.add(res);
				}
				
				dr.setResult(list);
			} else { 
				dr.setMessage("NOT FOUND");
				dr.setStatus(DefaultResponseMap.NOT_FOUND_RESULT);
			}
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
			dr.setMessage("SERVER ERROR");
			dr.setStatus(DefaultResponseMap.SERVER_ERROR_STATUS);
		}
		
		logger.info("Output = {}",dr);
		return dr ; 
	}
	
	
	/** 
	 * [GET] GROUP 
	 * request example >> http://localhost:8080/app/user/group?userId=guest1
	 * response example >>
	 * {
		  "result": [
		    {
		      "groupId": "group1",
		      "groupNickname": "group1",
		      "registDate": 1600914901000,
		      "updateDate": 1600914901000
		    }
		  ],
		  "errorMessage": null,
		  "message": null,
		  "status": 200
		}
	 */
	@ResponseBody
	@RequestMapping(value = "/group" , method = RequestMethod.GET)
	public DefaultResponseMap<List<UserGroupResponse>> group(UserVO entity, HttpServletRequest request ) throws Exception {
		logger.info("Input = {}" , entity);
		DefaultResponseMap<List<UserGroupResponse>> dr = new DefaultResponseMap<List<UserGroupResponse>>();
		
		try {
			List<UserVO> result = service.group(entity);
			logger.info("Query Result = {}" , result);
			if ( result != null )  {
				List<UserGroupResponse> list = new ArrayList<UserGroupResponse>();
				
				for ( UserVO uv : result ) { 
					UserGroupResponse res = new UserGroupResponse();
					res.setGroupId(uv.getGroupId());
					res.setGroupNickname(uv.getGroupNickname());
					res.setRegistDate(uv.getRegistDate());
					res.setUpdateDate(uv.getUpdateDate());
					list.add(res);
				}
				
				dr.setResult(list);
			} else { 
				dr.setMessage("NOT FOUND");
				dr.setStatus(DefaultResponseMap.NOT_FOUND_RESULT);
			}
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
			dr.setMessage("SERVER ERROR");
			dr.setStatus(DefaultResponseMap.SERVER_ERROR_STATUS);
		}
		
		logger.info("Output = {}",dr);
		return dr ; 
	}
	
	/** 
	 * [GET] CATEGORY 
	 * request example >> http://localhost:8080/app/user/category?userId=guest1
	 * response example >>
	 */
	@ResponseBody
	@RequestMapping(value = "/category" , method = RequestMethod.GET)
	public DefaultResponseMap<List<UserCategoryResponse>> category(UserVO entity, HttpServletRequest request ) throws Exception {
		logger.info("Input = {}" , entity);
		DefaultResponseMap<List<UserCategoryResponse>> dr = new DefaultResponseMap<List<UserCategoryResponse>>();
		
		try {
			List<UserVO> result = service.category(entity);
			logger.info("Query Result = {}" , result);
			if ( result != null )  {
				List<UserCategoryResponse> list = new ArrayList<UserCategoryResponse>();
				
				for ( UserVO uv : result ) { 
					UserCategoryResponse res = new UserCategoryResponse();
					res.setCategoryId(uv.getCategoryId());
					res.setCategoryName(uv.getCategoryName());
					res.setCategoryLevel(uv.getCategoryLevel());
					res.setRegistDate(uv.getRegistDate());
					list.add(res);
				}
				
				dr.setResult(list);
			} else { 
				dr.setMessage("NOT FOUND");
				dr.setStatus(DefaultResponseMap.NOT_FOUND_RESULT);
			}
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
			dr.setMessage("SERVER ERROR");
			dr.setStatus(DefaultResponseMap.SERVER_ERROR_STATUS);
		}
		
		logger.info("Output = {}",dr);
		return dr ; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/ignore" , method = RequestMethod.GET)
	public DefaultResponseMap<List<UserIgnoreResponse>> ignore(UserVO entity, HttpServletRequest request ) throws Exception {
		logger.info("Input = {}" , entity);
		DefaultResponseMap<List<UserIgnoreResponse>> dr = new DefaultResponseMap<List<UserIgnoreResponse>>();
		
		try {
			List<UserVO> result = service.category(entity);
			logger.info("Query Result = {}" , result);
			if ( result != null )  {
				List<UserIgnoreResponse> list = new ArrayList<UserIgnoreResponse>();
				
				for ( UserVO uv : result ) { 
					UserIgnoreResponse res = new UserIgnoreResponse();
					res.setIgnoreId(uv.getCategoryId());
					res.setRegistDate(uv.getRegistDate());
					list.add(res);
				}
				
				dr.setResult(list);
			} else { 
				dr.setMessage("NOT FOUND");
				dr.setStatus(DefaultResponseMap.NOT_FOUND_RESULT);
			}
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
			dr.setMessage("SERVER ERROR");
			dr.setStatus(DefaultResponseMap.SERVER_ERROR_STATUS);
		}
		
		logger.info("Output = {}",dr);
		return dr ; 
	}
	
	@ResponseBody
	@RequestMapping(value = "/follow" , method = RequestMethod.GET)
	public DefaultResponseMap<List<UserFollowResponse>> follow(UserVO entity, HttpServletRequest request ) throws Exception {
		logger.info("Input = {}" , entity);
		DefaultResponseMap<List<UserFollowResponse>> dr = new DefaultResponseMap<List<UserFollowResponse>>();
		
		try {
			List<UserVO> result = service.category(entity);
			logger.info("Query Result = {}" , result);
			if ( result != null )  {
				List<UserFollowResponse> list = new ArrayList<UserFollowResponse>();
				
				for ( UserVO uv : result ) { 
					UserFollowResponse res = new UserFollowResponse();
					res.setFollowId(uv.getCategoryId());
					res.setRegistDate(uv.getRegistDate());
					list.add(res);
				}
				
				dr.setResult(list);
			} else { 
				dr.setMessage("NOT FOUND");
				dr.setStatus(DefaultResponseMap.NOT_FOUND_RESULT);
			}
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
			dr.setMessage("SERVER ERROR");
			dr.setStatus(DefaultResponseMap.SERVER_ERROR_STATUS);
		}
		
		logger.info("Output = {}",dr);
		return dr ; 
	}
}
