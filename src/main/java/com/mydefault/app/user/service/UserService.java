package com.mydefault.app.user.service;

import java.util.List;

import com.mydefault.app.generic.service.GenericService;
import com.mydefault.app.user.serviceimpl.UserMapper;

public interface UserService extends GenericService<UserVO,UserMapper>{
	
	public UserVO login(UserVO entity);
	
	public UserVO getUserByUserToken(String userToken) ;
	
	public List<UserVO> friend(UserVO entity) ;
	
	public List<UserVO> group(UserVO entity) ;
	
	public List<UserVO> category(UserVO entity) ; 
	
	public List<UserVO> ignore(UserVO entity) ; 
	
	public List<UserVO> follow(UserVO entity) ; 
}
