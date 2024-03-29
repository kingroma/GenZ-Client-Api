package com.mydefault.app.generic.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mydefault.app.common.util.ApplicationContextUtils;
import com.mydefault.app.common.util.MyMessageSource;
import com.mydefault.app.generic.service.GenericService;
import com.mydefault.app.generic.serviceimpl.GenericMapper;

public class GenericController<T, S extends GenericService<T, ? extends GenericMapper<T>>> implements ApplicationContextAware, InitializingBean {

	@Resource
    protected MyMessageSource myMessageSource;
	
	protected String urlBase 	= "";	// url정보
		
	protected S service;	
	protected Class<T> voClass;
	protected Class<S> serviceClass;
	protected ApplicationContext applicationContext;
	
	protected GenericController(Class<T> voClass, Class<S> serviceClass) {
		this.voClass = voClass;
		this.serviceClass = serviceClass;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
		
	public void afterPropertiesSet() throws Exception {
		service = (S)ApplicationContextUtils.getBeanByType(applicationContext, serviceClass);
	}

	
}