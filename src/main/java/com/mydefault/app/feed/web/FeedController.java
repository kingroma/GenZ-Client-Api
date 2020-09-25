package com.mydefault.app.feed.web;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mydefault.app.common.util.StringUtil;
import com.mydefault.app.feed.response.FeedResponse;
import com.mydefault.app.feed.service.FeedService;
import com.mydefault.app.feed.service.FeedVO;
import com.mydefault.app.generic.response.DefaultResponseMap;
import com.mydefault.app.generic.web.GenericController;
import com.mydefault.app.user.service.UserService;
import com.mydefault.app.user.service.UserVO;

@Controller
@RequestMapping("/feed/*")
public class FeedController extends GenericController<FeedVO,FeedService>{
	protected static final Logger logger = LoggerFactory.getLogger(FeedController.class);
	
	@Resource
	private UserService userService ; 
	
	protected FeedController() {
		super(FeedVO.class , FeedService.class);
	}
	
	// 최신 인기 구독 
	@ResponseBody
	@RequestMapping(value = "/list/new")
	public DefaultResponseMap<List<FeedResponse>> listNew(FeedVO entity, String userToken){
		logger.info("Input entity = {} , userToken = {}" , entity, userToken);
		DefaultResponseMap<List<FeedResponse>> dr = new DefaultResponseMap<List<FeedResponse>>();
		
		try {
			if ( entity != null && StringUtil.isNotNullNotEmpty(userToken)) {
				UserVO userVO = userService.getUserByUserToken(userToken);
				String requestUserId = userVO.getUserId();
				entity.setRequestUserId(requestUserId);
				
				List<FeedVO> result = service.listNew(entity);
				logger.info("Query Result = {}" , result);
				
				if ( result != null && result.size() > 0 ) { 
					
				} else { 
					dr.setMessage("NOT FOUND");
					dr.setStatus(DefaultResponseMap.NOT_FOUND_RESULT);
				}
			} else { 
				dr.setMessage("PARAM ERROR");
				dr.setStatus(DefaultResponseMap.PARAMETER_ERROR_STATUS);
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
