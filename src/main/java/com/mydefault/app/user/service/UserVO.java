package com.mydefault.app.user.service;

import java.io.Serializable;

public class UserVO implements Serializable {
	private static final long serialVersionUID = 1L ;
	
	private String userId ; 
	
	private String userPw ; 
	
	private String userToken ; 
	
	private String si ;
	
	private String gu ;
	
	private String dong ; 

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

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public String getGu() {
		return gu;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	@Override
	public String toString() {
		return "[UserVO userId=" + userId + ", userPw=" + userPw + ", userToken=" + userToken + "]";
		
	}
}
