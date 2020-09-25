package com.mydefault.app.user.serviceimpl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mydefault.app.common.util.StringUtil;
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
	
	@Override
	public UserVO getUserByUserToken(String userToken) {
		if ( StringUtil.isNotNullNotEmpty(userToken)) {
			return mapper.getUserByUserToken(userToken);
		}
		return null;
	}
	
	@Override
	public List<UserVO> friend(UserVO entity){
		if ( entity != null && StringUtil.isNotNullNotEmpty(entity.getUserId()) ) { 
			return mapper.friend(entity);
		}
		return null;
	}
	
	@Override
	public List<UserVO> group(UserVO entity){
		if ( entity != null && StringUtil.isNotNullNotEmpty(entity.getUserId()) ) { 
			return mapper.group(entity);
		}
		return null;
	}
	
	@Override
	public List<UserVO> category(UserVO entity){
		if ( entity != null && StringUtil.isNotNullNotEmpty(entity.getUserId()) ) { 
			return mapper.category(entity);
		}
		return null;
	}
	
	@Override
	public List<UserVO> ignore(UserVO entity){
		if ( entity != null && StringUtil.isNotNullNotEmpty(entity.getUserId()) ) { 
			return mapper.ignore(entity);
		}
		return null;
	}
	
	@Override
	public List<UserVO> follow(UserVO entity){
		if ( entity != null && StringUtil.isNotNullNotEmpty(entity.getUserId()) ) { 
			return mapper.follow(entity);
		}
		return null;
	}
}
