package com.mydefault.app.user.serviceimpl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.mydefault.app.generic.serviceimpl.GenericMapper;
import com.mydefault.app.user.service.UserVO;

@Mapper
public interface UserMapper extends GenericMapper<UserVO>{
	public UserVO login(UserVO entity);
	
	public UserVO getUserByUserToken(String userToken);
	
	public List<UserVO> friend(UserVO userId); 
	
	public List<UserVO> group(UserVO userId); 
	
	public List<UserVO> category(UserVO userId); 
	
	public List<UserVO> ignore(UserVO userId); 
	
	public List<UserVO> follow(UserVO userId); 
}
