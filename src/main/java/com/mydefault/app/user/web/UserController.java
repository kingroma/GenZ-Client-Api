package com.mydefault.app.user.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mydefault.app.common.util.StringUtil;
import com.mydefault.app.generic.web.GenericController;
import com.mydefault.app.user.service.UserService;
import com.mydefault.app.user.service.UserVO;

@Controller
@RequestMapping("/user/*")
public class UserController extends GenericController<UserVO,UserService>{
	protected static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	protected UserController() {
		super(UserVO.class , UserService.class);
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public ModelAndView login(UserVO entity, HttpServletRequest request , ModelMap model) throws Exception {
		logger.info("login UserVO = {}" , entity);
		try {
			UserVO result = service.login(entity);
			logger.info("Mapper Result = {}" , result);
			if ( result != null )  { 
				model.addAttribute("userToken",result.getUserToken());
			}
			
		} catch (Exception e) {
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		
		return new ModelAndView("jsonView",model);
	}
}
