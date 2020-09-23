package com.mydefault.app.interest.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mydefault.app.generic.serviceimpl.GenericServiceImpl;
import com.mydefault.app.interest.service.InterestService;
import com.mydefault.app.interest.service.InterestVO;
import com.mydefault.app.user.serviceimpl.UserServiceImpl;

@Service
public class InterestServiceImpl extends GenericServiceImpl<InterestVO,InterestMapper> implements InterestService{
	
	protected static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	public InterestServiceImpl() { 
		super(InterestMapper.class);
	}
	
	public List<InterestVO> listAll(){
		return mapper.listAll();
	}
}
