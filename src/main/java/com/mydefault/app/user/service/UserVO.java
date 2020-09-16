package com.mydefault.app.user.service;

import java.io.Serializable;

public class UserVO implements Serializable {
	private static final long serialVersionUID = 1L ;
	
	private String userId ; 
	
	private String userPw ; 
	
	private String userToken ; 

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	@Override
	public String toString() {
		return "[UserVO userId=" + userId + ", userPw=" + userPw + ", userToken=" + userToken + "]";
		
	}
}
