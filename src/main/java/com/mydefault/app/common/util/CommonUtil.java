package com.mydefault.app.common.util;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

public class CommonUtil {
	public static ModelMap getRedirectPost(HttpServletRequest request, ModelMap model) {

		Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);  
		String key;				
		Object value; 
		if(flashMap != null) { 
			Iterator<String> ir  = flashMap.keySet().iterator(); 
			while(ir.hasNext()){
				key  = (String)ir.next();				
				value = flashMap.get(key);
				model.addAttribute(key, value); 
			}  
		}  
		return model;  
	}
	
	public static ModelAndView getRedirectView(String url) {
		RedirectView rv = new RedirectView(url, true);
		rv.setExposeModelAttributes(false);
		return new ModelAndView(rv);
	}
	
	
	
}