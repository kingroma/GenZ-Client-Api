package com.mydefault.app.interest.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mydefault.app.common.util.StringUtil;
import com.mydefault.app.generic.web.GenericController;
import com.mydefault.app.interest.service.InterestService;
import com.mydefault.app.interest.service.InterestVO;

@Controller
@RequestMapping("/interest/*")
public class InterestController extends GenericController<InterestVO,InterestService>{
	protected static final Logger logger = LoggerFactory.getLogger(InterestController.class);
	
	protected InterestController() {
		super(InterestVO.class, InterestService.class);
	}
	
	@RequestMapping(value = "/listAll" , method = RequestMethod.GET)
	public ModelAndView listAll(InterestVO entity, HttpServletRequest request , ModelMap model) throws Exception {
		logger.info("listAll");
		model.addAttribute("status",500);
		try {
			List<InterestVO> result = service.listAll();
			logger.info("Mapper Result = {}" , result);
			model.addAttribute("list",result);
			model.addAttribute("status",200);
			model.remove("interestVO");
		} catch (Exception e) {
			
			StringUtil.exceptionMsg(this.getClass(), e);
		}
		
		return new ModelAndView("jsonView",model);
	}
	
}
