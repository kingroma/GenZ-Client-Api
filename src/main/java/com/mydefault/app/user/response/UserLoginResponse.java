package com.mydefault.app.user.response;

import java.sql.Timestamp;

public class UserLoginResponse {
	private String userId ; 
	
	private String userNickname ; 
	
	private String userToken ; 
	
	private String userSi ; 
	
	private String userDong ; 
	
	private String userGu ; 

	private Timestamp registDate ;
	
	private Timestamp updateDate ;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserToken() {
		return userToken;
	}

	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getUserSi() {
		return userSi;
	}

	public void setUserSi(String userSi) {
		this.userSi = userSi;
	}

	public String getUserDong() {
		return userDong;
	}

	public void setUserDong(String userDong) {
		this.userDong = userDong;
	}

	public String getUserGu() {
		return userGu;
	}

	public void setUserGu(String userGu) {
		this.userGu = userGu;
	}

	public Timestamp getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Timestamp registDate) {
		this.registDate = registDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	
	
}
