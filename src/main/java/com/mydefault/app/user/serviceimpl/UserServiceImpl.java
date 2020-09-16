package com.mydefault.app.user.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mydefault.app.generic.serviceimpl.GenericServiceImpl;
import com.mydefault.app.user.service.UserService;
import com.mydefault.app.user.service.UserVO;

@Service
public class UserServiceImpl extends GenericServiceImpl<UserVO, UserMapper> implements UserService {
	protected static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	public UserServiceImpl() {
		super(UserMapper.class);
	}
	
	@Override
	public UserVO login(UserVO entity) {
		
		if ( entity != null && entity.getUserId() != null && entity.getUserPw() != null ) {
			entity = mapper.login(entity);
		}
		
		return entity ; 
		
	}
}